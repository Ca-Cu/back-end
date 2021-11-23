package edu.escuelaing.arep.model;

import java.util.Date;

public class PrevencionPrimaria {

    private int idPaciente;
    private int idTipo;
    private int nDosis;
    private Date fechaDosis;

    public PrevencionPrimaria(int idPaciente, int idTipo, int nDosis, Date fechaDosis) {
        this.idPaciente = idPaciente;
        this.idTipo = idTipo;
        this.nDosis = nDosis;
        this.fechaDosis = fechaDosis;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getnDosis() {
        return nDosis;
    }

    public void setnDosis(int nDosis) {
        this.nDosis = nDosis;
    }

    public Date getFechaDosis() {
        return fechaDosis;
    }

    public void setFechaDosis(Date fechaDosis) {
        this.fechaDosis = fechaDosis;
    }

    @Override
    public String toString() {
        return "PrevencionPrimaria{" +
                "idPaciente=" + idPaciente +
                ", idTipo=" + idTipo +
                ", nDosis=" + nDosis +
                ", fechaDosis='" + fechaDosis + '\'' +
                '}';
    }
}
