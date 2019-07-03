package com.example.start.controler;

import com.example.start.repositories.ActorRepository;
import com.example.start.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private ActorRepository ar;
    @Autowired
    private FilmRepository fr;

    @RequestMapping("/hello/{id}")
    public String hello(@PathVariable long id){
      String actorById =  ar.findById(id).toString();
      String FilmById = fr.findById(id).toString();
        return actorById + " \n\n" +  " hej   " + FilmById ;
    }

}
