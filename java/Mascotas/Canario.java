/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author Usuario01
 */
class Canario extends Aves {
    private String color;

    public Canario(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String color) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
    }

    @Override
    public void muestra() {
        System.out.println("Canario: " + nombre + ", Color: " + color + ", Edad: " + edad + ", Estado: " + estado);
    }

    @Override
    public void habla() {
        System.out.println(nombre + " canta: ¡Pio pio!");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " puede volzr");
    }
}
