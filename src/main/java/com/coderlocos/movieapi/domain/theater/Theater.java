package com.coderlocos.movieapi.domain.theater;

import com.coderlocos.movieapi.domain.core.models.BaseClass;
import com.coderlocos.movieapi.domain.movie.models.Movie;

public class Theater extends BaseClass {
    private Movie movie;
    private Integer capacity;


    public Theater(Movie movie, Integer capacity) {
        this.movie = movie;
        this.capacity = capacity;
    }
}
