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
@Table(name = "usmenu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usmenu.findAll", query = "SELECT u FROM Usmenu u")
    , @NamedQuery(name = "Usmenu.findByUsmNode", query = "SELECT u FROM Usmenu u WHERE u.usmNode = :usmNode")
    , @NamedQuery(name = "Usmenu.findByUsmNodeparent", query = "SELECT u FROM Usmenu u WHERE u.usmNodeparent = :usmNodeparent")
    , @NamedQuery(name = "Usmenu.findByUsmNodename", query = "SELECT u FROM Usmenu u WHERE u.usmNodename = :usmNodename")
    , @NamedQuery(name = "Usmenu.findByUsmnodeDesc", query = "SELECT u FROM Usmenu u WHERE u.usmnodeDesc = :usmnodeDesc")
    , @NamedQuery(name = "Usmenu.findByUsmNodepath", query = "SELECT u FROM Usmenu u WHERE u.usmNodepath = :usmNodepath")
    , @NamedQuery(name = "Usmenu.findByUsmNodestatus", query = "SELECT u FROM Usmenu u WHERE u.usmNodestatus = :usmNodestatus")
    , @NamedQuery(name = "Usmenu.findByUsmRootMenu", query = "SELECT u FROM Usmenu u WHERE u.usmNodestatus = :usmNodestatus AND u.usmNodeparent = '0'")
    , @NamedQuery(name = "Usmenu.findByUsmSubMenu", query = "SELECT u FROM Usmenu u WHERE u.usmNodestatus = :usmNodestatus AND u.usmNodeparent = :subNode")


})
public class Usmenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "usm_node")
    private Integer usmNode;
    @Column(name = "usm_nodeparent")
    private Integer usmNodeparent;
    @Size(max = 45)
    @Column(name = "usm_nodename")
    private String usmNodename;
    @Size(max = 100)
    @Column(name = "usm_nodeDesc")
    private String usmnodeDesc;
    @Size(max = 100)
    @Column(name = "usm_nodepath")
    private String usmNodepath;
    @Size(max = 1)
    @Column(name = "usm_nodestatus")
    private String usmNodestatus;

    public Usmenu() {
    }

    public Usmenu(Integer usmNode) {
        this.usmNode = usmNode;
    }

    public Integer getUsmNode() {
        return usmNode;
    }

    public void setUsmNode(Integer usmNode) {
        this.usmNode = usmNode;
    }

    public Integer getUsmNodeparent() {
        return usmNodeparent;
    }

    public void setUsmNodeparent(Integer usmNodeparent) {
        this.usmNodeparent = usmNodeparent;
    }

    public String getUsmNodename() {
        return usmNodename;
    }

    public void setUsmNodename(String usmNodename) {
        this.usmNodename = usmNodename;
    }

    public String getUsmnodeDesc() {
        return usmnodeDesc;
    }

    public void setUsmnodeDesc(String usmnodeDesc) {
        this.usmnodeDesc = usmnodeDesc;
    }

    public String getUsmNodepath() {
        return usmNodepath;
    }

    public void setUsmNodepath(String usmNodepath) {
        this.usmNodepath = usmNodepath;
    }

    public String getUsmNodestatus() {
        return usmNodestatus;
    }

    public void setUsmNodestatus(String usmNodestatus) {
        this.usmNodestatus = usmNodestatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usmNode != null ? usmNode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usmenu)) {
            return false;
        }
        Usmenu other = (Usmenu) object;
        if ((this.usmNode == null && other.usmNode != null) || (this.usmNode != null && !this.usmNode.equals(other.usmNode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.sts.entity.Usmenu[ usmNode=" + usmNode + " ]";
    }
    
}
