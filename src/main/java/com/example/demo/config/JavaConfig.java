package com.example.demo.config;

import com.mystart.hlq.MystartService;
import org.springframework.context.annotation.Bean;

/**
 * Created by heliqing on 2018/11/30.
 */
//@Configuration
public class JavaConfig {

    @Bean
    public MystartService mystartService(){
        MystartService mystartService = new MystartService();
        mystartService.setMsg("我的优先级最高");
        return mystartService;
    }
}
