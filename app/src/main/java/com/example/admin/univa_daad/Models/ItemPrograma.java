package com.example.admin.univa_daad.Models;

public class ItemPrograma {
    String id,fecha, horaIni, horaFin, descripcion;

    public ItemPrograma(String id, String fecha, String horaIni, String horaFin, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.horaIni = horaIni;
        this.horaFin = horaFin;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHoraIni() {
        return horaIni;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
