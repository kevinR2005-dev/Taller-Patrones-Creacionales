package model;

import java.util.List;

public class Compra    {

    private final Cliente cliente;
    private final Funcion funcion;
    private final List<String> asientos;
    private final Combo combo; // opcional
    private final int puntosRedimidos; // opcional

    //CONSTRUCTOR


    public Compra(Cliente cliente, Funcion funcion, List<String> asientos, Combo combo, int puntosRedimidos) {
        this.cliente = cliente;
        this.funcion = funcion;
        this.asientos = asientos;
        this.combo = combo;
        this.puntosRedimidos = puntosRedimidos;
    }
}
