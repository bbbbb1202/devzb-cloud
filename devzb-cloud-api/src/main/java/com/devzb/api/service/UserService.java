package com.devzb.api.service;

import java.util.List;

import com.devzb.api.dao.model.SsoUser;

public interface UserService {

	public List<SsoUser> getUsers();
}
