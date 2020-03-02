package com.myclass.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class MyFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFeignClientApplication.class, args);
	}

}
