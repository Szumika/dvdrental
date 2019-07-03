package com.example.start.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Category {
    @Id
    public Long categoryId;
    public String name;
    @ManyToMany(mappedBy = "filmCategory")
    @JsonBackReference
    private List<Film> film;

    public List<Film> getFilm() {
        return film;
    }

    public Category(Long categoryId, String name, List<Film> film) {
        this.categoryId = categoryId;
        this.name = name;
        this.film = film;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                '}';
    }

    public void setFilm(List<Film> film) {
        this.film = film;
    }

    public Category(Long categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }

}
