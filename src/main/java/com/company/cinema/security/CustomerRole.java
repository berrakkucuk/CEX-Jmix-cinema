package com.company.cinema.security;

import com.company.cinema.entity.Booking;
import com.company.cinema.entity.Customer;
import com.company.cinema.entity.Movie;
import com.company.cinema.entity.Seat;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.security.role.annotation.SpecificPolicy;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "Customer", code = CustomerRole.CODE)
public interface CustomerRole {
    String CODE = "customer";

    @MenuPolicy(menuIds = "NewBookingView")
    @ViewPolicy(viewIds = {"NewBookingView", "Booking.detail", "Booking.list", "LoginView", "MainView", "Movie.detail", "Movie.list", "Seat.list", "Seat.detail", "entityInfoView", "headerPropertyFilterLayout", "User.list", "Customer.list", "Screen.list", "datatl_entityInspectorListView", "datatl_entityInspectorDetailView", "flowui_AddConditionView", "flowui_GroupFilterCondition.detail", "flowui_JpqlFilterCondition.detail", "flowui_PropertyFilterCondition.detail", "multiValueSelectDialog", "flowui_DateIntervalDialog"})
    void screens();

    @EntityAttributePolicy(entityClass = Booking.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Booking.class, actions = {EntityPolicyAction.READ, EntityPolicyAction.UPDATE, EntityPolicyAction.CREATE})
    void booking();

    @EntityAttributePolicy(entityClass = Customer.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Customer.class, actions = {EntityPolicyAction.CREATE, EntityPolicyAction.READ, EntityPolicyAction.UPDATE})
    void customer();

    @EntityAttributePolicy(entityClass = Movie.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Movie.class, actions = EntityPolicyAction.READ)
    void movie();

    @EntityAttributePolicy(entityClass = Seat.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Seat.class, actions = EntityPolicyAction.READ)
    void seat();

    @SpecificPolicy(resources = "*")
    void specific();
}