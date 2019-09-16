package com.ddu.web;

import com.ddu.dto.AppointExecution;
import com.ddu.dto.Result;
import com.ddu.entity.Book;
import com.ddu.enums.AppointStateEnum;
import com.ddu.exception.NoNumberException;
import com.ddu.exception.RepeatAppointException;
import com.ddu.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookService bookService;

    @RequestMapping(value="/doAppoint")
    private String doAppoint(Model model){
        List<Book> list=bookService.getList();
        model.addAttribute("list",list);
        return "doAppoint";
    }

    @RequestMapping(value="/list")
    private String list(Model model){
        List<Book> list=bookService.getList();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping(value="/{bookId}/detail",method =RequestMethod.GET)
    private String detail(@PathVariable("bookId") Long bookId,Model model){
        if(bookId == null){
            return "redirect:list";
        }
        Book book = bookService.getById(bookId);
        if(book == null){
            return "forward:list";
        }
        model.addAttribute("book",book);
        return "detail";
    }

    @RequestMapping(value="/{bookId}/appoint",method = RequestMethod.POST,produces=
            {"application/json;charset=utf-8"} )
    @ResponseBody
    private Result<AppointExecution> appoint(@PathVariable("bookId") Long bookId,
                                             @RequestParam("studentId") Long studentId){
        if(studentId == null || studentId.equals("")){
            return new Result<AppointExecution>(false,"学号不能为空");
        }
        AppointExecution execution = null;
        try{
            execution = bookService.appoint(bookId,studentId);
        }catch(NoNumberException e1) {
            execution = new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);
        }catch(RepeatAppointException e2) {
            execution = new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT);
        }catch(Exception e) {
            execution = new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);
        }
        return new Result<AppointExecution>(true,execution);
    }
}
