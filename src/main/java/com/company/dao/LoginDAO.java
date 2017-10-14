/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao;

import com.company.sec.EMF;
import com.company.sts.entity.Usersts;
import java.io.Serializable;
import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author sampeng
 */
public class LoginDAO extends GenericDAO implements Serializable{
    
    
    private static EntityManager em;
    
    
    
    public static boolean validate(String user, String password) throws Exception{
        
        em = EMF.createEntityManager();
        TypedQuery<Usersts> query =
                     em.createNamedQuery("Usersts.validateLogin", Usersts.class)
                .setParameter("usUsername", user)
                .setParameter("usPassword", password);
            List<Usersts> results = query.getResultList();
		
            if(results.isEmpty())
		return false;
            else
                return true;
	}
    
    
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
