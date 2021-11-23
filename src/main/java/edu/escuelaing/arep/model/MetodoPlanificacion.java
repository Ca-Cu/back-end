package edu.escuelaing.arep.model;

public class MetodoPlanificacion {

    private int id;
    private String nombre;

    public MetodoPlanificacion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public MetodoPlanificacion(String nombre) {
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
        return "MetodoPlanificacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
