/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author Usuario01
 */
import java.util.ArrayList;

class Inventario {
    private ArrayList<Mascotas> mascotas;

    public Inventario() {
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascotas mascota) {
        mascotas.add(mascota);
    }

    public void eliminarMascota(String nombre) {
        mascotas.removeIf(m -> m.getNombre().equalsIgnoreCase(nombre));
    }

    public void mostrarListaAnimales() {
        for (Mascotas m : mascotas) {
            System.out.println(m.getClass().getSimpleName() + ": " + m.getNombre());
        }
    }

    public void mostrarDatosAnimal(String nombre) {
        for (Mascotas m : mascotas) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                m.muestra();
                return;
            }
        }
        System.out.println("No se encontró el animal con nombre: " + nombre);
    }

    public void mostrarTodosLosDatos() {
        for (Mascotas m : mascotas) {
            m.muestra();
        }
    }

    public void vaciarInventario() {
        mascotas.clear();
        System.out.println("Inventario vaciado.");
    }
}
