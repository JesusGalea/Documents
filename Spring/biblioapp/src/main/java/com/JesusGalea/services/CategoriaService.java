package com.JesusGalea.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.JesusGalea.model.Categoria;
import com.JesusGalea.repositories.CategoriasRepository;
@Service
@Primary
public class CategoriaService implements ICategoriaService {
	@Autowired
    private CategoriasRepository categoriaRepo;

    @Override
    public List<Categoria> buscarTodas() {
        return categoriaRepo.findAll();
    }

    @Override
    public void guardarCategoria(Categoria categoria) {
        categoriaRepo.save(categoria);
    }

    @Override
    public void deleteById(int id) {
        categoriaRepo.deleteById(id);
    }

    @Override
    public Categoria findCategoriaById(int id) {
        // TODO Auto-generated method stub
        Categoria categoria = categoriaRepo.findCategoriaById(id);
        return categoria;
    }

    @Override
    public Page<Categoria> buscarTodas(org.springframework.data.domain.Pageable page) {
        return categoriaRepo.findAll(page);
    }
}
