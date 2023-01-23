package com.JesusGalea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.JesusGalea.model.Categoria;
import com.JesusGalea.model.Libro;
import com.JesusGalea.repositories.LibrosRepository;
import com.JesusGalea.services.ICategoriaService;

@Controller
@RequestMapping(value="/categorias")
public class CategoriaController {
	@Autowired
	private ICategoriaService serviceCategoria;
	
	@RequestMapping(value="/listCategorias", method=RequestMethod.GET)
	    public String mostrarIndex(Model model) {
	        List<Categoria> categoriasList = serviceCategoria.buscarTodas();
	        model.addAttribute("categorias", categoriasList);
	        return "listCategorias";
	    }
	
	@Autowired
	private LibrosRepository librosRepository;
	@GetMapping("/listLibros")
	public String mostrarTabla(Model model) {
		List<Libro> lista = librosRepository.findAll();
		model.addAttribute("libro", lista);
		lista.get(0).setImagen("caperucita.png");
		return "listLibros";
	}


}