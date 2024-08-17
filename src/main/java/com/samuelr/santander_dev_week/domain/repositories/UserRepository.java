package com.samuelr.santander_dev_week.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samuelr.santander_dev_week.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	boolean existsByAccountNumber(String accountNumber);
}
