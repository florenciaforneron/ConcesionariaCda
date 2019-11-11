package ar.curso.escuela.conce.controller;

public class Auto{
	
	private Marca marca;
	private String modelo;
	private Double precio;
	
	public Auto( Marca marca,String modelo, Double precio) {
		setMarca(marca);
		setModelo(modelo);
		setPrecio(precio);
	}

	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}
