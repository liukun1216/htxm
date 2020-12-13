package com.zking.ssm.controller;

import com.zking.ssm.model.User;
import com.zking.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    IUserService userService;

    @RequestMapping("/login")
    public User login(String username,String password){
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);
        User user = userService.listByUserName(u);

        return user;
    }
}
