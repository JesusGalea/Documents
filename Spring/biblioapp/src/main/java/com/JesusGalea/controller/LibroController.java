package com.JesusGalea.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.JesusGalea.model.Libro;
import com.JesusGalea.services.ICategoriaService;
import com.JesusGalea.services.ILibroService;

@Controller
@RequestMapping(value="/libros")
public class LibroController {
	@Autowired
	private ILibroService serviceLibro;
	@Autowired
	private ICategoriaService serviceCategoria;
	
	
	
	@ModelAttribute
	public void setGenericos(Model model) {
	model.addAttribute("categorias", serviceCategoria.buscarTodas());
	}
	
	@GetMapping("/create")
	public String crear (Libro libro,Model model) {
		model.addAttribute("categorias", serviceCategoria.buscarTodas());
		return "formLibro";
	}
	

	@GetMapping("/listLibros")
	public String mostrarTabla(Model model) {
		List<Libro> lista = serviceLibro.buscarTodas();
		model.addAttribute("libros", lista);
		return "listLibros";
	}

	
	
	@PostMapping("/save")
	public String guardar(Libro libro,Model model) {
	serviceLibro.guardarLibro(libro);
	return "redirect:/libros/listLibros";
	}

	@InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
