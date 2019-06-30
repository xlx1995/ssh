package com.ssh.dao.impl;

import org.hibernate.SessionFactory;
import com.ssh.dao.UserDao;
import com.ssh.pojo.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    public void save(User user) {

        Session session = getCurrentSession();
        Transaction tran = session.beginTransaction();
        session.save(user);
        tran.commit();

    }
}
