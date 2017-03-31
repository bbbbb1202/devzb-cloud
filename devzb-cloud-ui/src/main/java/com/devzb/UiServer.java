package com.devzb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 启动器
 * 
 * @author zhangbin
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableFeignClients
//@RibbonClient(name = "uiClient", configuration = RibbonConfiguation.class)
public class UiServer {

	public static void main(String[] args) {
		SpringApplication.run(UiServer.class, args);
	}

}