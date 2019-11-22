package com.evolution.workshop;

public class Trabajador extends Persona{
//    Hereda de persona. Com a dades pròpies tindrà el preu per hora i la categoria (classe enumerada: tècnic junior, tècnic senior o mestre taller).
//    Ha de tenir un mètode per calcular el preu setmanal del treballador tenint en compte que les jornades són de 8 hores diàries de dilluns a divendres.

    private long idTrabajador;
    private double precioHora;
    private Enum<CategoriaTrabajador> categoriaTrabajadorEnum;


    public Trabajador(String dni, String nombre, String apellidos, String email, Integer telefono, long idTrabajador, double precioHora, Enum<CategoriaTrabajador> categoriaTrabajadorEnum) {
        super(dni, nombre, apellidos, email, telefono);
        this.idTrabajador = idTrabajador;
        this.precioHora = precioHora;
        this.categoriaTrabajadorEnum = categoriaTrabajadorEnum;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public Enum<CategoriaTrabajador> getCategoriaTrabajadorEnum() {
        return categoriaTrabajadorEnum;
    }

    public void setCategoriaTrabajadorEnum(Enum<CategoriaTrabajador> categoriaTrabajadorEnum) {
        this.categoriaTrabajadorEnum = categoriaTrabajadorEnum;
    }

    public long getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(long idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "dni='" + this.getDni() + '\'' +
                ", nombre='" + this.getNombre() + '\'' +
                ", apellidos='" + this.getApellidos() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", telefono=" + this.getTelefono() + '\'' +
                ", precioHora=" + precioHora + '\'' +
                ", categoriaTrabajadorEnum=" + categoriaTrabajadorEnum +
                '}';
    }

    public double precioSemanal() { return this.precioHora * 8 * 5; }

}
