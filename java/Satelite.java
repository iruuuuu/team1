/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario01
 */
public class Satelite extends Astro {
	
	
	//Se crea la variable verde para los system.out.print.
	String verde = "\u001B[32m";
	
	//Se le da el planeta que orbita.
    private String planetaqueorbita;

    // Constructor del satelite. Se llama a super para llamar al constructor de la clase padre, es decir, de Astro. Asi este puede usar los mismos atributos que ella.
    public Satelite(String nombre, double masa, double diametro, double rotacion, double traslacion, double distanciamedia, String planetaqueorbita) {
        super(nombre, masa, diametro, rotacion, traslacion, distanciamedia);
        this.planetaqueorbita = planetaqueorbita;
    }

    //Asigna el planeta al que orbita el satelite.
    public String getPlanetaQueOrbita() {
        return planetaqueorbita;
    }

    // Esto trae el metodo mostrar información del padre, que ahora declaramos, y además, añade el planeta al que orbita.
    public void mostrarInfo() {
        System.out.println(verde + "Nombre: " + nombre);
        System.out.println(verde + "Masa: " + masa + " kg");
        System.out.println(verde + "Diametro: " + diametro_medio + " km");
        System.out.println(verde + "Periodo de rotacion: " + periodorotacion + " dias");
        System.out.println(verde + "Periodo de traslacion: " + periodotraslacion + " dias");
        System.out.println(verde + "Distancia media al cuerpo que orbita: " + distanciamedia + " millones de km");
        System.out.println(verde + "Planeta que orbita: " + planetaqueorbita);
    }
}
