package com.evolution.workshop;

public class Trabajador extends Persona{
//    Hereda de persona. Com a dades pròpies tindrà el preu per hora i la categoria (classe enumerada: tècnic junior, tècnic senior o mestre taller).
//    Ha de tenir un mètode per calcular el preu setmanal del treballador tenint en compte que les jornades són de 8 hores diàries de dilluns a divendres.

    private double precioHora;
    private enum Categoria {TECNICO_JUNIOR, TECNICO_SUPERIOR, MAESTRO_TALLER};
    public Enum<Categoria> categoria;
    public double precioSemanal() { return precioHora * 8 * 5; };

    public Trabajador(String dni, String nombre, String apellidos, String email, Integer telefono, double precioHora, Enum<Categoria> categoria) {
        super(dni, nombre, apellidos, email, telefono);
        this.precioHora = precioHora;
        this.categoria = categoria;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public Enum<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(Enum<Categoria> categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "dni='" + this.getDni() + '\'' +
                ", nombre='" + this.getNombre() + '\'' +
                ", apellidos='" + this.getApellidos() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", telefono=" + this.getTelefono() + '\'' +
                "precioHora=" + precioHora + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
