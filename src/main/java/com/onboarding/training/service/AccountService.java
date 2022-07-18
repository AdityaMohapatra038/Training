package com.onboarding.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.onboarding.training.models.Account;

@Service
public interface AccountService {

	public Account addAccount(Account obj);

	public Account updateAccount(Account obj);

	public void deleteAccount(Long accountId);

	public Optional<Account> getAccountByAccountId(Long accountId);
	
	public Optional<Account> getAccountByUserId(Long userId);

	public List<Account> getAllAccount();

}
