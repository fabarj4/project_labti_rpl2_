/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import dao.daoImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author F
 */
public class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY;
    private static final daoImpl TOKO_BUKU_DAO;

    public static SessionFactory getSESSION_FACTORY() {
        return SESSION_FACTORY;
    }

    public static daoImpl getTOKO_BUKU_DAO() {
        return TOKO_BUKU_DAO;
    }
    
    static{
        try{
            SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
            TOKO_BUKU_DAO = new daoImpl(SESSION_FACTORY);
        }catch(Throwable ex){
            System.err.println("Initial SessionFactory creation failed." + ex); 
            System.out.println("ERROR HIBERNATE UTIL");
            throw new ExceptionInInitializerError(ex); 
        }
    }
    
}
