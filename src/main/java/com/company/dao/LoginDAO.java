/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao;

import com.company.sec.EMF;
import com.company.sts.entity.Usersts;
import java.util.Random;
import javax.persistence.EntityManager;

/**
 *
 * @author sampeng
 */
public class LoginDAO extends GenericDAO{
    
    
    EntityManager em = EMF.createEntityManager();
    
    public void insertConcept(String value){
        
        Random rand = new Random();

        int  n = rand.nextInt(50) + 1;
        Usersts user = new Usersts();
        user.setSeq(n);
        user.setUsUsername(value);
        
        
        try{
        super.create(user);
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
