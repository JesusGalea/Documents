package com.JesusGalea.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.JesusGalea.model.Categoria;
import com.JesusGalea.model.Libro;

public interface ILibroService {
	List<Libro> buscarTodas();
    void guardarLibro(Libro libro);
    void deleteById(int id);
    Libro findLibroById(int id);
    Page<Libro> buscarTodas(Pageable page);
}
