package com.evolution.workshop;

import java.util.Objects;

public class Vehiculo {
//    matrícula, model, any de matriculació i propietari del vehicle.
    private String matricula;
    private String modelo;
    private Integer matriculacion;
    private String propietario;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String modelo, Integer matriculacion, String propietario) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.matriculacion = matriculacion;
        this.propietario = propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getMatriculacion() {
        return matriculacion;
    }

    public void setMatriculacion(Integer matriculacion) {
        this.matriculacion = matriculacion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return matricula.equals(vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matriculacion=" + matriculacion +
                ", propietario='" + propietario + '\'' +
                '}';
    }
}
