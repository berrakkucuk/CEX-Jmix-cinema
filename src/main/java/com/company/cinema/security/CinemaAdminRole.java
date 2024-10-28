package com.company.cinema.security;

import com.company.cinema.entity.Booking;
import com.company.cinema.entity.Movie;
import com.company.cinema.entity.Screen;
import com.company.cinema.entity.Seat;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "cinemaAdmin", code = CinemaAdminRole.CODE, scope = "UI")
public interface CinemaAdminRole {
    String CODE = "cinema-admin";

    @EntityAttributePolicy(entityClass = Movie.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Movie.class, actions = EntityPolicyAction.ALL)
    void movie();

    @EntityAttributePolicy(entityClass = Screen.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Screen.class, actions = EntityPolicyAction.ALL)
    void screen();

    @EntityAttributePolicy(entityClass = Seat.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Seat.class, actions = EntityPolicyAction.ALL)
    void seat();

    @EntityAttributePolicy(entityClass = Booking.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Booking.class, actions = EntityPolicyAction.READ)
    void booking();

    @MenuPolicy(menuIds = {"Booking.list", "Movie.list", "Screen.list", "Seat.list"})
    @ViewPolicy(viewIds = {"Booking.list", "Movie.list", "Screen.list", "Seat.list", "LoginView", "MainView", "Movie.detail", "Screen.detail", "Screen.detailTestform", "Seat.detail"})
    void screens();
}