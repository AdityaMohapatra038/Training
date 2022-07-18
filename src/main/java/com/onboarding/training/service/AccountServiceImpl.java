package com.onboarding.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onboarding.training.models.Account;
import com.onboarding.training.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;

	@Override
	public Account addAccount(Account obj) {
		return accountRepository.save(obj);
	}

	@Override
	public Account updateAccount(Account obj) {
		return accountRepository.save(obj);
	}

	@Override
	public void deleteAccount(Long accountId) {
		accountRepository.deleteById(accountId);
	}

	@Override
	public Optional<Account> getAccountByAccountId(Long accountId) {
		return accountRepository.findById(accountId);
	}

	@Override
	public Optional<Account> getAccountByUserId(Long userId) {
		return accountRepository.findByUserId(userId);
	}

	@Override
	public List<Account> getAllAccount() {
		return accountRepository.findAll();
	}

}
