package com.JesusGalea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JesusGalea.model.Categoria;

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {
	Categoria findCategoriaById(int id);
}
