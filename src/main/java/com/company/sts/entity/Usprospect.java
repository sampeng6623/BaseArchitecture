/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.sts.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sampeng
 */
@Entity
@Table(name = "usprospect")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usprospect.findAll", query = "SELECT u FROM Usprospect u")
    , @NamedQuery(name = "Usprospect.findByUsprospectid", query = "SELECT u FROM Usprospect u WHERE u.usprospectid = :usprospectid")
    , @NamedQuery(name = "Usprospect.findByUsprospectname", query = "SELECT u FROM Usprospect u WHERE u.usprospectname = :usprospectname")
    , @NamedQuery(name = "Usprospect.findByUsprospecttel1", query = "SELECT u FROM Usprospect u WHERE u.usprospecttel1 = :usprospecttel1")
    , @NamedQuery(name = "Usprospect.findByUsprospecttel2", query = "SELECT u FROM Usprospect u WHERE u.usprospecttel2 = :usprospecttel2")
    , @NamedQuery(name = "Usprospect.findByUsprospectaddress", query = "SELECT u FROM Usprospect u WHERE u.usprospectaddress = :usprospectaddress")
    , @NamedQuery(name = "Usprospect.findByUsprospectwebsite", query = "SELECT u FROM Usprospect u WHERE u.usprospectwebsite = :usprospectwebsite")
    , @NamedQuery(name = "Usprospect.findByUsprospectremark", query = "SELECT u FROM Usprospect u WHERE u.usprospectremark = :usprospectremark")
    , @NamedQuery(name = "Usprospect.findByUsprospectstatus", query = "SELECT u FROM Usprospect u WHERE u.usprospectstatus = :usprospectstatus")
    , @NamedQuery(name = "Usprospect.findByCreateby", query = "SELECT u FROM Usprospect u WHERE u.createby = :createby")
    , @NamedQuery(name = "Usprospect.findByDoneby", query = "SELECT u FROM Usprospect u WHERE u.doneby = :doneby")
    , @NamedQuery(name = "Usprospect.findByCreatetime", query = "SELECT u FROM Usprospect u WHERE u.createtime = :createtime")
    , @NamedQuery(name = "Usprospect.findByLastmodify", query = "SELECT u FROM Usprospect u WHERE u.lastmodify = :lastmodify")


})
public class Usprospect implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "usprospectprogress")
    private int usprospectprogress;
    @Size(max = 20)
    @Column(name = "usprospectstatus")
    private String usprospectstatus;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "usprospectid")
    private String usprospectid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "usprospectname")
    private String usprospectname;
    @Size(max = 45)
    @Column(name = "usprospecttel1")
    private String usprospecttel1;
    @Size(max = 45)
    @Column(name = "usprospecttel2")
    private String usprospecttel2;
    @Size(max = 300)
    @Column(name = "usprospectaddress")
    private String usprospectaddress;
    @Size(max = 45)
    @Column(name = "usprospectwebsite")
    private String usprospectwebsite;
    @Size(max = 500)
    @Column(name = "usprospectremark")
    private String usprospectremark;
    @Size(max = 45)
    @Column(name = "createby")
    private String createby;
    @Size(max = 45)
    @Column(name = "doneby")
    private String doneby;
    @Column(name = "createtime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @Column(name = "lastmodify")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastmodify;

    public Usprospect() {
    }

    public Usprospect(String usprospectid) {
        this.usprospectid = usprospectid;
    }

    public Usprospect(String usprospectid, String usprospectname, String usprospectstatus) {
        this.usprospectid = usprospectid;
        this.usprospectname = usprospectname;
        this.usprospectstatus = usprospectstatus;
    }

    public String getUsprospectid() {
        return usprospectid;
    }

    public void setUsprospectid(String usprospectid) {
        this.usprospectid = usprospectid;
    }

    public String getUsprospectname() {
        return usprospectname;
    }

    public void setUsprospectname(String usprospectname) {
        this.usprospectname = usprospectname;
    }

    public String getUsprospecttel1() {
        return usprospecttel1;
    }

    public void setUsprospecttel1(String usprospecttel1) {
        this.usprospecttel1 = usprospecttel1;
    }

    public String getUsprospecttel2() {
        return usprospecttel2;
    }

    public void setUsprospecttel2(String usprospecttel2) {
        this.usprospecttel2 = usprospecttel2;
    }

    public String getUsprospectaddress() {
        return usprospectaddress;
    }

    public void setUsprospectaddress(String usprospectaddress) {
        this.usprospectaddress = usprospectaddress;
    }

    public String getUsprospectwebsite() {
        return usprospectwebsite;
    }

    public void setUsprospectwebsite(String usprospectwebsite) {
        this.usprospectwebsite = usprospectwebsite;
    }

    public String getUsprospectremark() {
        return usprospectremark;
    }

    public void setUsprospectremark(String usprospectremark) {
        this.usprospectremark = usprospectremark;
    }


    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public String getDoneby() {
        return doneby;
    }

    public void setDoneby(String doneby) {
        this.doneby = doneby;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Date lastmodify) {
        this.lastmodify = lastmodify;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usprospectid != null ? usprospectid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usprospect)) {
            return false;
        }
        Usprospect other = (Usprospect) object;
        if ((this.usprospectid == null && other.usprospectid != null) || (this.usprospectid != null && !this.usprospectid.equals(other.usprospectid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.sts.entity.Usprospect[ usprospectid=" + usprospectid + " ]";
    }

    public int getUsprospectprogress() {
        return usprospectprogress;
    }

    public void setUsprospectprogress(int usprospectprogress) {
        this.usprospectprogress = usprospectprogress;
    }

    public String getUsprospectstatus() {
        return usprospectstatus;
    }

    public void setUsprospectstatus(String usprospectstatus) {
        this.usprospectstatus = usprospectstatus;
    }
    
}
