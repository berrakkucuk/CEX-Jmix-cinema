package com.company.cinema.view.booking;

import com.company.cinema.entity.Booking;
import com.company.cinema.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "bookings2/:id", layout = MainView.class)
@ViewController("Booking.detailCustomer2")
@ViewDescriptor("booking-detail-view-customer2.xml")
@EditedEntityContainer("bookingDc")
public class BookingDetailViewCustomer2 extends StandardDetailView<Booking> {
}