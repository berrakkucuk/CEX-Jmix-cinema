package com.company.cinema.view.screen;

import com.company.cinema.entity.Screen;
import com.company.cinema.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "screens/:id", layout = MainView.class)
@ViewController("Screen.detail")
@ViewDescriptor("screen-detail-view.xml")
@EditedEntityContainer("screenDc")
public class ScreenDetailView extends StandardDetailView<Screen> {
}