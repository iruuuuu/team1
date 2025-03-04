/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Producto;

/**
 *
 * @author Usuario01
 */
import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Manzana", 10);
        Producto p2 = new Producto("Banana", 20);
        Producto p3 = new Producto("Naranja", 15);
        Producto p4 = new Producto("Pera", 25);
        Producto p5 = new Producto("Uva", 30);

        ArrayList<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);

        System.out.println("Sin modificar:");
        Iterator<Producto> it = listaProductos.iterator();
        while (it.hasNext()) {
            Producto p = it.next();
            System.out.println("Producto: " + p.getNombre() + ", Cantidad: " + p.getCantidad());
        }

        listaProductos.remove(1);
        listaProductos.remove(2); 

        Producto nuevoProducto = new Producto("Kiwi", 18);
        listaProductos.add(listaProductos.size() / 2, nuevoProducto);

        System.out.println("Modificado:");
        it = listaProductos.iterator();
        while (it.hasNext()) {
            Producto p = it.next();
            System.out.println("Producto: " + p.getNombre() + ", Cantidad: " + p.getCantidad());
        }

        listaProductos.clear();
        System.out.println("Lista vacia: " + listaProductos.isEmpty());
    }
}