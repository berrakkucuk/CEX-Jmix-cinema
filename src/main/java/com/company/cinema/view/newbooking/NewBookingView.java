package com.company.cinema.view.newbooking;


import com.company.cinema.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "new-booking-view", layout = MainView.class)
@ViewController("NewBookingView")
@ViewDescriptor("new-booking-view.xml")
public class NewBookingView extends StandardView {
}