package com.liujijing.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liujijing.mapper.UserExMapper;
import com.liujijing.pojo.UserExBean;
import com.liujijing.service.UserExService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 本类作者：刘计静
 * 创建时间：2021/12/29 8:56
 * 本类作用：xxx
 */
@Service
public class UserImpl implements UserExService {
    @Resource
    private UserExMapper exMapper;

    @Override
    public PageInfo getAll(Integer roomType, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<UserExBean> all = exMapper.getAll(roomType);
        PageInfo<UserExBean> userExBeanPageInfo = new PageInfo<>(all);
        return userExBeanPageInfo;
    }

    @Override
    public List<UserExBean> getRoomType() {
        return exMapper.getRoomType();
    }

    @Override
    public UserExBean getHuiXian(Integer roomId) {
        return exMapper.getHuiXian(roomId);
    }

    @Override
    public String addUser(UserExBean userExBean) {
        int i = exMapper.addUser(userExBean);
        if(i>0){
            int userId = userExBean.getUserId();
            userExBean.setUserId(userId);
            System.out.println(userExBean);
            exMapper.addFang(userExBean);
            return "ok";
        }else {
            return "no";
        }
    }
}
