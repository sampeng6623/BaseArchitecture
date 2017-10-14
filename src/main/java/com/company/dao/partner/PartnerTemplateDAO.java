/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao.partner;

import com.company.dao.*;
import com.company.sec.EMF;
import com.company.sts.entity.Usersts;
import com.company.sts.entity.Usmenu;
import java.io.Serializable;
import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author sampeng
 */
public class PartnerTemplateDAO extends GenericDAO implements Serializable{
    
    
    private static EntityManager em;
    
    public List<Usmenu> retrieveRootMenu(){
        
        em = EMF.createEntityManager();
        TypedQuery<Usmenu> query =
                     em.createNamedQuery("Usmenu.findByUsmRootMenu", Usmenu.class)
                .setParameter("usmNodestatus", "A");
        
        return query.getResultList();
    }
    
    
    public List<Usmenu> retrieveSubMenu(int node){
        
        em = EMF.createEntityManager();
        TypedQuery<Usmenu> query =
                     em.createNamedQuery("Usmenu.findByUsmSubMenu", Usmenu.class)
                .setParameter("usmNodestatus", "A")
                .setParameter("subNode", node);
        
        return query.getResultList();
    }
//    
//    public static boolean validate(String user, String password) throws Exception{
//        
//        em = EMF.createEntityManager();
//        TypedQuery<Usersts> query =
//                     em.createNamedQuery("Usersts.validateLogin", Usersts.class)
//                .setParameter("usUsername", user)
//                .setParameter("usPassword", password);
//            List<Usersts> results = query.getResultList();
//		
//            if(results.isEmpty())
//		return false;
//            else
//                return true;
//	}
//    

    
}
