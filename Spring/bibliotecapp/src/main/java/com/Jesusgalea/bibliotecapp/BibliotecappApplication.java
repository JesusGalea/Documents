package com.Jesusgalea.bibliotecapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Jesusgalea.bibliotecapp.model.Categoria;
import com.Jesusgalea.bibliotecapp.repository.CategoriasRepository;

@SpringBootApplication
public class BibliotecappApplication implements CommandLineRunner {
	@Autowired
	private CategoriasRepository categoriasRepo;

	public static void main(String[] args) {
		SpringApplication.run(BibliotecappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		buscarTodosJpa();
		
	}
	
	private List<Categoria> buscarTodosJpa(){
		List<Categoria> categorias = categoriasRepo.findAll();
		for (Categoria c : categorias) {
			System.out.println(c.getId() + " " + c.getNombre());
		}
		return categorias;
		
	}

}
