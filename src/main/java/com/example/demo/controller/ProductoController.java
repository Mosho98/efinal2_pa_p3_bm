package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Producto;
import com.example.demo.service.IBodegaService;
import com.example.demo.service.IProductoService;


@Controller
@RequestMapping("/producto")//Nombre del recurso
public class ProductoController {

	@Autowired
	public IProductoService iProductoService;
	
	
	@GetMapping("/nuevoProducto")//insertar nuevos datos
	public String paginaNuevaPersona(Producto producto) {
		return "insertarProducto";	
	}
	
	@PostMapping("/insertar")
	public String insertarPersona(Producto producto) {
		this.iProductoService.crearProducto(producto);
		return "guardado";
	}
}
