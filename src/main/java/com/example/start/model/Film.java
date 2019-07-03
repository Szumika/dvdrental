package com.example.start.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Film {
    @Id
    public Long filmId;
    public String title;
    public String description;
//    public Date releaseYear;

    @ManyToMany
            @JoinTable(
            name = "film_actor",
            joinColumns = @JoinColumn(name = "filmId"),
            inverseJoinColumns = @JoinColumn(name = "actorId"))
    public List<Actor> actors;
//@OneToMany(mappedBy = "film")
//    Set<filmActor> ActorsInFilm;
    @ManyToMany
    @JoinTable(
            name = "film_category",
            joinColumns = @JoinColumn(name = "filmId"),
            inverseJoinColumns = @JoinColumn(name = "categoryId"))
    public List<Category> filmCategory;

    public Film(Long filmId, String title, String description, Date releaseYear, List<Actor> actors, List<Category> filmCategory) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
//        this.releaseYear = releaseYear;
//        this.actors = actors;
        this.filmCategory = filmCategory;
    }

    public Long getFilmId() {
        return filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

//    public Date getReleaseYear() {
//        return releaseYear;
//    }

//    public void setReleaseYear(Date releaseYear) {
//        this.releaseYear = releaseYear;
//    }

    public List<Category> getFilmCategory() {
        return filmCategory;
    }

    public void setFilmCategory(List<Category> filmCategory) {
        this.filmCategory = filmCategory;
    }

    public Film() {
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

//    public Date getRelese_year() {
//        return releaseYear;
//    }

//    public void setRelese_year(Date relese_year) {
//        this.releaseYear = relese_year;
//    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
//                ", releaseYear=" + releaseYear +
                ", actors=" + actors +
                ", filmCategory=" + filmCategory +
                '}';
    }
}
