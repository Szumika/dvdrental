package com.example.start.controler;

import com.example.start.model.Film;
import com.example.start.model.FilmAllDTO;
import com.example.start.repositories.ActorRepository;
import com.example.start.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    private ActorRepository ar;
    @Autowired
    private FilmRepository fr;

    @RequestMapping("/hello/{id}")
    public String hello(@PathVariable long id) {


        return ar.findById(id).toString();
    }

    @GetMapping("/start/{id}")
    public ResponseEntity<FilmAllDTO> start(@PathVariable(required = true) long id) {
        Optional<Film> emptyOpt = fr.findById(id);
        if (emptyOpt.isPresent()) {
            Film film = emptyOpt.get();
            FilmAllDTO filmAllDTO = new FilmAllDTO(film);
            return ResponseEntity.ok(filmAllDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
//            Mapper<Film, FilmDTO> userMapper = new Mapper<Film, FilmDTO>() {
//                @Override
//                public Film toEntity(FilmDTO dto) {
//                    Film film = new Film();
//                    return film;
//                }
//
//                @Override
//                public FilmDTO toDto(Film entity) {
//                    FilmDTO filmdto = new FilmDTO();
//                    return filmdto;
//                }
//            } ;