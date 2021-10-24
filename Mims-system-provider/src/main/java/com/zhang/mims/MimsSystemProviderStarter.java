package com.zhang.mims;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@MapperScan("com.zhang.mims.*.dao")
@EnableEurekaClient
@SpringBootApplication
public class MimsSystemProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(MimsSystemProviderStarter.class, args);
	}
}
