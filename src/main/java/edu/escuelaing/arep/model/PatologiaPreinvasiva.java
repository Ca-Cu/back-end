package edu.escuelaing.arep.model;

import java.util.Date;

public class PatologiaPreinvasiva {

    private int idPaciente;
    private int idTipoPatologia;
    private String descripcion;
    private Date fechaDeLesion;
    private String institutoDeDiagnostico;

    public PatologiaPreinvasiva(int idPaciente, int idTipoPatologia, String descripcion, Date fechaDeLesion, String institutoDeDiagnostico) {
        this.idPaciente = idPaciente;
        this.idTipoPatologia = idTipoPatologia;
        this.descripcion = descripcion;
        this.fechaDeLesion = fechaDeLesion;
        this.institutoDeDiagnostico = institutoDeDiagnostico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdTipoPatologia() {
        return idTipoPatologia;
    }

    public void setIdTipoPatologia(int idTipoPatologia) {
        this.idTipoPatologia = idTipoPatologia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaDeLesion() {
        return fechaDeLesion;
    }

    public void setFechaDeLesion(Date fechaDeLesion) {
        this.fechaDeLesion = fechaDeLesion;
    }

    public String getInstitutoDeDiagnostico() {
        return institutoDeDiagnostico;
    }

    public void setInstitutoDeDiagnostico(String institutoDeDiagnostico) {
        this.institutoDeDiagnostico = institutoDeDiagnostico;
    }

    @Override
    public String toString() {
        return "PatologiaPreinvasiva{" +
                "idPaciente=" + idPaciente +
                ", idTipoPatologia=" + idTipoPatologia +
                ", descripcion='" + descripcion + '\'' +
                ", fechaDeLesion='" + fechaDeLesion + '\'' +
                ", institutoDeDiagnostico='" + institutoDeDiagnostico + '\'' +
                '}';
    }
}
