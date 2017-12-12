package com.stajokulu.service;

import com.stajokulu.siteuser.SiteUser;
import java.util.List;
import javax.ejb.Local;


@Local
public interface UserService {

    public SiteUser saveUser(SiteUser siteUser) throws Exception;

    public List<SiteUser> listOfUser();

    public SiteUser LoadUser(String userName, String password);

}
