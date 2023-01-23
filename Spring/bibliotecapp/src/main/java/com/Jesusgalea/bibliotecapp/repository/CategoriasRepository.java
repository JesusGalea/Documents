package com.Jesusgalea.bibliotecapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jesusgalea.bibliotecapp.model.Categoria;

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {
	List<Categoria> buscarTodas();
	void guardarCategorias(Categoria categoria);
}
