package com.devzb.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devzb.example.dao.model.SsoUser;
import com.devzb.example.service.UserService;
import com.devzb.framework.web.BaseController;

/**
 * 用户controller
 * 
 * @author zhangbin
 *
 */
@RestController
@RequestMapping("user")
public class UserController extends BaseController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<SsoUser> readUserInfo() {
		List<SsoUser> users = userService.getUsers();
		return users;
	}
}
