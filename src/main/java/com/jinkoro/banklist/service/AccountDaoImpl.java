package com.jinkoro.banklist.service;

import com.jinkoro.banklist.dao.AccountDao;
import com.jinkoro.banklist.model.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao<Account> {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Account> findAllAccounts() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Account").list();
    }

    @Override
    public List max(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select max(account) from Account").list();
    }

    @Override
    public List sum() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select sum(a.account) from Account a").list();
    }
}