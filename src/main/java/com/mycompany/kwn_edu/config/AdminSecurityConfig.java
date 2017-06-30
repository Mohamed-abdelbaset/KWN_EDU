/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwn_edu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author mrbioeng
 */
//@Order(1)
//@Configuration("adminSecurityConfig")
//@EnableWebSecurity
public class AdminSecurityConfig extends WebSecurityConfigurerAdapter {
/*
    @Autowired
    @Qualifier("adminLoginService")
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/home").access("hasRole('ADMIN')")
                
                .and().formLogin()
                
                .loginPage("/admin/login")
                .successForwardUrl("/admin/home")
                .failureUrl("/admin/login?error")
                .usernameParameter("email")
                .passwordParameter("password")
                
                .and().logout().logoutSuccessUrl("/admin/login?logout")
                
                .and().exceptionHandling().accessDeniedPage("/admin/access_denied")
                
                .and().csrf();

    }

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder;
    }
*/
}
