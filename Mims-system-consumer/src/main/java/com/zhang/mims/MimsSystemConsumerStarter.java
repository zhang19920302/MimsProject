package com.zhang.mims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>智慧医疗信息平台-系统基础服务启动类</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class MimsSystemConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(MimsSystemConsumerStarter.class,args);
	}
}
