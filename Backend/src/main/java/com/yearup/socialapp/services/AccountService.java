package com.yearup.socialapp.services;

import com.yearup.socialapp.models.Account;
import com.yearup.socialapp.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Optional<Account> getAccountById(Long Id){
        return accountRepository.findById(Id);
    }

    public Iterable<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    public Account createAccount(Account account){
        return accountRepository.save(account);
    }

    public void deleteAccount(Long Id){
        accountRepository.deleteById(Id);
    }


}
