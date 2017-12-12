package com.stajokulu.controller;



import com.stajokulu.service.UserService;
import com.stajokulu.siteuser.SiteUser;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import javax.inject.Named;

import javax.inject.Inject;
import javax.naming.InitialContext;


@ManagedBean(name = "userManagedBean")
@RequestScoped
public class UserManagedBean implements Serializable{

    @Inject
    UserService userService;

    private SiteUser siteUser=new SiteUser();
    private List<SiteUser> userList;

    
    public UserManagedBean() {
        
    
    }

    @PostConstruct
    public void init() {
        userList = userService.listOfUser();
    }

    public void saveUser() {
        try {
            
            userService.saveUser(siteUser);
        } catch (Exception ex) {
            Logger.getLogger(UserManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        userList = userService.listOfUser();
    }

    public SiteUser getSiteUser() {
        return siteUser;
    }

    public void setSiteUser(SiteUser siteUser) {
        this.siteUser = siteUser;
    }

    public List<SiteUser> getUserList() {
        return userList;
    }

    public void setUserList(List<SiteUser> userList) {
        this.userList = userList;
    }

    
    

}
