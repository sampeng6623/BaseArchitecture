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
import com.company.sts.entity.Usprospect;
import java.io.Serializable;
import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author sampeng
 */
public class ProspectDAO extends GenericDAO implements Serializable{
    
    
    private static EntityManager em;
    
    public static List<Usprospect> findAllProspect(){
        
        em = EMF.createEntityManager();
        TypedQuery<Usprospect> query =
                     em.createNamedQuery("Usprospect.findAll", Usprospect.class);
        
        return query.getResultList();
    }
    
    public void insertProspect(Usprospect entity) throws Exception{
        
        em = EMF.createEntityManager();
        TypedQuery<Usprospect> query =
                     em.createNamedQuery("Usprospect.findAll", Usprospect.class);  
        
        List<Usprospect> record =query.getResultList();
        
        if(!record.isEmpty()){
            entity.setUsprospectid("PROS"+super.leadingZero(record.size()+1));
        }else{
            entity.setUsprospectid("PROS00000001");
        }
        
        entity.setCreatetime(super.getTimeStamp());
        entity.setLastmodify(super.getTimeStamp());
        super.create(entity);
        
        
        
    }

    public void insertProspectTest(Usprospect entity) throws Exception{
        super.createAdvance(entity);
        
    }
    
}
