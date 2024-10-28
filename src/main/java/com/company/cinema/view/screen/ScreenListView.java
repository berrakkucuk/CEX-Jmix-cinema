package com.company.cinema.view.screen;

import com.company.cinema.entity.Screen;
import com.company.cinema.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "screens", layout = MainView.class)
@ViewController("Screen.list")
@ViewDescriptor("screen-list-view.xml")
@LookupComponent("screensDataGrid")
@DialogMode(width = "64em")
public class ScreenListView extends StandardListView<Screen> {
}