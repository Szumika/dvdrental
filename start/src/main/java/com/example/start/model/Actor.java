package com.example.start.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Actor {
    @Id
    public Long actor_id;
    public String firstName;
    public String lastName;
//    @OneToMany(mappedBy = "actor")
//    Set<filmActor> ActorsInFilm;
    @ManyToMany(mappedBy = "actors")
    @JsonBackReference
    private List<Film> films;

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public Actor(long actor_id, String firstName, String lastName, List<FilmDTO> films) {
        this.actor_id = actor_id;
        this.firstName = firstName;
        this.lastName = lastName;
//        this.films = films;
    }

    public long getActor_id() {
        return actor_id;
    }

    public void setActor_id(long actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Actor(long actor_id, String firstName, String lastName) {
        this.actor_id = actor_id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor() {
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actor_id=" + actor_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
