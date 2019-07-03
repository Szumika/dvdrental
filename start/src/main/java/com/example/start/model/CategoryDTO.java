package com.example.start.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDTO {

    public String name;


    public CategoryDTO(Category cat) {
        this.name = cat.name;
    }

    public CategoryDTO() {
    }

}
