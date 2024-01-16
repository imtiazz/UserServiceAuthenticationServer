package dev.sandeep.UserService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;

@Entity
@Getter
@Setter
public class Role extends BaseModel {
    //@ManyToMany(mappedBy = "roles")
    private String role;
}
