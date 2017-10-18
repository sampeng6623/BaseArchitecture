/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.sts.controller.partner;

import com.company.dao.partner.PartnerTemplateDAO;
import com.company.dao.partner.ProspectDAO;
import com.company.sec.GenericUtils;
import com.company.sec.SessionUtils;
import com.company.sts.entity.Usprospect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author sampeng
 */
@ManagedBean
@Named(value = "prospectAddManagedBean")
@RequestScoped
public class ProspectAddManagedBean extends GenericUtils implements Serializable {

//    private PartnerTemplateDAO partnerDAO;
    
    
    private String firstName;
    private String lastName;
    private String website;
    private String tel1;
    private String tel2;
    private String remark;
    private String address;
    
    
    public String onSave(){
        Usprospect prospect = new Usprospect();
        
        
        prospect.setUsprospectname(firstName + " " + lastName);
        prospect.setUsprospectwebsite(website);
        prospect.setUsprospecttel1(tel1);
        prospect.setUsprospecttel2(tel2);
        prospect.setUsprospectaddress(address);
        prospect.setUsprospectremark(remark);
        prospect.setUsprospectprogress(10);
        prospect.setUsprospectstatus("Active");
        prospect.setCreateby(SessionUtils.getUserName());
        prospect.setDoneby(SessionUtils.getUserName());
        
        try{
        ProspectDAO dao = new ProspectDAO();
        dao.insertProspect(prospect);
//        dao.insertProspect(prospect);
        
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "prospect?faces-redirect=true";
    }
    
    public String onCancel(){
        System.out.println("cancel inside");
        return  "prospect?faces-redirect=true";
    }


    /*
    Setter Getter
     */
    
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getWebsite() {
        return website;
    }

    public String getTel1() {
        return tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public String getRemark() {
        return remark;
    }

    public String getAddress() {
        return address;
    }
    
    
}
