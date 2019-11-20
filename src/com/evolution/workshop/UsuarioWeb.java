package com.evolution.workshop;

import java.util.Objects;

public class UsuarioWeb extends Cliente {
    private String usuario;
    private String password;

    public UsuarioWeb(String dni, String nombre, String apellidos, String email, Integer telefono, Long clienteId, boolean premium, String usuario, String password) {
        super(dni, nombre, apellidos, email, telefono, clienteId, premium);
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioWeb)) return false;
        if (!super.equals(o)) return false;
        UsuarioWeb that = (UsuarioWeb) o;
        return usuario.equals(that.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), usuario);
    }

    @Override
    public String toString() {
        return "UsuarioWeb{" +
                "dni='" + this.getDni() + '\'' +
                ", nombre='" + this.getNombre() + '\'' +
                ", apellidos='" + this.getApellidos() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", telefono=" + this.getTelefono() + '\'' +
                ", clienteId='" + this.getClienteId() + '\'' +
                ", premium=" + this.isPremium() + '\'' +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
