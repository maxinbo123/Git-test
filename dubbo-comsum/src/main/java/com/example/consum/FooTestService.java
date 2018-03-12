package com.example.consum;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import com.example.test.DubboApiApplication;
import com.example.test.service.FooService;

@Service
public class FooTestService {

    
	public FooService demoService = SpringApplication.run(DubboApiApplication.class).getBean(FooService.class);
	
	public void test(){
	}
}
