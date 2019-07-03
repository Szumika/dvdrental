package com.example.start.model;

public class FilmMapper implements Mapper<Film, FilmDTO> {

    @Override
    public Film toEntity(FilmDTO dto){
        Film film = new Film();
        film.setActors(dto.getActors());
        film.setDescription(dto.getDescription());
        film.setFilmCategory(dto.getFilmCategory());
        film.setTitle(dto.getTitle());
        return film;
    }

    @Override
    public FilmDTO toDto(Film entity) {
        FilmDTO filmdto = new FilmDTO();
        filmdto.setTitle(entity.getTitle());
        filmdto.setDescription(entity.getDescription());
        filmdto.setActors(entity.getActors());
        filmdto.setFilmCategory(entity.getFilmCategory());
        return filmdto;
    }
}
