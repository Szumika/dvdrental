package com.example.start.model;


import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class FilmAllDTO {
    public String filmname;
    public String desc;
    public List<ActorDTO> actors;
    public List<CategoryDTO> cat;

    public FilmAllDTO(String filmname, String desc, List<ActorDTO> actros, List<CategoryDTO> cat) {
        this.filmname = filmname;
        this.desc = desc;
        this.actors = actros;
        this.cat = cat;
    }

    public FilmAllDTO(Film film) {
        this.actors = film.getActors().stream()
                .map(ActorDTO::new)
                .collect(Collectors.toList());
        this.cat = film.getFilmCategory().stream()
                .map(CategoryDTO::new)
                .collect(Collectors.toList());
        this.filmname = film.getTitle();
        this.desc = film.getDescription();
    }

    @Override
    public String toString() {
        return "FilmAllDTO{" +
                "filmname='" + filmname + '\'' +
                ", desc='" + desc + '\'' +
                ", actros='" + actors + '\'' +
                ", cat='" + cat + '\'' +
                '}';
    }
}
