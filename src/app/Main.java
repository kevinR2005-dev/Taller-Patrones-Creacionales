package app;

import model.*;

public class Main {
    public static void main(String[] args) {

        ConsecutivoFactura a = ConsecutivoFactura.getInstancia();
        ConsecutivoFactura b = ConsecutivoFactura.getInstancia();

        System.out.println(a == b); // true

        System.out.println(a.siguiente()); // 1
        System.out.println(b.siguiente()); // 2
        System.out.println(a.siguiente()); // 3

        // Crear objetos necesarios
        Cliente cliente = new Cliente(
                "Nicolás Sánchez",
                "nicolas@uq.edu.co"
        );

        Funcion funcion = new Funcion(
                "Avengers",
                "7:00 PM",
                "Sala 3"
        );

        Combo combo = new Combo(
                "Combo Familiar",
                25000
        );

        // COMPRA MÍNIMA
        Compra compraMinima = new Compra.Builder()
                .conCliente(cliente)
                .conFuncion(funcion)
                .conAsiento("A1")
                .build();

        System.out.println("Compra mínima creada correctamente.");


        // COMPRA COMPLETA
        Compra compraCompleta = new Compra.Builder()
                .conCliente(cliente)
                .conFuncion(funcion)
                .conAsiento("A2")
                .conAsiento("A3")
                .conCombo(combo)
                .conPuntos(100)
                .build();

        System.out.println("Compra completa creada correctamente.");
    }
}

