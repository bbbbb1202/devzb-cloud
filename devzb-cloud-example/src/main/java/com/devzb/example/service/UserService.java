package com.devzb.example.service;

import java.util.List;

import com.devzb.example.dao.model.SsoUser;

public interface UserService {

	public List<SsoUser> getUsers();
}
