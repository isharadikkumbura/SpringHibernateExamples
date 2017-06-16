/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ishara.service;

import com.ishara.dao.PersonDAO;
import com.ishara.model.Person;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ishara Dikkumbura
 */
@Service
@Transactional
public class PersonServiceImpl implements PersonService{

    
    @Autowired
    private PersonDAO persondao;
    
    
    @Override
    public int addPerson(Person person) {
        return persondao.addPerson(person);
    }
    
}
