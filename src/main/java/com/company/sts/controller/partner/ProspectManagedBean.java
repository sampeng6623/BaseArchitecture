/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.sts.controller.partner;

import com.company.dao.partner.PartnerTemplateDAO;
import com.company.dao.partner.ProspectDAO;
import com.company.sec.GenericUtils;
import com.company.sts.entity.Usprospect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
@Named(value = "prospectManagedBean")
@RequestScoped
public class ProspectManagedBean extends GenericUtils implements Serializable {

//    private PartnerTemplateDAO partnerDAO;
    private Usprospect selectedProspect;
    private List<Usprospect> tableList;
    private List<Usprospect> filteredList;

    @PostConstruct
    public void init() {
        tableList = ProspectDAO.findAllProspect();
        
        System.out.println("tableList : "+tableList.size());
        
    }

    public String onAddButton(){
        
        
        return "prospectAdd?faces-redirect=true";
    }
    public List<Usprospect> getFilteredList() {
        return filteredList;
    }

    public void setFilteredList(List<Usprospect> filteredList) {
        this.filteredList = filteredList;
    }

    
    
    public Usprospect getSelectedProspect() {
        return selectedProspect;
    }

    public void setSelectedProspect(Usprospect selectedProspect) {
        this.selectedProspect = selectedProspect;
    }

    
    
    public List<Usprospect> getTableList() {
        return tableList;
    }

    public void setTableList(List<Usprospect> tableList) {
        this.tableList = tableList;
    }

    
}
