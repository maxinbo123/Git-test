package com.example;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.test.DubboApiApplication;
import com.example.test.service.FooService;

@SpringBootApplication
public class DubboComsumApplication {
	
	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DubboApiApplication.class, args);
	       
		FooService demoService = run.getBean(FooService.class);
        String str = demoService.findFoo("Api");
        System.out.println(str);
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
