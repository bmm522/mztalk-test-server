package com.mztalk.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MztalkTestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MztalkTestServerApplication.class, args);
	}

}
