/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwn_edu.services;

import com.mycompany.kwn_edu.dao.UserDao;
import com.mycompany.kwn_edu.models.Role;
import com.mycompany.kwn_edu.models.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author mrbioeng
 */
public class LoginServiceImpl implements UserDetailsService{
    
    @Autowired
    private UserDao userDao;

    public LoginServiceImpl() {
        System.out.println("");
        
    }

    
    
    
    @Override
    public UserDetails loadUserByUsername(String email) {
        
        User user = userDao.findByUserEmail(email);
        return createSpringUser(user);
    }
    
    private UserDetails createSpringUser(User user){
        List<GrantedAuthority> grantedAuthoritys = new ArrayList<>();
        for(Role role : user.getRoles()){
            grantedAuthoritys.add(new SimpleGrantedAuthority(role.getRole()));
        }
        
        return new org.springframework.security.core.userdetails.
                User(user.getEmail(), user.getPassword(), grantedAuthoritys);
    }
    
    
}
