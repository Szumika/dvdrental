//package com.example.start.model;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//public class filmActor {
//
//    @EmbeddedId
//    filmActorKey id;
//
//    @ManyToOne
//    @MapsId("film_id")
//    @JoinColumn(name = "film_id")
//    Film film;
//
//    @ManyToOne
//    @MapsId("actor_id")
//    @JoinColumn(name = "actor_id")
//    Actor actor;
//
//    private Date LastUpdate;
//
//    public filmActorKey getId() {
//        return id;
//    }
//
//    public void setId(filmActorKey id) {
//        this.id = id;
//    }
//
//    public Film getFilm() {
//        return film;
//    }
//
//    public void setFilm(Film film) {
//        this.film = film;
//    }
//
//    public Actor getActor() {
//        return actor;
//    }
//
//    public void setActor(Actor actor) {
//        this.actor = actor;
//    }
//
//    public Date getLastUpdate() {
//        return LastUpdate;
//    }
//
//    public void setLastUpdate(Date lastUpdate) {
//        LastUpdate = lastUpdate;
//    }
//
//    @Override
//    public String toString() {
//        return "filmActor{" +
//                "id=" + id +
//                ", film=" + film +
//                ", actor=" + actor +
//                ", LastUpdate=" + LastUpdate +
//                '}';
//    }
//}
