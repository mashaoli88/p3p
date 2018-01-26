package com.p2p.service.impl;

import com.p2p.mapper.TbAdminUserMapper;
import com.p2p.pojo.admin.TbAdminUser;
import com.p2p.service.UserService;
import com.p2p.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/1/23.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private TbAdminUserMapper tbAdminUserMapper;

    public Response login(String username, String password) {
        TbAdminUser tbAdminUser = tbAdminUserMapper.selectUser(username,password);
        if(tbAdminUser!=null){
            return Response.build().setStatus("1");
        }else {
            return Response.build().setStatus("0");
        }
    }
}
