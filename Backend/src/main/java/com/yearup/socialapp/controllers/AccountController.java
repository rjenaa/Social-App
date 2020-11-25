package com.yearup.socialapp.controllers;

import com.yearup.socialapp.models.Account;
import com.yearup.socialapp.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/accounts/", method = RequestMethod.POST)
        public Account createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }

    @RequestMapping(value = "/accounts/{id}", method = RequestMethod.DELETE)
    public void createAccount(@PathVariable Long id){
        accountService.deleteAccount(id);
    }

    @RequestMapping(value = "/accounts/{id}", method = RequestMethod.GET)
    public Optional<Account> getAccountById(@PathVariable Long id){
        return accountService.getAccountById(id);
    }

    @RequestMapping(value = "/accounts/", method = RequestMethod.GET)
    public Iterable<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }

}
