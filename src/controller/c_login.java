/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import config.HibernateUtil;
import dao.dao;
import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.util.List; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JOptionPane; 

import view.v_login;

/**
 *
 * @author F
 */
public class c_login {
    //deklarasi view
    private final v_login loginView;
    private final dao daoTokoBuku = HibernateUtil.getTOKO_BUKU_DAO();

    //constructor
    public c_login(v_login loginView) {
        this.loginView = loginView;
    }    
    
    //method buat uji coba
    public void setUsername(){
       this.loginView.getT_username().setText("LOL");
    }
    
    //fungsi ini untuk login admin
    public void login(){
        //deklarasi untuk mengambil nilai dari view
        String username = this.loginView.getT_username().getText().trim();
        String password = this.loginView.getT_password().getText().trim();
        
        boolean cek = daoTokoBuku.login(username, password);
        if(cek == true){
            System.out.println("benar");
        }else{
            System.out.println("salah");
        }
    }
}
