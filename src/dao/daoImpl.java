/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.m_buku;
import model.m_user;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author F
 */

public class daoImpl implements dao{
    
    private final SessionFactory sessionFactory;

    public daoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    

    @Override
    @SuppressWarnings("ConvertToTryWithResources") 
    public boolean login(String username, String password) {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            
//            m_user user = (m_user)session.get(m_user.class, username);
//            System.out.println("password : " +user);
            
            Query q = session
                    .createQuery("FROM m_user u where u.username='"+username+"' and u.password ='"+password+"'");
            List resultList = q.list();
            session.getTransaction().commit();
            if(resultList.size() != 0){
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            session.getTransaction().rollback();
            return false;
        }finally{
            session.close();
        }
    }
    
}
