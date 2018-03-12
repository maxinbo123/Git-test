package com.example.test;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.example.test.impl.NotifyImpl;
import com.example.test.service.CallbackListener;
import com.example.test.service.CallbackService;
import com.example.test.service.DemoService;
import com.example.test.service.FooService;
import com.example.test.service.IDemoService;

import junit.framework.Assert;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.example.test"})
public class DubboClientApplication {

	public static void main(String[] args) throws Exception{
		
        ConfigurableApplicationContext run = SpringApplication.run(DubboClientApplication.class, args);
       
        
        DemoService demoService = run.getBean(DemoService.class);
        String str = demoService.getHello(" ming");
        System.out.println(str);
      
        
        
        
        /* //事件通知
        IDemoService demoService = run.getBean(IDemoService.class);
        NotifyImpl notify = (NotifyImpl) run.getBean("notify");
        
        int requestId = 2;
        
        Integer id = demoService.get(2);
        
        // for test 只是用来说明callback正常被调用， 业务具体实现自行决定
        for(int i = 0; i<10; i++){
        	if(!notify.ret.containsKey(requestId)){
        		Thread.sleep(200);
        	}else{
        		break;
        	}
        	
        	System.out.println(i);
        }*/
        
        
        
        
        
        
        
       /* CallbackService callService = run.getBean(CallbackService.class);
        callService.allListener("hello", new CallbackListener(){

			@Override
			public void changed(String msg) {
				System.out.println("callback1:" + msg);
			}
        	
        });*/
        
        
        
        
       /* FooService fooService = run.getBean(FooService.class);
        String foo1 = fooService.findFoo(" xiao lan");
        System.out.println("foo:"+foo1);
        
        Future<String> demoString = RpcContext.getContext().getFuture();
        String str2 = demoString.get();
        System.out.println("foo:" + str2);
        
        DemoService demoService = run.getBean(DemoService.class);
        String demo1 = demoService.getHello(" xiao hei");
        System.out.println("demo:" + demo1);
        
        Future<String> fooString = RpcContext.getContext().getFuture();
        String str = fooString.get();
        System.out.println("demo:" + str);*/
        
       
        
        
        
       /* boolean is = RpcContext.getContext().isConsumerSide();
        if(is){
        	System.out.println("是消费者");
        }else{
        	System.out.println("不是");
        }
        
        String serverIp = RpcContext.getContext().getRemoteHost();
        System.out.println(serverIp);
        
        String application = RpcContext.getContext().getUrl().getParameter("application");
        System.out.println(application);*/
        
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
