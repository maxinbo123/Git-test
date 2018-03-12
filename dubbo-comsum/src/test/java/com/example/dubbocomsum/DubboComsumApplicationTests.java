package com.example.dubbocomsum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.consum.FooTestService;
import com.example.test.DubboApiApplication;
import com.example.test.service.FooService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboComsumApplicationTests {

	@Autowired
	private FooTestService FooTestService;
	
	@Test
	public void contextLoads() {
	    
	    String str = FooTestService.demoService.findFoo("orrffsoo");
		System.out.println(str);
	}

}
