package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_seq")
	@SequenceGenerator(name = "prod_seq", sequenceName = "prod_seq", allocationSize = 1)
	
	@Column(name = "prod_id")
	private Integer id;
	
	@Column(name = "prod_nombre")
	private String nombre;
	
	@Column(name = "prod_barras_maestro")
	private String codigoBarras;
	
	@Column(name = "prod_categoria")
	private String categoría;	
	
	@Column(name = "pro_stock")
	private Integer stock;
	
	@Column(name = "pro_categoria")
	private String categoria;
	
	
	@OneToMany(mappedBy = "producto")
	private List<Inventario> inventario;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigoBarras() {
		return codigoBarras;
	}


	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}


	public String getCategoría() {
		return categoría;
	}


	public void setCategoría(String categoría) {
		this.categoría = categoría;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public List<Inventario> getInventario() {
		return inventario;
	}


	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", codigoBarras=" + codigoBarras + ", categoría="
				+ categoría + ", stock=" + stock + ", categoria=" + categoria + ", inventario=" + inventario + "]";
	}

	
	
	
	
	
	
	

}
