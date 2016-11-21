/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.Version;


/**
 *
 * @author syslife01
 */
@MappedSuperclass
public class BasicAttributes implements Serializable {

   Long id;
    private Integer version;
    private Calendar modified;
    private Calendar created;
   
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Version
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    public Calendar getCreated() {
        return created;
    }

    public void setCreated(Calendar created) {
        this.created = created;
    }
    
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    public Calendar getModified() {
        return modified;
    }

    public void setModified(Calendar modified) {
        this.modified = modified;
    }    

    @PrePersist
    public void prePersis(){
        this.created = this.modified = Calendar.getInstance();
    }
    
    @PreUpdate
    public void preUpdate(){
        this.modified = Calendar.getInstance();
    }
    
}
