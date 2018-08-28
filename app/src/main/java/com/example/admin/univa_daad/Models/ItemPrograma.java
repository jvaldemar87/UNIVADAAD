package com.example.admin.univa_daad.Models;

public class ItemPrograma {
    String id,fecha, horaIni, horaFin,nombre, descripcion;

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

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ItemPrograma(String id, String fecha, String horaIni, String horaFin, String nombre, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.horaIni = horaIni;
        this.horaFin = horaFin;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
