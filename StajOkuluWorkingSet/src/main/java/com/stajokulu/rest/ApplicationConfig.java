/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stajokulu.rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/rest")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(com.stajokulu.rest.UserRestService.class);
        return resources;

    }

//    @Override
//    public Set<Class<?>> getClasses() {
//        Set<Class<?>> resources=new HashSet<Class<?>>();
//        resources.add(com.stajokulu.rest.UserRestService.class);     
//      return resources;
//    }
}
