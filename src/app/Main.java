package app;

import model.ConsecutivoFactura;

public class Main {
    public static void main(String[] args) {

        ConsecutivoFactura a = ConsecutivoFactura.getInstancia();
        ConsecutivoFactura b = ConsecutivoFactura.getInstancia();

        System.out.println(a == b); // true

        System.out.println(a.siguiente()); // 1
        System.out.println(b.siguiente()); // 2
        System.out.println(a.siguiente()); // 3



    }
}