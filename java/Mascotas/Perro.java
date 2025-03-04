/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author Usuario01
 */
class Perro extends Mascotas {
    private String raza;
    private boolean tienePulgas;

    public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean tienePulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.tienePulgas = tienePulgas;
    }

    @Override
    public void muestra() {
        System.out.println("Perro: " + nombre + ", Raza: " + raza + ", Edad: " + edad + ", Estado: " + estado);
    }

    @Override
    public void habla() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
}