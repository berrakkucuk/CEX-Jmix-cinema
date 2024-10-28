package com.company.cinema.view.booking;

import com.company.cinema.entity.Booking;
import com.company.cinema.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "bookings", layout = MainView.class)
@ViewController("Booking.list")
@ViewDescriptor("booking-list-view.xml")
@LookupComponent("bookingsDataGrid")
@DialogMode(width = "64em")
public class BookingListView extends StandardListView<Booking> {
}