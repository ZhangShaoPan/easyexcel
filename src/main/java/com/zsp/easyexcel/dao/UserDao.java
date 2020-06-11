package com.zsp.easyexcel.dao;

import com.zsp.easyexcel.entity.User;

import java.util.List;

public interface UserDao {


    List<User> queryAll();

    void save(List<User> list);

}
