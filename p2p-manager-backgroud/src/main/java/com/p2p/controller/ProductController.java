package com.p2p.controller;

import com.p2p.service.ProductService;
import com.p2p.util.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/1/23.
 */
@RestController
public class ProductController {
    @Resource
    private ProductService productService;
    //需求分析，返回状态为1，查询出数据返回

    @RequestMapping("/product/findAllProduct")
    public Response getProductList(){
        return productService.getProductList();
    }
}
