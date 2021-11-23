package edu.escuelaing.arep.model;

public class HistoriaSexual {

    private int idPaciente;
    private int edadinicio;
    private int numeroDeCompañeros;
    private int paridad;
    private int idMetodoDePlanificacion;

    public HistoriaSexual(int idPaciente, int edadinicio, int numeroDeCompañeros, int paridad, int idMetodoDePlanificacion) {
        this.idPaciente = idPaciente;
        this.edadinicio = edadinicio;
        this.numeroDeCompañeros = numeroDeCompañeros;
        this.paridad = paridad;
        this.idMetodoDePlanificacion = idMetodoDePlanificacion;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getEdadinicio() {
        return edadinicio;
    }

    public void setEdadinicio(int edadinicio) {
        this.edadinicio = edadinicio;
    }

    public int getNumeroDeCompañeros() {
        return numeroDeCompañeros;
    }

    public void setNumeroDeCompañeros(int numeroDeCompañeros) {
        this.numeroDeCompañeros = numeroDeCompañeros;
    }

    public int getParidad() {
        return paridad;
    }

    public void setParidad(int paridad) {
        this.paridad = paridad;
    }

    public int getIdMetodoDePlanificacion() {
        return idMetodoDePlanificacion;
    }

    public void setIdMetodoDePlanificacion(int idMetodoDePlanificacion) {
        this.idMetodoDePlanificacion = idMetodoDePlanificacion;
    }

    @Override
    public String toString() {
        return "HistoriaSexual{" +
                "idPaciente=" + idPaciente +
                ", edadinicio=" + edadinicio +
                ", numeroDeCompañeros=" + numeroDeCompañeros +
                ", paridad=" + paridad +
                ", idMetodoDePlanificacion='" + idMetodoDePlanificacion + '\'' +
                '}';
    }
}
