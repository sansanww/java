package com.ddu.web;

import com.ddu.entity.Gift;
import com.ddu.entity.Record;
import com.ddu.service.GiftService;
import com.ddu.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;

@Controller
@RequestMapping("")
public class RecordController {
    @Autowired
    private RecordService recordService;
    @Autowired
    private GiftService giftService;

    @RequestMapping("/result")
    public String result(HttpServletRequest request, HttpServletResponse response){
        Random random = new Random();
        int id=random.nextInt(10);
        Gift gift=giftService.queryGiftById(id);
        request.setAttribute("gift",gift);
        return "result";
    }

    @RequestMapping("/addRecord")
    public String addRecord(HttpServletRequest request, HttpServletResponse response){
        Record record=new Record();
        record.setFrequency(Integer.parseInt(request.getParameter("frequency")));
        record.setHours(Integer.parseInt(request.getParameter("hours")));
        record.setName(request.getParameter("name"));
        record.setPhoneNumber(request.getParameter("phoneNumber"));
        recordService.addRecord(record);
        return "redirect:result";
    }

    @RequestMapping("/record")
    public ModelAndView record(){
        ModelAndView mav=new ModelAndView("record");
        return mav;
    }

}
