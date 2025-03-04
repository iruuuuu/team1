/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author Usuario01
 */
abstract class Mascotas {
    protected String nombre;
    protected int edad;
    protected String estado;
    protected String fechaNacimiento;

    public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract void muestra();
    public abstract void habla();

    public void cumpleaños() {
        this.edad++;
    }

    public void morir() {
        this.estado = "Fallecido";
    }

    public String getNombre() {
        return nombre;
    }
}
