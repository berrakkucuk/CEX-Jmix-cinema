package com.company.cinema.security;

import io.jmix.security.role.annotation.RowLevelRole;

@RowLevelRole(name = "rowLevelRole1", code = RowLevelRole1Role.CODE)
public interface RowLevelRole1Role {
    String CODE = "row-level-role1";
}