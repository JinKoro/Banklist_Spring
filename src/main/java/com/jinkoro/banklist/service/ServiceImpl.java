package com.jinkoro.banklist.service;

import com.jinkoro.banklist.dao.AccountDao;
import com.jinkoro.banklist.dao.UserDao;
import com.jinkoro.banklist.model.Account;
import com.jinkoro.banklist.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {


    private AccountDao<Account> accountDao;
    private UserDao<User> userDao;

    @Autowired
    public void setAccountDao(AccountDao<Account> accountDao) {
        this.accountDao = accountDao;
    }

    @Autowired
    @SuppressWarnings("unchecked")
    public void setUserUserDao(UserDao<User> userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public List<Account> findAllAccounts(){
        return accountDao.findAllAccounts();
    }

    @Transactional
    public List<User> findUserDataById(Integer yourID){
        return userDao.findUserDataById(yourID);
    }

    @Transactional
    public List max(){
        return accountDao.max();
    }

    @Transactional
    public List sum() {
        return accountDao.sum();
    }
}
