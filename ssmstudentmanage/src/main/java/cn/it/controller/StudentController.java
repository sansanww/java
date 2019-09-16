package cn.it.controller;


import cn.it.entity.Student;
import cn.it.service.StudentService;
import cn.it.util.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Pageable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;



@Controller
@RequestMapping("")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    SimpleDateFormat Const = new SimpleDateFormat ("yyyy-MM-dd");

    @RequestMapping("/listStudent")
    public String listStudent(HttpServletRequest request, HttpServletResponse response) {

        // 获取分页参数
        int start = 0;
        int count = 10;

        try {
            start = Integer.parseInt(request.getParameter("page.start"));
            count = Integer.parseInt(request.getParameter("page.count"));
        } catch (Exception e) {
        }

        Page page = new Page(start, count);

        List<Student> students = studentService.list(page.getStart(), page.getCount());
        int total = studentService.getTotal();
        page.setTotal(total);

        request.setAttribute("students", students);
        request.setAttribute("page", page);

        return "listStudent";
    }

    @RequestMapping("/addStudent")
    public String addStudent(HttpServletRequest request, HttpServletResponse response) {

        Student student = new Student();

        int studentID = Integer.parseInt(request.getParameter("student_id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String sex = request.getParameter("sex");
        Date birthday = null;
        try {
            birthday = Const.parse(request.getParameter("birthday"));
        } catch (ParseException e) {
            logger.error(e.getMessage());

        }

        student.setStudent_id(studentID);
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        student.setBirthday(birthday);

        studentService.addStudent(student);

        return "redirect:listStudent";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(int id) {
        studentService.deleteStudent(id);
        return "redirect:listStudent";
    }

    @RequestMapping("/editStudent")
    public ModelAndView editStudent(int id) {
        ModelAndView mav = new ModelAndView("editStudent");
        Student student = studentService.getStudent(id);
        mav.addObject("student", student);
        return mav;
    }

    @RequestMapping("/showAddStudent")
    public ModelAndView showAddStudent() {
        ModelAndView mav = new ModelAndView("showAddStudent");
        return mav;
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(HttpServletRequest request, HttpServletResponse response) {

        Student student = new Student();

        int id = Integer.parseInt(request.getParameter("id"));
        int studentId = Integer.parseInt(request.getParameter("student_id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String sex = request.getParameter("sex");

        Date birthday = null;
        try {
            birthday = Const.parse(request.getParameter("birthday"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        student.setId(id);
        student.setStudent_id(studentId);
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        student.setBirthday(birthday);

        studentService.updateStudent(student);
        return "redirect:listStudent";
    }
}