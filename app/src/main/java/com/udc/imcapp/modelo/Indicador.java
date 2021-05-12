package com.udc.imcapp.modelo;

public class Indicador {
    private String mensaje;
    private int imagen;

    public Indicador(String mensaje, int imagen) {
        this.mensaje = mensaje;
        this.imagen = imagen;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
