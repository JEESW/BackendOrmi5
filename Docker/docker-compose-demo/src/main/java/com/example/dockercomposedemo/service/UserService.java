package com.example.dockercomposedemo.service;

import com.example.dockercomposedemo.entity.User;
import com.example.dockercomposedemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public User createUser(String username, String email) {
		return userRepository.save(new User(username, email));
	}

	public User getUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}
}