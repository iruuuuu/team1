/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario01
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void iterator(ArrayList<Astro> astros) {
		
		// Creamos un iterador para la lista de astros.
        Iterator<Astro> iterator = astros.iterator(); 
        int i = 1; //Se pone 1 por que se usa el 0 para salir. Luego a la opción del usuario le quitaremos 1.

        // Usamos el iterador sobre la lista de astros y mostramos las opciones
        while (iterator.hasNext()) {
            Astro astro = iterator.next();
            System.out.println(i + ". " + astro.getNombre());
            i++;
        }
    }
	
	public static void main(String[] args) {
		
		//Un array list de tipo astro.
		ArrayList<Astro> astros = new ArrayList<Astro>();

		
		//Se crea la variable para poner en blanco los system.out.print.
		String reset = "\u001B[0m";
		
        // Crear objetos tipo Satelite.
        Satelite luna = new Satelite("Luna", 7.35E22, 3474.8, 27.3, 27.3, 0.384, "Tierra");
        Satelite europa = new Satelite("Europa", 4.8E22, 3121.6, 3.5, 365.5, 670000, "Jupiter");
        Satelite deimos = new Satelite("Deimos", 1.4762E15, 12.4, 1.263, 1.263, 23460, "Marte");
        Satelite phobos = new Satelite("Fobos", 1.0659E16, 22.4, 1.37, 1.37, 9377, "Marte");
		
        // Crear objetos de tipo planeta.
        Planeta tierra = new Planeta("Tierra", 5.972E24, 12742, 1, 365, 149.6, luna);
        Planeta jupiter = new Planeta("Jupiter", 1.898E27, 139820, 0.41, 4333, 778.5);
        Planeta marte = new Planeta("Marte", 6.4171E23, 6779, 1.026, 687, 227.9);
        
        
        // Añadimos las clases que heredan de astros a la propia lista.
        astros.add(tierra);
        astros.add(jupiter);
        astros.add(marte);
        astros.add(luna);
        astros.add(europa);
        astros.add(deimos);
        

        // Añadir satélites a los planetas con el metodo agregarSatelite, y el satelite en si.
        jupiter.añadirSatelite(europa);
        marte.añadirSatelite(deimos);
        marte.añadirSatelite(phobos);
        tierra.añadirSatelite(luna);

        
        //Creamos un escaner y el contador para el bucle.
        Scanner scanner1 = new Scanner(System.in);
        int contSalida = 0;
        
        
        /* Menú: Muestra los astros con todas las opciones y su posiciones. Lee el numero y muestra los datos de ese astro. Hay que hacer que si no pueda insertar nada, muestre un error. */
        while (contSalida == 0) {
        	System.out.println(reset + "Introduzca una de las siguientes opciones. Pulse 0 para salir.");
        	iterator(astros);
        	
        	int opcion = scanner1.nextInt();
        	
        	if (opcion == 0) {
        		contSalida++;
        	}
        	else if (opcion > 0 && opcion <= astros.size()) {
        		Astro seleccion = astros.get(opcion - 1);
        		
        		System.out.println("Detalles de " + seleccion.getNombre() + ":");
        		seleccion.mostrarInfo();	
        	}
        	else {
        		System.out.println("Error. La opcion no es valida.");
        	}
        }
        
        
	}

}
