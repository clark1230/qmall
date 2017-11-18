package com.qmall.controller.user;

import com.qmall.user.system.entity.User;
import com.qmall.user.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping(value="addUser")
    @ResponseBody
    public String addUser(User user){
        return  iUserService.add(user)+"";
    }
}
