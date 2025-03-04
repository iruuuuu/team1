/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

public class Main {
    public static void main(String[] args) {
        Inventario tienda = new Inventario();

        // Crear y agregar mascotas
        Perro perro1 = new Perro("Rex", 3, "Saludable", "10-05-2020", "Labrador", false);
        Gato gato1 = new Gato("Michi", 2, "Saludable", "15-08-2021", "Negro", true);
        Loro loro1 = new Loro("Paco", 5, "Saludable", "22-03-2018", "Corto", true, "Amazonas");
        Canario canario1 = new Canario("Piolin", 1, "Saludable", "30-11-2022", "Pequeño", true, "Amarillo");

        tienda.agregarMascota(perro1);
        tienda.agregarMascota(gato1);
        tienda.agregarMascota(loro1);
        tienda.agregarMascota(canario1);

        // Mostrar lista de animales
        System.out.println("Lista de Animales:");
        tienda.mostrarListaAnimales();

        // Mostrar datos de un animal específico
        System.out.println("Datos de Michi:");
        tienda.mostrarDatosAnimal("Michi");

        // Mostrar todos los datos
        System.out.println("Todos los datos de los animales:");
        tienda.mostrarTodosLosDatos();

        // Eliminar un animal
        tienda.eliminarMascota("Rex");
        System.out.println("Después de eliminar a Rex:");
        tienda.mostrarListaAnimales();

        // Vaciar inventario
        tienda.vaciarInventario();
        System.out.println("Después de vaciar el inventario:");
        tienda.mostrarListaAnimales();
    }
}
