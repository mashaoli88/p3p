package com.p2p.service.impl;

import com.p2p.mapper.ProductMapper;
import com.p2p.pojo.product.Product;
import com.p2p.service.ProductService;
import com.p2p.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/1/23.
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductMapper productMapper;

    public Response getProductList() {
        List<Product> list = productMapper.selectAll();

        return Response.build().setStatus("1").setData(list); //状态为1，返回数据
    }
}
