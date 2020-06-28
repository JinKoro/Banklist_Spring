package com.jinkoro.banklist.service;

import com.jinkoro.banklist.dao.AccountDao;
import com.jinkoro.banklist.model.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


class AccountDaoImplTest{
    @Autowired
    private AccountDao accountDao;

    @Test
    void showAll() {
        for (Object q :accountDao.findAllAccounts())
         {
            System.out.println((Account)q);
        }
    }

}