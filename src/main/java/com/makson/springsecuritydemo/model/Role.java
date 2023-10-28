package com.makson.springsecuritydemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@AllArgsConstructor
@Getter
public enum Role {
    ADMIN(Set.of(Permission.DEVELOPERS_READ, Permission.DEVELOPERS_WRITE)),
    USER(Set.of(Permission.DEVELOPERS_READ));
    private final Set<Permission> permissionSet;


}
