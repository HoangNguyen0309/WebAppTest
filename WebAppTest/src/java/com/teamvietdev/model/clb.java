/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamvietdev.model;

import java.io.Serializable;
import java.util.List;  
  
import javax.persistence.*;  

/*
 * @author Admin
 */
@Entity(name = "clb")
@Table(name = "clb")
public class clb implements Serializable {
    @Id
    private String clbname;
    private String manager;
    
    @OneToMany(mappedBy = "profileCurrentClub")
    
    private String thanhLap;
    
    public String getclbname() {
        return clbname;
    }
    
    public String getmanager() {
        return manager;
    }
    
    public String thanhLap() {
        return thanhLap;
    }
    
 }