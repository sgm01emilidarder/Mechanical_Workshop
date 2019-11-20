package com.evolution.workshop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
//    Es troba formada per una col·lecció d'avaries, si es troba pagada o no i la data d'emissió.
//    Ha de tenir dos mètodes:
//    Ha de tenir un mètode que calculi el total de la factura. Si el client
//    és “premium” s’ha d’aplicar un 5% de descompte.
//    Ha de tenir un mètode estàtic per calcular l’IVA al 21%

    List<Averia> averias = new ArrayList<>();
    private boolean estaPagado;
    private LocalDate fechaEmision;
    private Averia averia;

    public Factura(List<Averia> averias, boolean estaPagado, LocalDate fechaEmision, Averia averia) {
        this.averias = averias;
        this.estaPagado = estaPagado;
        this.fechaEmision = fechaEmision;
        this.averia = averia;
    }

    public List<Averia> getAverias() {
        return averias;
    }

    public void setAverias(List<Averia> averias) {
        this.averias = averias;
    }

    public boolean isEstaPagado() {
        return estaPagado;
    }

    public void setEstaPagado(boolean estaPagado) {
        this.estaPagado = estaPagado;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Averia getAveria() {
        return averia;
    }

    public void setAveria(Averia averia) {
        this.averia = averia;
    }

    public static double getIVA() {
        return IVA;
    }

    static final double IVA = 0.21;

    public static double calculaIVA(double precio) {
        return precio * IVA;
    }

    public double calculaFactura(double precio) {
        if (averia.vehiculo.propietario.isPremium()) { return precio + calculaIVA(precio) - (precio * 0.05); }
            else { return precio + calculaIVA(precio);
        }
    }


}
