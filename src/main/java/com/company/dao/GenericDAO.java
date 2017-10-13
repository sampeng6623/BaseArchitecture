/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao;

import com.company.sec.EMF;
import javax.persistence.EntityManager;

/**
 *
 * @author sampeng
 */
public class GenericDAO {
    private EntityManager em = EMF.createEntityManager();
    
    
    protected void create(Object obj) throws Exception{
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
}
