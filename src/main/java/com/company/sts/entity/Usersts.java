/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.sts.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sampeng
 */
@Entity
@Table(name = "usersts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usersts.findAll", query = "SELECT u FROM Usersts u")
    , @NamedQuery(name = "Usersts.findBySeq", query = "SELECT u FROM Usersts u WHERE u.seq = :seq")
    , @NamedQuery(name = "Usersts.findByUsUsername", query = "SELECT u FROM Usersts u WHERE u.usUsername = :usUsername")
    , @NamedQuery(name = "Usersts.validateLogin", query = "SELECT u FROM Usersts u WHERE u.usUsername = :usUsername AND u.usPassword = :usPassword")
})
public class Usersts implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "us_password")
    private String usPassword;

    private static final long serialVersionUID = 1L;
    @Column(name = "seq")
    private Integer seq;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "us_username")
    private String usUsername;

    public Usersts() {
    }

    public Usersts(String usUsername) {
        this.usUsername = usUsername;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getUsUsername() {
        return usUsername;
    }

    public void setUsUsername(String usUsername) {
        this.usUsername = usUsername;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usUsername != null ? usUsername.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usersts)) {
            return false;
        }
        Usersts other = (Usersts) object;
        if ((this.usUsername == null && other.usUsername != null) || (this.usUsername != null && !this.usUsername.equals(other.usUsername))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.salestrackingsystemweb.entity.Usersts[ usUsername=" + usUsername + " ]";
    }

    public String getUsPassword() {
        return usPassword;
    }

    public void setUsPassword(String usPassword) {
        this.usPassword = usPassword;
    }
    
}
