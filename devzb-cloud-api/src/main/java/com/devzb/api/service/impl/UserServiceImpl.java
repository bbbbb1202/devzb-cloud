package com.devzb.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devzb.api.dao.mapper.SsoUserMapperExt;
import com.devzb.api.dao.model.SsoUser;
import com.devzb.api.dao.model.SsoUserExample;
import com.devzb.api.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private SsoUserMapperExt ssoUserMapperExt;

	public List<SsoUser> getUsers() {
		SsoUserExample example = new SsoUserExample();
		example.setOrderByClause("id desc limit 20");
		return ssoUserMapperExt.selectByExample(example);
	}
}
