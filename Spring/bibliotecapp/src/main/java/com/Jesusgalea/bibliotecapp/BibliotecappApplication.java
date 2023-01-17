package com.Jesusgalea.bibliotecapp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.Jesusgalea.bibliotecapp.model.Categoria;
import com.Jesusgalea.bibliotecapp.model.Libro;
import com.Jesusgalea.bibliotecapp.repository.CategoriasRepository;
import com.Jesusgalea.bibliotecapp.repository.LibrosRepository;

@SpringBootApplication
public class BibliotecappApplication implements CommandLineRunner {
	@Autowired
	private CategoriasRepository categoriasRepo;

	@Autowired
	private LibrosRepository libroRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(BibliotecappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}
	
	private List<Categoria> buscarTodosJpa(){
		List<Categoria> categorias = categoriasRepo.findAll();
		for (Categoria c : categorias) {
			System.out.println(c.getId() + " " + c.getNombre());
		}
		return categorias;
		
	}
	
	private void buscarOrdenados() {
		List<Categoria> categorias = categoriasRepo.findAll(Sort.by("nombre"));
		for (Categoria c : categorias) {
			System.out.println(c.getId() + " " + c.getNombre());
		}
	}
	
	private void buscarPorPaginacion() {
		Page<Categoria> catPag = categoriasRepo.findAll(PageRequest.of(0, 5, Sort.by("nombre")));
		System.out.println("Total de registros: " + catPag.getTotalElements());
		System.out.println("Total de paginas: " + catPag.getTotalPages());
		for (Categoria c : catPag.getContent()) {
			System.out.println(c.getId() + " " + c.getNombre());
		}
	}
	
	private void guardarLibro() {
		Libro libro = new Libro();
		libro.setTitulo("libro prueba");
		libro.setAutor("sarita");
		libro.setFecha(new Date());
		libro.setPrecio(19.09);
		libro.setDisponibilidad("Disponible");
		libro.setDestacado(1);
		libro.setImagen("sarita.jpg");
		libro.setDescripcion("libro to guapo que ha escrito sarita isabelita jordanita gutirriezita");
		Categoria cat = new Categoria();
		cat.setId(8);
		libro.setCategoria(cat);
		libroRepo.save(libro);
	}
}
