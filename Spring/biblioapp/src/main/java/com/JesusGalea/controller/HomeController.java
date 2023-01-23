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

@Controller
public class HomeController {
@GetMapping("/inicio")
public String mostrarHome(Model model) {
	model.addAttribute("mensaje", "uwu");
	return "home";
}
@GetMapping("/detalle")
public String mostrarDetalle(Model model) {
	List<String> lista = new LinkedList<>();
	lista.add("Dani");
	lista.add("ere");
	lista.add("luis");
	model.addAttribute("libros", lista);
	return "detalle";
}

}
