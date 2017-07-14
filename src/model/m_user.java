/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.EnumType; 
import javax.persistence.Enumerated; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.Table;
import javax.persistence.Temporal; 
import javax.persistence.TemporalType; 
import org.hibernate.annotations.GenericGenerator; 

/**
 *
 * @author F
 */

@Entity
@Table(name = "user")
public class m_user {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String nama;
    
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }   
}
