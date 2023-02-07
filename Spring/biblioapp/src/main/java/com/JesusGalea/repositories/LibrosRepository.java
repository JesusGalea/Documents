package com.JesusGalea.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JesusGalea.model.Libro;

public interface LibrosRepository extends JpaRepository<Libro, Integer> {

	Libro findLibroById(int id);
	List<Libro> findLibroByDestacado(int dest);

}
