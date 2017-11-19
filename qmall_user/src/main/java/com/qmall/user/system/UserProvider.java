package com.qmall.user.system;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 服务提供者
 */
public class UserProvider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:user-provider.xml");
        context.start();
        System.in.read();
    }
}
