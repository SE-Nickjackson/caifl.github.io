package com.fua.caiflblog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @name: IndexControlller
 * @date: 2021/1/11 14:57
 * @author: nick_jackson
 * @describtion: 首页登录Controller类
 **/
@Controller
@RequestMapping("/blog")
public class PageControlller {

    @RequestMapping({"","/","/index"})
    public String  index(){
        return "index";
    }

    @RequestMapping("/elements")
    public String elemets(){
        return "elements";
    }


    @RequestMapping("/generic")
    public String generic(){
        return "generic";
    }


    @RequestMapping("/blog")
    public String blog(){
        return "blog-index";
    }

    @RequestMapping("/blog-list")
    public String blogList(){
        return "blog-list";
    }
}
