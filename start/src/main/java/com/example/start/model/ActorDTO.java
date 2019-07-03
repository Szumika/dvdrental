package com.example.start.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ActorDTO {

    public String firstName;
    public String lastName;


    public ActorDTO(Actor actor) {
        this.firstName = actor.firstName;
        this.lastName = actor.lastName;
    }
}
