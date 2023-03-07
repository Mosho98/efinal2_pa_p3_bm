package com.example.demo.modelo.DTO;

public class ProductoDTO {

	private String numBodega;
	private String codigoBarras;
	private String cantidad;
	
	
	public String getNumBodega() {
		return numBodega;
	}
	public void setNumBodega(String numBodega) {
		this.numBodega = numBodega;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	
	@Override
	public String toString() {
		return "ProductoDTO [numBodega=" + numBodega + ", codigoBarras=" + codigoBarras + ", cantidad=" + cantidad
				+ "]";
	}
	
	
	
	
}
