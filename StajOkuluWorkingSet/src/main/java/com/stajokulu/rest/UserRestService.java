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
