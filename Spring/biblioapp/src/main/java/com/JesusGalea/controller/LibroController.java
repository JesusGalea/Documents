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
import com.JesusGalea.services.ILibroService;

@Controller
@RequestMapping(value="/libros")
public class LibroController {
	@Autowired
	private ILibroService serviceLibro;
	
		

	@GetMapping("/listLibros")
	public String mostrarTabla(Model model) {
		List<Libro> lista = serviceLibro.buscarTodas();
		model.addAttribute("libros", lista);
		return "listLibros";
	}


}
