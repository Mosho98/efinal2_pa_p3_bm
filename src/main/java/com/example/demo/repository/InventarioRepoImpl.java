package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class InventarioRepoImpl implements IInventarioRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresarProducto(Producto producto) {
		this.entityManager.persist(producto);
		
	}


}
