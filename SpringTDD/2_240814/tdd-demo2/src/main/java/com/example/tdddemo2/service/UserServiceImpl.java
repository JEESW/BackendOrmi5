package com.example.tdddemo2.service;

import com.example.tdddemo2.entity.User;
import com.example.tdddemo2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	@Override
	public User registerUser(String email, String password, String name) {
		// 1. 이메일 중복 체크
		if (isEmailToken(email)) {
			throw new IllegalArgumentException("Email is already token");
		}
		// 2. 비밀번호 암호화
		String encodedPassword = passwordEncoder.encode(password);
		User newUser = new User(email, encodedPassword, name);
		return userRepository.save(newUser);
	}

	@Override
	public User getUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User updateUser(String email, String currentPassword, String newName) {
		User user = userRepository.findByEmail(email);
		if (user != null && passwordEncoder.matches(currentPassword, user.getPassword())) {
			user.setName(newName);
			return userRepository.save(user);
		}
		throw new IllegalArgumentException("Invalid email or password");
	}

	@Override
	public void deleteUser(String email, String password) {
		User user = userRepository.findByEmail(email);
		if (user != null && passwordEncoder.matches(password, user.getPassword())) {
			userRepository.delete(user);
		} else {
			throw new IllegalArgumentException("Invalid email or password");
		}
	}

	@Override
	public boolean isEmailToken(String email) {
		return userRepository.existsByEmail(email);
	}
}