package com.fua.caifl.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @name: IndexControlller
 * @date: 2021/1/11 14:57
 * @author: nick_jackson
 * @describtion: 首页登录Controller类
 **/
@Controller
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

}
