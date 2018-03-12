package com.example.test;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.test.service.FooService;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.example.test"})
public class DubboApiApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext run = SpringApplication.run(DubboApiApplication.class, args);
	       
	        
	        FooService demoService = run.getBean(FooService.class);
	        String str = demoService.findFoo("lan");
	        System.out.println(str);
	        
	        try {
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
