/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author Usuario01
 */
class Loro extends Aves {
    private String origen;

    public Loro(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String origen) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
    }

    @Override
    public void muestra() {
        System.out.println("Loro: " + nombre + ", Origen: " + origen + ", Edad: " + edad + ", Estado: " + estado);
    }

    @Override
    public void habla() {
        System.out.println(nombre + " dice: ¡Hola! Soy un loro.");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }
}
