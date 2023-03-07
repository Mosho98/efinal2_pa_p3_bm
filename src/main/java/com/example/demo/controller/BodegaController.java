package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Bodega;
import com.example.demo.service.IBodegaService;

@Controller
@RequestMapping("/bodega")//Nombre del recurso
public class BodegaController {

	@Autowired
	public IBodegaService bodegaService;
	
	
	@GetMapping("/insertarNuevaBodega")//insertar nuevos datos
	public String paginaNuevaPersona(Bodega bodega) {
		return "insertarBodega";	
	}
	
	@PostMapping("/insertar")
	public String insertarPersona(Bodega bodega) {
		this.bodegaService.crearBodega(bodega);
		return "guardado";
	}
}
