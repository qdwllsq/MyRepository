package com.itheima;

import org.springframework.boot.Banner;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
* <p>Title: SpringBootApplicationRunner</p>  
* <p>Description: SpringBoot的启动类</p>  
* @author zhaocq 
* @date 2018年9月6日
* 1. 为什么要把启动类放到base包下？
*    当SpringBoot工程启动的时候它自动扫描启动类所在包下及其子包下的所有内容
 */
@SpringBootApplication
@EnableCaching// 支持缓存
public class SpringBootApplicationRunner {

	public static void main(String[] args) {
		/**
		 * 通过将启动类的字节码传入springBoot核心容器，再通过解析注解来创建Spring IOC 容器
		 *  1. 参数一：启动类的字节码
		 *  2. main函数的args
		 */
        //SpringApplication.run(SpringBootApplicationRunner.class, args);
		SpringApplication sa = new SpringApplication(SpringBootApplicationRunner.class);
		sa.setBannerMode(Mode.OFF);
		sa.run(args);
	}

}
