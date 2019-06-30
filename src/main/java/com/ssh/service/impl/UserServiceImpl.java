package com.ssh.service.impl;

import com.ssh.dao.UserDao;
import com.ssh.pojo.User;
import com.ssh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public void save(User user) {

         userDao.save(user);
    }
}
