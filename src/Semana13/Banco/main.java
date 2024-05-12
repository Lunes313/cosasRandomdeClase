package Semana13.Banco;
//Laura Restrepo Berrio
//Fecha: 12/05/2024
//Semana 13 Ejercicio 3
public class main {
    public static void main(String[] args) {
        String titular = "juan";
        int id = 10;
        CuentaAhorros ca = new CuentaAhorros(titular, id);
        ca.depositar(15000);
        System.out.println(ca.consultar());
        ca.depositar(20000);
        System.out.println(ca.consultar());
        ca.retirar(10000);
        System.out.println(ca.consultar());
        ca.depositar(50000);
        System.out.println(ca.consultar());
        ca.retirar(200000);
        System.out.println(ca.consultar());
    }
}
