package com.evolution.workshop;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Factura {
//    Es troba formada per una col·lecció d'avaries, si es troba pagada o no i la data d'emissió.
//    Ha de tenir dos mètodes:
//    Ha de tenir un mètode que calculi el total de la factura. Si el client
//    és “premium” s’ha d’aplicar un 5% de descompte.
//    Ha de tenir un mètode estàtic per calcular l’IVA al 21%

    private long idFactura;
    private boolean estaPagado;
    private LocalDate fechaEmision;
    private List<Averia> listaAverias;

    public static final double IVA = 0.21;
    public static final double DESCUENTO_PREMIUM = 0.05;

    public Factura(long idFactura, boolean estaPagado, LocalDate fechaEmision, List<Averia> listaAverias) {
        this.idFactura = idFactura;
        this.estaPagado = estaPagado;
        this.fechaEmision = fechaEmision;
        this.listaAverias = listaAverias;
    }

    public long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(long idFactura) {
        this.idFactura = idFactura;
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

    public List<Averia> getListaAverias() {
        return listaAverias;
    }

    public void setListaAverias(List<Averia> listaAverias) {
        this.listaAverias = listaAverias;
    }


    public static double calculaIVA(double precio) {
        return precio * IVA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Factura)) return false;
        Factura factura = (Factura) o;
        return idFactura == factura.idFactura;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFactura);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", estaPagado=" + estaPagado +
                ", fechaEmision=" + fechaEmision +
                ", listaAverias=" + listaAverias +
                '}';
    }

    public double totalFactura() {
        double total=0;
        boolean clientePremium = false;
        for (Averia e: this.listaAverias) {
            total += e.getPrecio();
            if (e.getVehiculo().getPropietario().isPremium()) {clientePremium = true; }
        }
        if (clientePremium) {
            double descuento = (total * DESCUENTO_PREMIUM);
            total = total - descuento;
        }
        return total;
    }

    public double totalFacturaConIVA() {
        double total = totalFactura();
        return total + (total * IVA);
    }



//    public double calculaFactura(double precio) {
//        if (averia.vehiculo.propietario.isPremium()) { return precio + calculaIVA(precio) - (precio * 0.05); }
//            else { return precio + calculaIVA(precio);
//        }
//    }


}
