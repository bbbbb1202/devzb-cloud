package com.devzb.api.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devzb.api.dao.model.SsoUser;
import com.devzb.api.service.UserService;
import com.devzb.framework.web.BaseController;

/**
 * 用户controller
 * 
 * @author zhangbin
 *
 */
@RestController
public class UserController extends BaseController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "user")
	public List<SsoUser> user() {
		log.info("访问了/user...");
		List<SsoUser> users = userService.getUsers();
		return users;
	}
}
