package com.JesusGalea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.JesusGalea.model.Categoria;
import com.JesusGalea.services.ICategoriaService;

@Controller
@RequestMapping(value = "/categorias")
public class CategoriaController {
	@Autowired
	private ICategoriaService serviceCategoria;

	@GetMapping("/listCategorias")
	public String mostrarIndex(Model model) {
		List<Categoria> categoriasList = serviceCategoria.buscarTodas();
		model.addAttribute("categorias", categoriasList);
		return "listCategorias";
	}

	@GetMapping("/formCategoria")
	public String mostrarForm(Categoria categoria) {
		return "formCategoria";
	}

	@PostMapping("/save")
	public String guardar(Categoria categoria, Model model) {
		serviceCategoria.guardarCategoria(categoria);
		return "redirect:/categorias/listCategorias";
	}

	@RequestMapping (value="/delete")
	public String borrar(@RequestParam("id") int id) {
		serviceCategoria.deleteById(id);
		return "redirect:/categorias/listCategorias";
	}

	
}
