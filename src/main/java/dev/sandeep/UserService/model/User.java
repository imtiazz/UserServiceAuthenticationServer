package dev.sandeep.UserService.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "ECOM_USER")
@Getter
@Setter
public class User extends BaseModel {
    private String email;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "ecom_user_roles",joinColumns = @JoinColumn(name="ecom_user_id"),
//    inverseJoinColumns = @JoinColumn(name = "roles_id"))
    private Set<Role> roles = new HashSet<>();
}
/*
    User Role -> M:M
 */