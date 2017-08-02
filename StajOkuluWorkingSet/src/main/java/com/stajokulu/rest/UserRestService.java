/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stajokulu.rest;




import com.stajokulu.service.UserService;
import com.stajokulu.siteuser.SiteUser;
import java.util.List;
import javax.enterprise.context.RequestScoped;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Burakhan
 */
@Path("/userListesi")
@RequestScoped
public class UserRestService {
    
    @Inject
    UserService userService;
    
    @GET
    @Path("/getir")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SiteUser> getUserList(){
        return userService.listOfUser();
    }
    
}
