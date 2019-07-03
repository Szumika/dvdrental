package com.example.start.controler;

import com.example.start.model.Film;
import com.example.start.repositories.ActorRepository;
import com.example.start.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
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


        return  fr.findById(id).toString();
    }

    @GetMapping("/start/{id}")
    public Optional<Film> start(@PathVariable(required = true) long id) {
        return fr.findById(id);
    }

}
