/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author Usuario01
 */

abstract class Aves extends Mascotas {
    protected String pico;
    protected boolean vuela;

    public Aves(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public abstract void volar();
}