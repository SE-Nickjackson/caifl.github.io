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
@RequestMapping({"/", "", "/index"})
public class IndexControlller {

    @RequestMapping({"","/"})
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
