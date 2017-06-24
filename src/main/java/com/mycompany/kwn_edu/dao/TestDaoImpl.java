/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwn_edu.dao;

import com.mycompany.kwn_edu.models.Test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mrbioeng
 */
@Repository
public class TestDaoImpl implements TestDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void test() {
        Session s = sessionFactory.getCurrentSession();
        Transaction tr = s.getTransaction();
        Test t = (Test) sessionFactory.getCurrentSession().get(Test.class, 1);
        System.out.println(t.getName());
    }

}
