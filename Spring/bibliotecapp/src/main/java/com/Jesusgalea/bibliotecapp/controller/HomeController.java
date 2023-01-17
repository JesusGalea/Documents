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
@RequestMapping("/home")
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

private List getLibros() {
	List<Libro> libritos = new LinkedList<Libro>();
	Libro l1 = new Libro();
	l1.setAutor("Sarita");
	l1.setCategoria( new Categoria());
	l1.setDescripcion("Sarita dime tu");
	l1.setDestacado(1);
	l1.setDisponibilidad("Disponible");
	l1.setFecha(new Date());

	libritos.add(l1);
	return libritos;
}
}
