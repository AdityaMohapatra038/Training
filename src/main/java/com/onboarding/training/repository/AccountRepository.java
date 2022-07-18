package com.onboarding.training.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onboarding.training.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

	public Optional<Account> findByUserId(Long userId);
	
}
