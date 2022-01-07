package com.liujijing.controller;

import com.liujijing.utils.ResultInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 本类作者：刘计静
 * 创建时间：2021/12/30 18:35
 * 本类作用：xxx
 */
@RequestMapping("test")
@RestController
public class TestController {

    @RequestMapping("test11")
    public ResultInfo getTest1(){
        return new ResultInfo(true,"测试成功");
    }
}
