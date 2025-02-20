/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Usuario01
 */
abstract class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;
    protected static final double interesAnualBasico = 0.02;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        añadir(cantidad);
    }

    public void retirar(double cantidad) {
        añadir(-cantidad);
    }

    public void traspaso(CuentaBancaria destino, double cantidad) {
        if (saldo >= cantidad) {
            this.retirar(cantidad);
            destino.ingresar(cantidad);
        } else {
            System.out.println("Saldo de traspaso de tu cuenta");
        }
    }

    private void añadir(double cantidad) {
        saldo += cantidad;
    }

    public abstract void calcularIntereses();

    @Override
    public String toString() {
        return "Cuenta: " + numeroCuenta + ", Saldo: " + saldo;
    }
}
