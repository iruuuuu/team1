/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario01
 */
import java.util.ArrayList;

public class Planeta extends Astro{
	
	//Creamos la variable para mostrar el texto de manera verde.
	String verde = "\u001B[32m";
	
	//Se crea la lista de arrays para satelites. Es un atributo único de esta clase.
	private ArrayList<Satelite> satelites;
	
	//Se crea el constructor, obteniendo los parametros del padre con Super y añadiendo el de los satelites.
	public Planeta(String nombre, double masa, double diametro, double rotacion, double traslacion, double distancia) {
        super(nombre, masa, diametro, rotacion, traslacion, traslacion);
        this.satelites = new ArrayList<>();
	}
	
	public Planeta(String nombre, double masa, double diametro, double rotacion, double traslacion, double distancia, Satelite satelite) {
        super(nombre, masa, diametro, rotacion, traslacion, traslacion);
        this.satelites = new ArrayList<>();
        this.satelites.add(satelite);
	}
	
	//Función para agregar un satelite a la lista del array.
	public void añadirSatelite(Satelite satelite) {
		satelites.add(satelite);
	}
	
	//Se crea el metodo de mostrar info. Si la lista esta vacia no se muestra, si la lista no esta vacia, se usa mostrarInfo (el del padre heredado que acabamos de declarar) en los satelites.
	public void mostrarInfo() {
        System.out.println(verde + "Nombre: " + nombre);
        System.out.println(verde + "Masa: " + masa + " kg");
        System.out.println(verde + "Diametro: " + diametro_medio + " km");
        System.out.println(verde + "Periodo de rotacion: " + periodorotacion + " dias");
        System.out.println(verde + "Periodo de traslacion: " + periodotraslacion + " dias");
        System.out.println(verde + "Distancia media al cuerpo que orbita: " + distanciamedia + " millones de km");
		if (satelites.isEmpty()) {
			System.out.println("No tiene satelites.");
		}
		else {
			System.out.println("Los satelites son:");
			//Si tiene satelites, se muestra la info de la variable satelite que es de tipo Satelite y que recorre la lista satelites. Y a la vez, muestra información de cada satelite.
			for (Satelite satelite : satelites) {
				satelite.mostrarInfo();
			}
		}
	}
	
}
