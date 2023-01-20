package com.Jesusgalea.bibliotecapp.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Jesusgalea.bibliotecapp.model.Categoria;
import com.Jesusgalea.bibliotecapp.model.Libro;

@Controller

public class HomeController {
	
	
@GetMapping("/")
public String mostrarHome (Model model) {
	model.addAttribute("mensaje", "Hola Mundo");
	return "home";
	

}

@GetMapping("/detalle")
public String mostrarDetalle(Model model) {
	List<String> lista = new LinkedList<>();
	lista.add("Caperucita roja");
	lista.add("Los tres cercitos");
	model.addAttribute("libros", lista);
	return "detalle";
}

@GetMapping("/tabla")
public String mostrarTabla(Model model) {
	List<Libro> lista = getLibros();
	
	model.addAttribute("libros", lista);
	return "tabla";
}

public List<Libro> getLibros() {
	List<Libro> libritos = new LinkedList<Libro>();
	Libro l1 = new Libro();
	l1.setId(1);
	l1.setAutor("Sarita");
	l1.setCategoria( new Categoria());
	l1.setDescripcion("cuando da el sol se giran");
	l1.setDestacado(1);
	l1.setDisponibilidad("Disponible");
	l1.setFecha(new Date());
	l1.setImagen("girasoles.png");
	l1.setPrecio(10.9);
	l1.setTitulo("los girasole");
	libritos.add(l1);
	Libro l2 = new Libro();
	l2.setId(2);
	l2.setAutor("wolta");
	l2.setCategoria( new Categoria());
	l2.setDescripcion("pu yo dik owei wolta");
	l2.setDestacado(1);
	l2.setDisponibilidad("Disponible");
	l2.setFecha(new Date());
	l2.setImagen("mike.jpg");
	l2.setPrecio(60.4);
	l2.setTitulo("brikin ba");
	libritos.add(l2);
	return libritos;
}
}
