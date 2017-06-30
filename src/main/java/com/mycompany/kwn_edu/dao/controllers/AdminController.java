/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwn_edu.dao.controllers;

import java.security.Principal;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author mrbioeng
 */
@Controller
public class AdminController {
        
    @RequestMapping( value = {"/admin/", "/admin/home"})
    public String home(Principal p){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "admin/home";
    }
    
    @RequestMapping( value = "/admin/login")
    public String login(@RequestParam(value = "error", required = false) String error){  
        System.out.println("");
        return "admin/login";
    }
    
    @RequestMapping( value = "/admin/access_denied", method = RequestMethod.GET)
    public String accessDenied(final HttpServletRequest request, Principal p){ 
        System.out.println("");
        return "admin/access_denied";
    }
    
}
