package com.zsp.easyexcel.controller;

import com.alibaba.excel.EasyExcel;
import com.zsp.easyexcel.commen.DemoDataListener;
import com.zsp.easyexcel.dao.UserDao;
import com.zsp.easyexcel.entity.User;
import com.zsp.easyexcel.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService userService;


    /**
     * 从数据库导出
     *
     * @return
     */
    @GetMapping("/user/queryAllExport")
    @ResponseBody
    public String queryAll() {
        List<User> userList = userService.queryAll();
        // 写法1
        String fileName = "E:\\" + "模板.xls";
        EasyExcel.write(fileName, User.class).sheet("模板").doWrite(userList);
        return null;
    }


    /**
     * 导入数据库
     */
    @GetMapping("/user/queryAllImport")
    @ResponseBody
    public String queryAllImport() {
        String fileName = "E:\\" + "模板.xls";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, User.class, new DemoDataListener(userService)).sheet().doRead();

        return null;
    }

}
