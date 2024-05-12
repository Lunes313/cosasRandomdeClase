package Semana13.Banco;
//Laura Restrepo Berrio
//Fecha: 12/05/2024
//Semana 13 Ejercicio 3
public class CuentaAhorros {
    private String titular;
    private int id;
    private double saldo = 0;

    public CuentaAhorros(String titular, int id) {
        this.titular = titular;
        this.id = id;
    }

    public boolean depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Monto no válido");
            return false;
        }
        saldo += monto;
        return true;
    }

    public boolean retirar(double monto) {
        if (monto <= 0 || monto > saldo) {
            System.out.println("Monto no válido");
            return false;
        }
        saldo -= monto;
        return true;
    }

    public double consultar() {
        return saldo;
    }

}
