package com.onboarding.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onboarding.training.models.Account;
import com.onboarding.training.service.AccountService;

@RestController
@RequestMapping("/Account")
public class AccountController {

	@Autowired
	AccountService accountService;

	@PostMapping("/add")
	public String addAccount(@RequestBody Account obj) {
		accountService.addAccount(obj);
		return "Account Added";
	}

	@PutMapping
	public String updateAccount(@RequestBody Account obj) {
		accountService.updateAccount(obj);
		return "Account Updated";
	}

	@DeleteMapping("/delete/{accountId}")
	public String deleteAccount(@PathVariable("accountId") Long accountId) {
		accountService.deleteAccount(accountId);
		return "Account Deleted";
	}

	@GetMapping("/getAll")
	public List<Account> getAccount() {
		return accountService.getAllAccount();
	}
	
	@GetMapping("/getByAccountId/{accountId}")
	public Optional<Account> getAccountByAccountId(@PathVariable("accountId") Long accountId) {
		return accountService.getAccountByAccountId(accountId);
	}
	
	@GetMapping("/getByUserId/{userId}")
	public Optional<Account> getAccountByUserId(@PathVariable("userId") Long userId) {
		return accountService.getAccountByUserId(userId);
	}

}
