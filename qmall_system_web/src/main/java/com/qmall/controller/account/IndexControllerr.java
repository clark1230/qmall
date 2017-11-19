package com.qmall.controller.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexControllerr {
    /**
     * 跳转到系统主页
     * @return
     */
    @RequestMapping(value = {"/","/index"},method = RequestMethod.GET)
    public String index(){
        return "index";
    }


}
