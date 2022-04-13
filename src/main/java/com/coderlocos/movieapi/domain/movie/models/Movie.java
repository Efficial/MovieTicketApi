package com.coderlocos.movieapi.domain.movie.models;

import com.coderlocos.movieapi.domain.core.models.BaseClass;

import javax.persistence.Entity;

@Entity
public class Movie extends BaseClass {
    private String title;

    public Movie() {
    }

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
