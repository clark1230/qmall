package com.qmall.controller.user;

import com.qmall.annotation.SystemLog;
import com.qmall.user.entity.User;
import com.qmall.user.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private IUserService iUserService;


    @SystemLog(module = "user",method = "addUser",msg = "跳转到添加用户页面")
    @RequestMapping(value="addUser")
    @ResponseBody
    public String addUser(User user){
        return  "1";//iUserService.add(user)+"";
    }
}
