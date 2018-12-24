package com.example.demo.controller;

import com.example.demo.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mystart.hlq.MystartService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heliqing on 2018/11/7.
 * 文档: http://localhost:8080/swagger-ui.html#/
 */
@RestController
public class DemoController {



    @Autowired
    private MystartService mystartService;

    @ApiOperation(value = "hello",notes = "good")
    @RequestMapping("/")
    public String demo(){

        return mystartService.export(mystartService.getMsg());
    }

    @ApiOperation(value = "获取用户",notes = "呵呵，谁知道呢")
    @RequestMapping("queryUser")
    public String queryUser(){
        List<User> u = new ArrayList<User>();
        u.add(User.getUser());
        try {
            return new ObjectMapper().writeValueAsString(u);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
