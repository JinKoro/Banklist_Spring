package com.jinkoro.banklist.service;

import com.jinkoro.banklist.model.Account;
import com.jinkoro.banklist.model.User;

import java.util.List;

public interface Service {
    public List<User> findUserDataById(Integer yourID);
    public List<Account> findAllAccounts();
    public List max();
    public List sum();
}
