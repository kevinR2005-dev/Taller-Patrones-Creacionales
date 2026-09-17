package model;

public class ConsecutivoFactura {

    // 3 partes de un Singleton.
    // Una variable estática = constante.
    private static final ConsecutivoFactura instancia =
            new ConsecutivoFactura();

    // Una clase con constructor privado.
    private ConsecutivoFactura(){

    }

    // Un método público que sea estático.
    public static ConsecutivoFactura getInstancia(){
        return instancia;
    }
    private int ultimo = 0;

    public int siguiente() {
        return ++ultimo;
    }
}
