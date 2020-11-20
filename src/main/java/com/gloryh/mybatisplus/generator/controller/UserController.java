package com.gloryh.mybatisplus.generator.controller;


import com.gloryh.mybatisplus.generator.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 黄光辉
 * @since 2020-10-11
 */
@Controller
@RequestMapping("/generator/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list",userService.list());
        return modelAndView;
    }

}

