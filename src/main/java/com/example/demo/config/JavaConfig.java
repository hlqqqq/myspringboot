package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by heliqing on 2018/11/30.
 */
@Configuration
@ImportResource("classpath*:*.xml")
public class JavaConfig {

//    @Bean
//    public MystartService mystartService(){
//        MystartService mystartService = new MystartService();
//        mystartService.setMsg("我的优先级最高");
//        return mystartService;
//    }
}
