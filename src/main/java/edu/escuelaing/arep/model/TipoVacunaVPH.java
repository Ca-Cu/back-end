package edu.escuelaing.arep.model;

public class TipoVacunaVPH {

    private int id;
    private String nombre;

    public TipoVacunaVPH(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public TipoVacunaVPH(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TipoPrevencionPrimaria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
