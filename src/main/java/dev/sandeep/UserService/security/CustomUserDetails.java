package dev.sandeep.UserService.security;

import dev.sandeep.UserService.model.Role;
import dev.sandeep.UserService.model.User;
import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class CustomUserDetails implements UserDetails {
   User user;

    public CustomUserDetails() {
    }

    public CustomUserDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//        ArrayList<SimpleGrantedAuthority> list=new ArrayList<>();
//        for (Role role: user.getRoles())
//            list.add(new SimpleGrantedAuthority(role.getRole()));
//        return list;
        return null;

    }

    @Override
    public String getPassword() {

        return  user.getPassword();
    }

    @Override
    public String getUsername() {
        return  user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
