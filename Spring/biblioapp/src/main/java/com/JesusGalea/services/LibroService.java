package com.JesusGalea.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.JesusGalea.model.Categoria;
import com.JesusGalea.model.Libro;
import com.JesusGalea.repositories.LibrosRepository;
@Service
@Primary
public class LibroService implements ILibroService {
	@Autowired
    private LibrosRepository libroRepo;

    @Override
    public List<Libro> buscarTodas() {
        return libroRepo.findAll();
    }

    
    @Override
    public void guardarLibro(Libro libro) {
        libroRepo.save(libro);
    }

    @Override
    public void deleteById(int id) {
        libroRepo.deleteById(id);
    }

    @Override
    public Page<Libro> buscarTodas(org.springframework.data.domain.Pageable page) {
        return libroRepo.findAll(page);
    }

	@Override
	public Libro findLibroById(int id) {
		 Libro libro = libroRepo.findLibroById(id);
	        return libro;
	}
}
