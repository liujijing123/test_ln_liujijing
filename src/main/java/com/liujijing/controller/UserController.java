package com.liujijing.controller;

import com.github.pagehelper.PageInfo;
import com.liujijing.pojo.UserExBean;
import com.liujijing.service.UserExService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 本类作者：刘计静
 * 创建时间：2021/12/29 8:55
 * 本类作用：xxx
 */
@RequestMapping("user")
@RestController
public class UserController {
    @Resource
    private UserExService userExService;
    @RequestMapping("getAll")
    public PageInfo getAll(@RequestBody  UserExBean userExBean,
                           @RequestParam(defaultValue = "1") Integer pageNum,
                           @RequestParam(defaultValue = "3") Integer pageSize){
        int roomType = userExBean.getRoomType();
        return userExService.getAll(roomType, pageNum, pageSize);
    }
    @RequestMapping("getType")
    public List<UserExBean> getType(){
        return userExService.getRoomType();
    }
    @RequestMapping("getHuiXian")
    public UserExBean getHuiXian(Integer roomId){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        UserExBean huiXian = userExService.getHuiXian(roomId);
        huiXian.setUserInDate(format);
        return huiXian;
    }
    @RequestMapping("addUser")
    public String addUser(@RequestBody UserExBean userExBean){
        String s = userExService.addUser(userExBean);
        return s;

    }
}
