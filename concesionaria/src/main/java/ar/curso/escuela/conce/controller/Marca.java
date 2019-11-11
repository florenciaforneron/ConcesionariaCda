package ar.curso.escuela.conce.controller;

public enum Marca {
	
	PEUGEOT("peugeot"), AUDI("audi"), MERCEDES("mercedes");
	
	private String marca;
	private Integer cantidad;
	
	private Marca(String marca) {
		this.marca = marca;
	}

	private Marca(String marca, Integer cantidad) {
		this.marca = marca;
		this.cantidad = cantidad;
	}

	public String getMarca() {
		return marca;
	}

	public Integer getCantidad() {
		return cantidad;
	}


}
