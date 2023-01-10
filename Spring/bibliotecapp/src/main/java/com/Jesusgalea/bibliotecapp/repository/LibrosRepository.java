package com.Jesusgalea.bibliotecapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jesusgalea.bibliotecapp.model.Libro;

public interface LibrosRepository extends JpaRepository<Libro, Integer> {

}
