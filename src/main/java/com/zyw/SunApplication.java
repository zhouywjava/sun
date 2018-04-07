package com.zyw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SunApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunApplication.class, args);
	}
}
