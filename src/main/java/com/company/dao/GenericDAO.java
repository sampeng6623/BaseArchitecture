/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao;

import com.company.sec.EMF;
import java.lang.reflect.Field;
import java.util.Calendar;
import javax.persistence.EntityManager;

/**
 *
 * @author sampeng
 */
public class GenericDAO {
    private EntityManager em = EMF.createEntityManager();
    
    protected void createAdvance(Object obj) throws Exception{
        Class<?> objectClass = obj.getClass();
        Field field = objectClass.getDeclaredField("createby");
            field.setAccessible(true);
            field.set(obj, "adminedit");
          
            create(objectClass);
//        System.out.println("objectClass : "+objectClass.getField("createby").toString());
        
    }
    
    protected void create(Object obj) throws Exception{
        System.out.println("em : "+em);
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        em.close();
    }
    
    protected void update(Object obj) throws Exception{
        em.getTransaction().begin();
        em.merge(obj);
        em.getTransaction().commit();
        em.close();
    }
    
    protected java.sql.Timestamp getTimeStamp(){
        long timeNow = Calendar.getInstance().getTimeInMillis();
        return new java.sql.Timestamp(timeNow);
    }
    

    
    protected String leadingZero(int value){
        
        
        return String.format("%08d", value);
    }
}
