package com.example.tdddemo2.service;

import com.example.tdddemo2.entity.User;

public interface UserService {
	User registerUser(String email, String password, String name);
	User getUserByEmail(String email);
	User updateUser(String email, String currentPassword, String newName);
	void deleteUser(String email, String password);
	boolean isEmailToken(String email);
}