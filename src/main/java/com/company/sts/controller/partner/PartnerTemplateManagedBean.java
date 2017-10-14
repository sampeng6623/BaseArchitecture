/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.sts.controller.partner;

import com.company.dao.partner.PartnerTemplateDAO;
import com.company.sec.GenericUtils;
import com.company.sec.SessionUtils;
import com.company.sts.entity.Usmenu;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;

import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author sampeng
 */

@ManagedBean
@Named(value = "partnerTemplateManagedBean")
@SessionScoped
public class PartnerTemplateManagedBean  extends GenericUtils  implements Serializable{
     private MenuModel model;
 
     
     @PostConstruct
    public void init() {   
        
        PartnerTemplateDAO template = new PartnerTemplateDAO();
        
        model = new DefaultMenuModel();
        List<Usmenu> rootMenu = template.retrieveRootMenu();
        
        for(Usmenu rootmenu: rootMenu){
            DefaultSubMenu root = new DefaultSubMenu(rootmenu.getUsmNodename());
            DefaultMenuItem item;
            List<Usmenu> subMenu = template.retrieveSubMenu(rootmenu.getUsmNode());    
                        
             for(Usmenu submenu: subMenu){
                 
                 item = new DefaultMenuItem(submenu.getUsmNodename());
                 item.setOutcome(submenu.getUsmNodepath());
//                item.setUrl(submenu.getUsmNodepath());
                item.setIcon("ui-icon-home");
                root.addElement(item);
             }
              model.addElement(root);
          }
    }
 
   
    public void logout() throws IOException{
        System.out.println(SessionUtils.getUserName() + " is disconnected...");
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.invalidateSession();
        ec.redirect("../login.xhtml");
    }
    public MenuModel getModel() {
        return model;
    }   

    public void setModel(MenuModel model) {
        this.model = model;
    }
    
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
}
