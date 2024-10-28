package com.company.cinema.view.booking;

import com.company.cinema.entity.Booking;
import com.company.cinema.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "bookings2", layout = MainView.class)
@ViewController("Booking.listCustomer2")
@ViewDescriptor("booking-list-view-customer2.xml")
@LookupComponent("bookingsDataGrid")
@DialogMode(width = "64em")
public class BookingListViewCustomer2 extends StandardListView<Booking> {
}