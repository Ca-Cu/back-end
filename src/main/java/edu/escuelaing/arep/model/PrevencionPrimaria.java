package edu.escuelaing.arep.model;

import java.util.Date;

public class PrevencionPrimaria {

    private String idPaciente;
    private int idTipo;
    private int nDosis;

    public PrevencionPrimaria(String idPaciente, int idTipo, int nDosis) {
        this.idPaciente = idPaciente;
        this.idTipo = idTipo;
        this.nDosis = nDosis;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
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


    @Override
    public String toString() {
        return "PrevencionPrimaria{" +
                "idPaciente=" + idPaciente +
                ", idTipo=" + idTipo +
                ", nDosis=" + nDosis +
                '}';
    }
}
