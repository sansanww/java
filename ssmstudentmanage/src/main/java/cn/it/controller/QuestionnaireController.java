package cn.it.controller;

import cn.it.entity.Questionnaire;
import cn.it.entity.Student;
import cn.it.service.QuestionnaireService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("")
public class QuestionnaireController {
    @Autowired
    private QuestionnaireService questionnaireService;

    private static final Logger logger = LoggerFactory.getLogger(QuestionnaireController.class);

    @RequestMapping("/ResultOfQuestionnaire")
    public String listQuestionnaire(HttpServletRequest request, HttpServletResponse response){
        int student_id=Integer.parseInt(request.getParameter("student_id"));
        Questionnaire questionnaire=new Questionnaire();
        if(questionnaireService.getCount(student_id) == 0){
            questionnaire.setStudent_id(student_id);
        }else {
            questionnaire = questionnaireService.selectQuestionnaire(student_id);
        }
        request.setAttribute("questionnaire",questionnaire);
        return "ResultOfQuestionnaire";
    }

    @RequestMapping("/addQuestionnaire")
    public String addQuestionnaire(HttpServletRequest request, HttpServletResponse response, RedirectAttributes redirectAttribute){
        Questionnaire questionnaire = new Questionnaire();
        int studentId=Integer.parseInt(request.getParameter("student_id"));
        String extraversion=request.getParameter("extraversion");
        String socialSkills=request.getParameter("socialSkills");
        questionnaire.setStudent_id(studentId);
        questionnaire.setExtraversion(extraversion);
        questionnaire.setSocialSkills(socialSkills);
        if(questionnaireService.getCount(studentId ) == 1){
            questionnaireService.updateQuestionnaire(questionnaire);
        }else{
            questionnaireService.addQuestionnaire(questionnaire);
        }


        redirectAttribute.addAttribute("student_id",studentId);
        return "redirect:ResultOfQuestionnaire";
    }

    @RequestMapping("/doQuestionnaire")
    public ModelAndView doQuestionnaire(int student_id){
        ModelAndView mav=new ModelAndView("doQuestionnaire");
        mav.addObject("student_id",student_id);
        return mav;
    }

    @RequestMapping("/deleteQuestionnaire")
    public String deleteQuestionnaire(int student_id,RedirectAttributes redirectAttribute){
        questionnaireService.deleteQuestionnaire(student_id);
        redirectAttribute.addAttribute("student_id",student_id);
        return "redirect:ResultOfQuestionnaire";
    }

    @RequestMapping("/editQuestionnaire")
    public ModelAndView editQuestionnaire(int student_id){
        ModelAndView mav=new ModelAndView("editQuestionnaire");
        Questionnaire questionnaire=questionnaireService.selectQuestionnaire(student_id);
        mav.addObject(questionnaire);
        return mav;
    }

    @RequestMapping("/updateQuestionnaire")
    public String updateQuestionnaire(HttpServletRequest request, HttpServletResponse response,RedirectAttributes redirectAttribute){
        Questionnaire questionnaire = new Questionnaire();
        int student_id=Integer.parseInt(request.getParameter("student_id"));
        String extraversion=request.getParameter("extraversion");
        String socialSkills=request.getParameter("socialSkills");
        questionnaire.setStudent_id(student_id);
        questionnaire.setExtraversion(extraversion);
        questionnaire.setSocialSkills(socialSkills);
        questionnaireService.updateQuestionnaire(questionnaire);

        redirectAttribute.addAttribute("student_id",student_id);

        return "redirect:ResultOfQuestionnaire";
    }


}
