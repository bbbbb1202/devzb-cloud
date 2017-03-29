package com.devzb.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devzb.example.dao.mapper.SsoUserMapperExt;
import com.devzb.example.dao.model.SsoUser;
import com.devzb.example.dao.model.SsoUserExample;
import com.devzb.example.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private SsoUserMapperExt ssoUserMapperExt;

	public List<SsoUser> getUsers() {
		SsoUserExample example = new SsoUserExample();
		example.setOrderByClause("id desc limit 10");
		return ssoUserMapperExt.selectByExample(example);
	}
}
