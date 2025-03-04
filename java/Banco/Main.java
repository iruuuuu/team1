/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Usuario01
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

        cuentas.add(new CuentaCorriente("CC001", 2000));
        cuentas.add(new CuentaAhorro("CA001", 500));
        cuentas.add(new CuentaAhorro("CA002", 1500));

        System.out.println("Cuentas antes de calcular intereses:");
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println(cuenta);
        }

        for (CuentaBancaria cuenta : cuentas) {
            cuenta.calcularIntereses();
        }

        System.out.println("\nCuentas después de calcular intereses:");
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println(cuenta);
        }

        System.out.println("\nRealizando una transferencia de 500 de CA002 a CC001...");
        cuentas.get(2).traspaso(cuentas.get(0), 500);

        System.out.println("\nCuentas después de la transferencia:");
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println(cuenta);
        }
    }
}
