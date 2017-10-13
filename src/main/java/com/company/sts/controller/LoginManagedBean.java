/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.sts.controller;

import com.company.dao.LoginDAO;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author sampeng
 */
@ManagedBean
@Named(value = "loginManagedBean")
@ViewScoped
public class LoginManagedBean implements Serializable{

    /**
     * Creates a new instance of LoginManagedBean
     */
    LoginDAO logindao;
    
    private String text;
    public LoginManagedBean() {
    }
    
    
    public void conceptSubmit(){
        System.out.println("inside");
        logindao = new LoginDAO();
        
        logindao.insertConcept(text);
        
    }
    
    /*
        Setter Getter    
    */

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
}
