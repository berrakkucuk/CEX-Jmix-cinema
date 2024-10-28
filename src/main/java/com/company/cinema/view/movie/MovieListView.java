package com.company.cinema.view.movie;

import com.company.cinema.entity.Movie;
import com.company.cinema.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "movies", layout = MainView.class)
@ViewController("Movie.list")
@ViewDescriptor("movie-list-view.xml")
@LookupComponent("moviesDataGrid")
@DialogMode(width = "64em")
public class MovieListView extends StandardListView<Movie> {
}