package com.Jesusgalea.bibliotecapp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CategoriasController {
	@GetMapping("/index")
	@RequestMapping(value ="/index", method =RequestMethod.GET)
	public String mostrarIndex(Model model) {
		return "categorias/listCategorias";
	}
	@GetMapping("/create")
	@RequestMapping (value ="/create", method=RequestMethod.GET)
	public String crear() {
		return "categorias/formCategoria";
	}
	@PostMapping("/")
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String guardar() {
		return "categorias/listCategorias";
	}
} 
