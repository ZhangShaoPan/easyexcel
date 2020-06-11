package com.zsp.easyexcel.service.impl;

import com.zsp.easyexcel.dao.UserDao;
import com.zsp.easyexcel.entity.User;
import com.zsp.easyexcel.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;


    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public void save(List<User> list) {
        userDao.save(list);
    }

}
