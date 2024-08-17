package com.samuelr.santander_dev_week.service;

import com.samuelr.santander_dev_week.domain.model.User;

public interface UserService {
	User findById(Long id);
	User create(User createUserDto);
}
