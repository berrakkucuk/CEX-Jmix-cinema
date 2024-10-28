package com.company.cinema.security;

import com.company.cinema.entity.*;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "customer2", code = Customer2Role.CODE, scope = "UI")
public interface Customer2Role {
    String CODE = "customer2";

    @EntityAttributePolicy(entityClass = Booking.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Booking.class, actions = EntityPolicyAction.ALL)
    void booking();

    @EntityAttributePolicy(entityClass = Movie.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Movie.class, actions = EntityPolicyAction.READ)
    void movie();

    @EntityAttributePolicy(entityClass = Screen.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Screen.class, actions = EntityPolicyAction.READ)
    void screen();

    @EntityAttributePolicy(entityClass = Seat.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Seat.class, actions = EntityPolicyAction.READ)
    void seat();

    @MenuPolicy(menuIds = {"Booking.listCustomer2", "Movie.list", "Screen.list", "Seat.list", "Booking.list"})
    @ViewPolicy(viewIds = {"Booking.listCustomer2", "Movie.list", "Screen.list", "Seat.list", "Booking.detailCustomer2", "Booking.detail", "Booking.list", "ext_Booking.list"})
    void screens();

    @EntityAttributePolicy(entityClass = User.class, attributes = {"username", "password", "firstName", "lastName", "email"}, action = EntityAttributePolicyAction.VIEW)
    void user();

    @EntityPolicy(entityClass = Customer.class, actions = EntityPolicyAction.CREATE)
    void customer();
}