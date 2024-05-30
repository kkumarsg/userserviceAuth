package com.auth1.auth.learning.security.services;

import com.auth1.auth.learning.model.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;


public class CustomeGrantedAuthority implements GrantedAuthority {

    private String role;

    public CustomeGrantedAuthority(Role role) {
        this.role = role.getName();
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
