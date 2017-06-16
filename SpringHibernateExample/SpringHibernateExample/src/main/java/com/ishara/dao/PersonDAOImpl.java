/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ishara.dao;

import com.ishara.model.Person;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ishara Dikkumbura
 */
@Repository
@Transactional

public class PersonDAOImpl implements PersonDAO {

    @Autowired(required = true)
    private SessionFactory sessionFactory;
    
    @Override
    public int addPerson(Person person) {
        Session session = sessionFactory.getCurrentSession();
        Long id = (Long) session.save(person);
        return Integer.valueOf(id.toString());
    }
    
}
