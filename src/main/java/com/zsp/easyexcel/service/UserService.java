package com.zsp.easyexcel.service;

import com.zsp.easyexcel.entity.User;

import java.util.List;

public interface UserService {

    List<User> queryAll();

    void save(List<User> list);
}
