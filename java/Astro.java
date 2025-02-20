/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario01
 */
public abstract class Astro {
	
	
	// Se crean los atributos de la clase padre.
	String nombre;
	double masa = 0;
	double diametro_medio = 0;
	double periodorotacion = 0;
	double periodotraslacion = 0;
	double distanciamedia = 0;

	
	//Se crea el constructor.
	public Astro(String nombre, double masa, double diametro, double rotacion, double traslacion, double distancia) {
		this.nombre = nombre;
		this.masa = masa;
		this.diametro_medio = diametro;
		this.periodorotacion = rotacion;
		this.periodotraslacion = traslacion;
		this.distanciamedia = distancia;
	}
	
	//Multiples metodos get.
	public String getNombre() {
		return this.nombre;
	}
	
	public double getMasa() {
		return this.masa;
	}
	
	public double getDiametro() {
		return this.diametro_medio;
	}
	
	public double getRotacion() {
		return this.periodorotacion;
	}
	
	public double getTraslacion() {
		return this.periodotraslacion;
	}
	
	public double getDistancia() {
		return this.distanciamedia;
	}
	
	
	//El metodo para mostrar toda la información del astro. Esta en modo abstracto apra que sean las subclases las que especifiquen como funciona.
    public abstract void mostrarInfo();
	
}
