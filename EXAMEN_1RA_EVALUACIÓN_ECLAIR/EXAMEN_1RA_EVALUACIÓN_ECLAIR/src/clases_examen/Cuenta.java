/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases_examen;

/**
 *
 * @author Omar Carrillo
 */
public class Cuenta {
   

    // Atributos
    private String numeroCuenta;
    private String cliente;
    private double saldo;

    // Constructor sin parámetros
    public Cuenta() {
        this.numeroCuenta = "";
        this.cliente = "";
        this.saldo = 0.0;
    }

    // Constructor con parámetros
    public Cuenta(String numeroCuenta, String cliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    // Métodos set y get para cada atributo
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para depositar en cuenta
    public void depositarEnCuenta(double monto) {
        saldo += monto;
    }

    // Método para retirar de cuenta
    public void retirarDeCuenta(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    // Método para imprimir los datos del cliente
    public void imprimirDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: " + saldo);
    }

}
