package com.evolution.workshop;

import java.util.Objects;

public class Cliente extends Persona{
//    id de client (numèric tipus long) i si és “premium” o no (client soci del taller).
    private Long clienteId;
    private boolean premium;

    public Cliente(String dni, String nombre, String apellidos, String email, Integer telefono, Long clienteId, boolean premium) {
        super(dni, nombre, apellidos, email, telefono);
        this.clienteId = clienteId;
        this.premium = premium;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return clienteId.equals(cliente.clienteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), clienteId);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "clienteId='" + clienteId + '\'' +
                ", nombre='" + this.getNombre() + '\'' +
                ", apellidos='" + this.getApellidos() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", telefono=" + this.getTelefono() + '\'' +
                ", premium=" + premium +
                '}';
    }
}
