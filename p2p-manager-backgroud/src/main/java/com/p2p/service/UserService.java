package com.p2p.service;

import com.p2p.util.Response;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/1/23.
 */
public interface UserService {


    Response login(String username, String password);
}
