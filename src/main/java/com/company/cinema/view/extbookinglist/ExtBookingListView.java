package com.company.cinema.view.extbookinglist;

import com.company.cinema.view.booking.BookingListView;
import com.company.cinema.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "extbookings", layout = MainView.class)
@ViewController("ext_Booking.list")
@ViewDescriptor("ext-booking-list-view.xml")
public class ExtBookingListView extends BookingListView {
    @ViewComponent
    private DataContext dataContext;
    @Autowired
    private Messages messages;
}