package com.evolution.workshop;

import java.util.Objects;

public class Averia{
//    Té les propietats de id, nom curt, descripció de l’avaria, preu i
//    nivell de gravetat  de l’avaria (classe enumerada amb els valors: lleugera, mitjana i greu).
//    També s’ha de vincular amb el mecànic que l’ha solucionada.

    private String id;
    private String nombreCorto;
    private String descripcion;
    private double precio;
    private Enum<GravedadAveria> gravedadAveriaEnum;
    private Trabajador mecanico;
    public Vehiculo vehiculo;

    public Averia(String id, String nombreCorto, String descripcion, double precio, Enum<GravedadAveria> gravedadAveriaEnum, Trabajador mecanico, Vehiculo vehiculo) {
        this.id = id;
        this.nombreCorto = nombreCorto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.gravedadAveriaEnum = gravedadAveriaEnum;
        this.mecanico = mecanico;
        this.vehiculo = vehiculo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Enum<GravedadAveria> getGravedadAveriaEnum() {
        return gravedadAveriaEnum;
    }

    public void setGravedadAveriaEnum(Enum<GravedadAveria> gravedadAveriaEnum) {
        this.gravedadAveriaEnum = gravedadAveriaEnum;
    }

    public Trabajador getMecanico() {
        return mecanico;
    }

    public void setMecanico(Trabajador mecanico) {
        this.mecanico = mecanico;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Averia)) return false;
        if (!super.equals(o)) return false;
        Averia averia = (Averia) o;
        return id.equals(averia.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }

    @Override
    public String toString() {
        return "Averia{" +
                "id='" + id + '\'' +
                ", nombreCorto='" + nombreCorto + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", gravedadAveriaEnum=" + gravedadAveriaEnum +
                ", mecanico=" + mecanico +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
