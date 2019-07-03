package com.example.start.model;

public interface Mapper<E, D> {

    E toEntity(D dto);

    D toDto(E entity);
}