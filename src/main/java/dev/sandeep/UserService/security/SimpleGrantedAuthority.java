package dev.sandeep.UserService.security;

import dev.sandeep.UserService.model.Role;
import org.springframework.security.core.GrantedAuthority;

public class SimpleGrantedAuthority implements GrantedAuthority {
    String role;

    public SimpleGrantedAuthority(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return this.role;
    }
}
