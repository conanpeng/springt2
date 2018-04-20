package com.conan.c1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author huangjinsheng on 2017/11/9.
 */
public class SpringStarter {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.conan.c1");
        UserService userService = context.getBean("userService",UserService.class);
        System.out.println(userService.getUserId());
    }
}
