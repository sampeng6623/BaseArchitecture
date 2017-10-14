/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.sec;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author sampeng
 */
public class GenericUtils {
    
    
    protected FacesMessage generateWARN(String header, String content){
        return  new FacesMessage(FacesMessage.SEVERITY_WARN, header, content);
         
    }
            
            
            
}
