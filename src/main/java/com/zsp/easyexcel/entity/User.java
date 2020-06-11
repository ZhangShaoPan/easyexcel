package com.zsp.easyexcel.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private int id;
    private String username;
    private String phone;
    private String password;
    private String salt;
    private String head;
    private int logincount;
    private Date registerdate;
    private Date lastlogindate;


}
