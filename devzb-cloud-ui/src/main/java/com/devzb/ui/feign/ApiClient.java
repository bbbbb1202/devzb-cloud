package com.devzb.ui.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devzb.ui.dao.model.SsoUser;

@FeignClient("api")
public interface ApiClient {

	@RequestMapping(method = RequestMethod.GET, value = "user")
	List<SsoUser> getUsers();
}
