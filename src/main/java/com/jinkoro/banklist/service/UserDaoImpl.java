package com.jinkoro.banklist.service;


import com.jinkoro.banklist.dao.UserDao;
import com.jinkoro.banklist.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserDaoImpl implements UserDao<User> {

    private final static String SQL_FIND_USERDATA_BY_ID = "select * from user where userID=? ";

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<User> findUserDataById(Integer yourID) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User where userId="+yourID).list();
    }
}
