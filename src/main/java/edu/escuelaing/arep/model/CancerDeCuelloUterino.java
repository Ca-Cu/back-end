package edu.escuelaing.arep.model;

import java.util.Date;

public class CancerDeCuelloUterino {

    private int idPaciente;
    private Date fechadiagnostico;
    private String estadificacionFigo;
    private String tipoHistologico;
    private String manejoPrimario;
    private Date fechaInicioManejoPrimario;
    private Date fechaFinManejoPrimario;

    public CancerDeCuelloUterino(int idPaciente, Date fechadiagnostico, String estadificacionFigo, String tipoHistologico, String manejoPrimario, Date fechaInicioManejoPrimario, Date fechaFinManejoPrimario) {
        this.idPaciente = idPaciente;
        this.fechadiagnostico = fechadiagnostico;
        this.estadificacionFigo = estadificacionFigo;
        this.tipoHistologico = tipoHistologico;
        this.manejoPrimario = manejoPrimario;
        this.fechaInicioManejoPrimario = fechaInicioManejoPrimario;
        this.fechaFinManejoPrimario = fechaFinManejoPrimario;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechadiagnostico() {
        return fechadiagnostico;
    }

    public void setFechadiagnostico(Date fechadiagnostico) {
        this.fechadiagnostico = fechadiagnostico;
    }

    public String getEstadificacionFigo() {
        return estadificacionFigo;
    }

    public void setEstadificacionFigo(String estadificacionFigo) {
        this.estadificacionFigo = estadificacionFigo;
    }

    public String getTipoHistologico() {
        return tipoHistologico;
    }

    public void setTipoHistologico(String tipoHistologico) {
        this.tipoHistologico = tipoHistologico;
    }

    public String getManejoPrimario() {
        return manejoPrimario;
    }

    public void setManejoPrimario(String manejoPrimario) {
        this.manejoPrimario = manejoPrimario;
    }

    public Date getFechaInicioManejoPrimario() {
        return fechaInicioManejoPrimario;
    }

    public void setFechaInicioManejoPrimario(Date fechaInicioManejoPrimario) {
        this.fechaInicioManejoPrimario = fechaInicioManejoPrimario;
    }

    public Date getFechaFinManejoPrimario() {
        return fechaFinManejoPrimario;
    }

    public void setFechaFinManejoPrimario(Date fechaFinManejoPrimario) {
        this.fechaFinManejoPrimario = fechaFinManejoPrimario;
    }

    @Override
    public String toString() {
        return "CancerDeCuelloUterino{" +
                "idPaciente=" + idPaciente +
                ", fechadiagnostico='" + fechadiagnostico + '\'' +
                ", estadificacionFigo='" + estadificacionFigo + '\'' +
                ", tipoHistologico='" + tipoHistologico + '\'' +
                ", manejoPrimario='" + manejoPrimario + '\'' +
                ", fechaInicioManejoPrimario='" + fechaInicioManejoPrimario + '\'' +
                ", fechaFinManejoPrimario='" + fechaFinManejoPrimario + '\'' +
                '}';
    }
}
