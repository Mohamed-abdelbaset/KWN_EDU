/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwn_edu.dao;

import com.mycompany.kwn_edu.models.User;

/**
 *
 * @author mrbioeng
 */
public interface UserDao {
    User findByUserEmail(String username);
}
