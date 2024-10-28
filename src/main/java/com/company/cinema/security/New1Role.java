package com.company.cinema.security;

import io.jmix.security.role.annotation.ResourceRole;

@ResourceRole(name = "New1", code = New1Role.CODE, scope = "UI")
public interface New1Role {
    String CODE = "new1";
}