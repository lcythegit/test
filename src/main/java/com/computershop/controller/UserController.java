package com.computershop.controller;

import com.computershop.model.Users;
import com.computershop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
private     UserService userService;
    @RequestMapping("/insert")
    public String addUsers(Users users){
        this.userService.addUser(users);
        return"store";
    }
    @RequestMapping("/{page}")
    public String restful(@PathVariable String  page ){
        return  page;
    }
}
