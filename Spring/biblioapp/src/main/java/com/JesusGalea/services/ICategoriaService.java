package com.JesusGalea.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.JesusGalea.model.Categoria;

public interface ICategoriaService {
	List<Categoria> buscarTodas();
    void guardarCategoria(Categoria categoria);
    void deleteById(int id);
    Categoria findCategoriaById(int id);
    Page<Categoria> buscarTodas(Pageable page);
}
