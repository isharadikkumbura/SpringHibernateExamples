/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ishara.controller;


import com.ishara.model.Person;
import com.ishara.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ishara Dikkumbura
 */

@Controller
public class HomeController {
    
    @Autowired
    private PersonService personservice;
  
   
    @RequestMapping(value="/")
    public String showIndex(){
        return "index";
    }
    
    @RequestMapping(value="/add")
    public String addPerson(){
        Person p = new Person();
        p.setName("Obama");
        p.setAge(60);
        
        int id= personservice.addPerson(p);
        
        if(id!=0){
            return "success";
        }
        else        
        return "fail";
    }
    
    
}
