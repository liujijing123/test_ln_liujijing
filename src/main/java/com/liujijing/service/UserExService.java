package com.liujijing.service;

import com.github.pagehelper.PageInfo;
import com.liujijing.pojo.UserExBean;

import java.util.List;

public interface UserExService {
    PageInfo getAll(Integer roomType, Integer pageNum, Integer pageSize);//全查加分页

    List<UserExBean> getRoomType();//房间类型

    UserExBean getHuiXian(Integer roomId);//房间回显数据

    String addUser(UserExBean userExBean);//添加user表


}
