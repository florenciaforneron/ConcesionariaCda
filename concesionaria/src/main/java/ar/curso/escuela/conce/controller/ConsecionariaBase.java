package ar.curso.escuela.conce.controller;

import java.util.ArrayList;
import java.util.List;


public class ConsecionariaBase {
	
	public static List<Auto> listaDeVehiculos;
	
	
	/*public ConsecionariaBase() {
		}
	public ConsecionariaBase(Auto auto) {
		cargarAuto(auto);}
		public void cargarAuto(Auto auto) {
			listaDeVehiculos.add(auto);}*/

	static {
		
		listaDeVehiculos = new ArrayList<Auto>();
		
		listaDeVehiculos.add(1, new Auto(Marca.PEUGEOT,"206", 150000.00));
		listaDeVehiculos.add(2, new Auto(Marca.PEUGEOT,"307", 170000.00));
		listaDeVehiculos.add(3, new Auto(Marca.AUDI,"a4", 250000.00));
		listaDeVehiculos.add(4, new Auto(Marca.AUDI,"a3", 350000.00));
		listaDeVehiculos.add(5, new Auto(Marca.AUDI,"a6", 190000.00));
		listaDeVehiculos.add(6, new Auto(Marca.PEUGEOT,"208", 270000.00));
		listaDeVehiculos.add(7, new Auto(Marca.MERCEDES,"206", 340000.00));
		listaDeVehiculos.add(8, new Auto(Marca.MERCEDES,"207", 570000.00));
		listaDeVehiculos.add(9, new Auto(Marca.PEUGEOT,"308", 520000.00));
		listaDeVehiculos.add(10, new Auto(Marca.PEUGEOT,"3008", 620000.00));
	}	
	
	public static List<Auto> getAuto() {
		return listaDeVehiculos;
	}

	public static void setAuto(ArrayList<Auto> listaDeVehiculos) {
		ConsecionariaBase.listaDeVehiculos = listaDeVehiculos;
	}

	public static void cargarVehiculo(Auto auto) {
		listaDeVehiculos.add(auto);
	}
	
	public static void setAuto(Auto auto) {
		
		listaDeVehiculos.add(auto);
	}

	
	

	

/*	public void imprimirListaVehiculo() {
		for (Auto v : listaDeVehiculos) {
			System.out.println("Nombre: " + v.toString());
		}
		imprimirEstadistico();
	}

	public void imprimirEstadistico() {
		System.out.println("=====================================================");
		System.out.println("Producto más caro: " + Collections.max(listaDeVehiculos).getMarca());
		System.out.println("Producto más barato: " + Collections.min(listaDeVehiculos).getMarca());
	}
	
	public void imprimirMarcaConLetraY(){
		
				listaDeVehiculos.stream().filter(vehiculo->vehiculo.getMarca().contains("y"));
				System.out.println(listaDeVehiculos);
		
				
	}*/

}
