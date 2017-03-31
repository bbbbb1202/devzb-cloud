
package com.devzb.ui.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devzb.ui.dao.model.SsoUser;
import com.devzb.ui.feign.ApiClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserService {

	@Autowired
	private ApiClient apiClient;

	@HystrixCommand(fallbackMethod = "fallbackSearchAll")
	public List<SsoUser> searchAll() {
		int a = 1;
		int b = 2;
		if (a == b) {// 用来测试出错情况，断路器回退机制
			throw new RuntimeException("haha");
		}

		return apiClient.getUsers();
	}

	public List<SsoUser> fallbackSearchAll() {
		System.out.println("HystrixCommand fallbackMethod handle!");
		List<SsoUser> ls = new ArrayList<>();
		SsoUser user = new SsoUser();
		user.setId("11111111");
		user.setUsername("TestHystrix");
		ls.add(user);
		return ls;
	}
}