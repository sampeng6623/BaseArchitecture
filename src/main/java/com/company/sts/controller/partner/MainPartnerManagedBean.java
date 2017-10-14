/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.sts.controller.partner;

import com.company.sec.GenericUtils;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author sampeng
 */

@ManagedBean
@Named(value = "mainPartnerBean")
@SessionScoped
public class MainPartnerManagedBean  extends GenericUtils  implements Serializable{
    
}
