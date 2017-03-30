
package com.devzb.ui.service;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.devzb.ui.dao.model.SsoUser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserService {

	@Autowired
	RestTemplate	restTemplate;

	@HystrixCommand(fallbackMethod = "fallbackSearchAll")
	public List<SsoUser> searchAll() {
		int a = 1;
		int b = 2;
		if (a == b) {// 用来测试出错情况
			throw new RuntimeException("haha");
		}

		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		headers.add("Accept", MediaType.APPLICATION_JSON.toString());
		HttpEntity<String> formEntity = new HttpEntity<String>(new JSONObject().toString(), headers);

		return restTemplate.postForObject("http://api/user", formEntity, List.class);
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