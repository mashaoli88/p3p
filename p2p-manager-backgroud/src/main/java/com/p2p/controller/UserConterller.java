package com.p2p.controller;

import com.p2p.service.UserService;
import com.p2p.util.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/1/23.
 */
@RestController    //注释的作用是可以直接返回Json数据
public class UserConterller {

    @Resource
    private UserService userService;

    //登录
    @RequestMapping("/account/login")
    public Response login(String username,String password){
        return userService.login(username,password);
    }
}
