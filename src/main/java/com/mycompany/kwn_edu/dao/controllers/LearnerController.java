/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwn_edu.dao.controllers;

import java.security.Principal;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
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
public class LearnerController {
        
    @RequestMapping( value = {"/learner/", "/learner/home"})
    public String home(Principal p){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "learner/home";
    }
    
    @RequestMapping( value = "/learner/login")
    public String login(@RequestParam(value = "error", required = false) String error){  
        System.out.println("");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(!(authentication instanceof AnonymousAuthenticationToken))
            return "redirect:/learner/home";
        return "learner/login";
    }
    
    @RequestMapping( value = "/learner/access_denied", method = RequestMethod.GET)
    public String accessDenied(final HttpServletRequest request, Principal p){ 
        System.out.println("");
        return "learner/access_denied";
    }
    
}
