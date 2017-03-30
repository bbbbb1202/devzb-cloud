package com.devzb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 启动器
 * 
 * @author zhangbin
 *
 */
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
public class ApiServer {

	public static void main(String[] args) {
		SpringApplication.run(ApiServer.class, args);
	}

}