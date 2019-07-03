package com.example.start.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


public class FilmDTO {
    public String title;
    public String description;

    @ManyToMany
            @JoinTable(
            name = "film_actor",
            joinColumns = @JoinColumn(name = "filmId"),
            inverseJoinColumns = @JoinColumn(name = "actorId"))
    @JsonManagedReference
    public List<Actor> actors;

    @ManyToMany
    @JoinTable(
            name = "film_category",
            joinColumns = @JoinColumn(name = "filmId"),
            inverseJoinColumns = @JoinColumn(name = "categoryId"))
    @JsonManagedReference
    public List<Category> filmCategory;

    public FilmDTO( String title, String description, Date releaseYear, List<Actor> actors, List<Category> filmCategory) {

        this.title = title;
        this.description = description;
        this.actors = actors;
        this.filmCategory = filmCategory;
    }


    public List<Category> getFilmCategory() {
        return filmCategory;
    }

    public void setFilmCategory(List<Category> filmCategory) {
        this.filmCategory = filmCategory;
    }

    public FilmDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }


}
