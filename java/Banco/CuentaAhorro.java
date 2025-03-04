/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Usuario01
 */
class CuentaAhorro extends CuentaBancaria {
    private static final double saldoMinimo = 1000;

    public CuentaAhorro(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public void calcularIntereses() {
        if (saldo < saldoMinimo) {
            saldo += saldo * (interesAnualBasico / 2);
        } else {
            saldo += saldo * (interesAnualBasico * 2);
        }
    }
}
