package model;

import java.util.ArrayList;
import java.util.List;

public class Compra    {

    private final Cliente cliente;
    private final Funcion funcion;
    private final List<String> asientos;
    private final Combo combo; // opcional
    private final int puntosRedimidos; // opcional

    //CONSTRUCTOR

    // Constructor privado que recibe el Builder
    private Compra(Builder b) {
        this.cliente = b.cliente;
        this.funcion = b.funcion;
        this.asientos = b.asientos;
        this.combo = b.combo;
        this.puntosRedimidos = b.puntosRedimidos;
    }
 //clase interna Builder

    public static class Builder {
        private Cliente cliente;
        private Funcion funcion;
        private List<String> asientos = new ArrayList<>();
        private Combo combo;
        private int puntosRedimidos = 0;

        public Builder conCliente(Cliente c) {
            this.cliente = c;
            return this;
        }

        public Builder conFuncion(Funcion f) {
            this.funcion = f;
            return this;
        }

        public Builder conAsiento(String asiento) {
            this.asientos.add(asiento);
            return this;
        }

        public Builder conCombo(Combo combo) {
            this.combo = combo;
            return this;
        }

        public Builder conPuntos(int puntos) {
            this.puntosRedimidos = puntos;
            return this;
        }

        public Compra build() {

            // Validación 1: el cliente es obligatorio
            if (cliente == null) {
                throw new IllegalStateException("El cliente es obligatorio");
            }

            // Validación 2: la función es obligatoria
            if (funcion == null) {
                throw new IllegalStateException("La función es obligatoria");
            }

            // Validación 3: debe existir al menos un asiento
            if (asientos.isEmpty()) {
                throw new IllegalStateException("Debe haber al menos un asiento");
            }

            return new Compra(this);
        }

    }
}
