package com.samuelr.santander_dev_week.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.samuelr.santander_dev_week.domain.model.User;
import com.samuelr.santander_dev_week.domain.repositories.UserRepository;
import com.samuelr.santander_dev_week.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
	}

	@Override
	public User create(User createUser) {
		if(userRepository.existsById(createUser.getId())) {
			throw new IllegalArgumentException("This User already exists.");
		}
		return userRepository.save(createUser);
	}

}
