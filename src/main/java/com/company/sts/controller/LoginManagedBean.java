/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.sts.controller;

import com.company.dao.LoginDAO;
import com.company.sec.GenericUtils;
import com.company.sec.SessionUtils;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sampeng
 */
@ManagedBean
@Named(value = "loginManagedBean")
@ViewScoped
public class LoginManagedBean  extends GenericUtils  implements Serializable{

    /**  
     * Creates a new instance of LoginManagedBean
     */
    LoginDAO logindao;
    
    
    private String password;
    private String userid;
    
    private String text;
    public LoginManagedBean() {
    }
    
    
    public void conceptSubmit(){
        System.out.println("inside");
        logindao = new LoginDAO();
        
        logindao.insertConcept(text);
        
    }
    
    
    public String validateUsernamePassword() {
        
        System.out.println("UserID : "+userid);
        System.out.println("Password : "+password);
            try{
                boolean valid = LoginDAO.validate(userid, password);
                System.out.println("valid : " + valid);
                if (valid) {
                        HttpSession session = SessionUtils.getSession();
                        session.setAttribute("username", userid);
                        return "partner/mainPartner?faces-redirect=true";
                } else {
//                        this.generateWARN("Invalid Login");
        FacesContext.getCurrentInstance().addMessage(
                                        null,
                                       this.generateWARN("Invalid Login", "Wrong Password/Username"));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            return "login";
	}
    /*
        Setter Getter    
    */

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
}
