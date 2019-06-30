package com.sym;

import com.sym.service.HelloServiceI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationConsumer.xml" });
        context.start();
        HelloServiceI service = (HelloServiceI) context.getBean("helloService");
        System.out.println(service.sayHello("world222"));
        context.close();
    }

}
