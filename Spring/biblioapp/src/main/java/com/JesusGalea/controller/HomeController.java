package com.JesusGalea.controller;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.JesusGalea.model.Categoria;
import com.JesusGalea.model.Libro;
import com.JesusGalea.repositories.CategoriasRepository;
import com.JesusGalea.repositories.LibrosRepository;
import com.JesusGalea.services.ILibroService;

@Controller
public class HomeController {
	
	@Autowired
	private ILibroService serviceLibro;
	
@GetMapping("/")
public String mostrarHome(Model model) {
	List<Libro> librosList = (List<Libro>) serviceLibro.findLibroByDestacado(1);
	model.addAttribute("libros", librosList);
	return "home";
}



}
