package model;

public class Funcion {
    private String pelicula;
    private String horario;
    private String sala;

    public Funcion(String pelicula, String horario, String sala) {
        this.pelicula = pelicula;
        this.horario = horario;
        this.sala = sala;
    }

    public String getPelicula() {
        return pelicula;
    }
}
