package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Producto;
import com.example.demo.modelo.DTO.ProductoDTO;

public interface IInventarioRepository {

	public void ingresarProducto(Producto producto);
	
}
