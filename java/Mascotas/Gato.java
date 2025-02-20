/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author Usuario01
 */
class Gato extends Mascotas {
    private String color;
    private boolean peloLargo;

    public Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public void muestra() {
        System.out.println("Gato: " + nombre + ", Color: " + color + ", Edad: " + edad + ", Estado: " + estado);
    }

    @Override
    public void habla() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}
