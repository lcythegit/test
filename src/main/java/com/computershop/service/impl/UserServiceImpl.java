package com.computershop.service.impl;

import com.computershop.mapper.UsersMapper;
import com.computershop.model.Users;
import com.computershop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
   private UsersMapper usersMapper;



    @Override
    public void addUser(Users users) {
       this.usersMapper.insert(users);
    }
}
