package com.stajokulu.service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.stajokulu.siteuser.SiteUser;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Dependent
@Stateless
public class UserServiceImpl implements UserService{
    
    @PersistenceContext
    EntityManager em;

    @Override
     public SiteUser saveUser(SiteUser siteUser) throws Exception {
       
        em.persist(siteUser);
     
        return siteUser;
    }

    @Override
    public List<SiteUser> listOfUser() {
        List<SiteUser> siteUserList = new ArrayList<>();
        try {
           
      
            siteUserList = em.createQuery("select a from SiteUser as a").getResultList();
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return siteUserList;

    }

    @Override
    public SiteUser LoadUser(String userName, String password) {
        SiteUser siteUser = new SiteUser();
        try {
          
            em.getTransaction().begin();
            Query query = em.createQuery("select a from SiteUser a where a.userName=:param1 and a.password=:param2");
            query.setParameter("param1", userName);
            query.setParameter("param2", password);
            siteUser = (SiteUser) query.getSingleResult();
            em.getTransaction().commit();
            em.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return siteUser;

    }

 

}
