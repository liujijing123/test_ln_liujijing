package com.liujijing.mapper;

import com.liujijing.pojo.UserExBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserExMapper {

    List<UserExBean> getAll(@Param("roomType") Integer roomType);

    List<UserExBean> getRoomType();

    UserExBean getHuiXian(Integer roomId);//房间回显数据

    int addUser(UserExBean userExBean);//添加user表

    void  addFang(UserExBean userExBean);//添加开房表
}
