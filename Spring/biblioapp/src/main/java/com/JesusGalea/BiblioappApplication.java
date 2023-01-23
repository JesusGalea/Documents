package com.JesusGalea;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.JesusGalea.model.Categoria;
import com.JesusGalea.model.Libro;
import com.JesusGalea.repositories.CategoriasRepository;
import com.JesusGalea.repositories.LibrosRepository;


@SpringBootApplication
public class BiblioappApplication implements CommandLineRunner{

	@Autowired
	private CategoriasRepository categoriaRepository;
	@Autowired
	private LibrosRepository librosRepository;

	public static void main(String[] args){
		SpringApplication.run(BiblioappApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	}
	
	
	private void buscarTodosJpa() {
		List<Categoria> categorias = categoriaRepository.findAll();
		for(Categoria c : categorias) {
			System.out.println(c.getId() + " " + c.getNombre());
		}
	}
	/*
	private void buscarTodosSolicitudes() {
		List<Solicitudes> categorias = solicitudesRepository.findAll();
		for(Solicitudes c : categorias) {
			System.out.println(c.toString());
		}
	}
	private void buscarTodosPerfil() {
		List<Perfiles> categorias = perfilRepository.findAll();
		for(Perfiles c : categorias) {
			System.out.println(c.getId() + " " + c.getPerfil());
		}
	}
	*/
	
	private void buscarTodosJpa2() {
		List<Libro> libro = librosRepository.findAll();
		for(Libro c : libro) {
			System.out.println(c.toString());
		}
	}
	/*
	private void buscarTodasCategoriasOrdenadas() {
		List<Categoria> categorias = categoriaRepository.findAll(Sort.by("nombre").descending());
		for(Categoria c : categorias) {
			System.out.println(c.getId() + " " + c.getNombre());
		}
	}
	private void buscarPorPagina() {
		Page<Categoria> catPag = categoriaRepository.findAll(PageRequest.of(0, 5, Sort.by("nombre")));
		System.out.println("Total Registro: " + catPag.getTotalElements());
		System.out.println("Total Paginas: " + catPag.getTotalPages());
		for(Categoria c: catPag.getContent()) {
			System.out.println(c.getId() + " " + c.getNombre());
		}
	}
*/
}
