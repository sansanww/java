package com.it.controller;

import com.it.service.GiftService;
import com.it.entity.Gift;
import com.it.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("")
public class GiftController {
    @Autowired
    GiftService giftService;

    @RequestMapping("chooseGift")
    public ModelAndView chooseGift(){
        ModelAndView mav=new ModelAndView("chooseGift");
        return mav;
    }

    //通过传入的age,gender,style查询gift，并在request中加入record属性
    @RequestMapping("/showGift")
    public String showGift(HttpServletRequest request, HttpServletResponse response){
        int age=Integer.parseInt(request.getParameter("age"));
        int gender=Integer.parseInt(request.getParameter("gender"));
        int style=Integer.parseInt(request.getParameter("style"));

        String customId=request.getParameter("customerId");
        Gift gift=giftService.queryGift(age,gender,style);

        Record record=new Record();
        record.setGift(gift);
        record.setCustomerId(customId);

        giftService.insertRecord(record);
        request.setAttribute("record",record);
        return "showGift";
    }

}
