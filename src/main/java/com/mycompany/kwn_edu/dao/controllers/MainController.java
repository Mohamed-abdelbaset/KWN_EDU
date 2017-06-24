/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwn_edu.dao.controllers;

import com.mycompany.kwn_edu.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author mrbioeng
 */
@Controller
public class MainController {
        
    @RequestMapping( value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(){    
        return "home";
    }
    
    @RequestMapping( value = "/login", method = RequestMethod.GET)
    public String login(){    
        return "login";
    }
    
    
    
}
