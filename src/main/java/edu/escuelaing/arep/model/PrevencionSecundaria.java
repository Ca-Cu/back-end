package edu.escuelaing.arep.model;

import java.util.Date;

public class PrevencionSecundaria {

    private int idPaciente;
    private int idMetodoTamizacion;
    private Date fechaTamizacion;
    private int idPruebaVPH;
    private boolean resultadoPruebaVPH;
    private Date fechaPruebVPH;

    public PrevencionSecundaria(int idPaciente, int idMetodoTamizacion, Date fechaTamizacion, int idPruebaVPH, boolean resultadoPruebaVPH, Date fechaPruebVPH) {
        this.idPaciente = idPaciente;
        this.idMetodoTamizacion = idMetodoTamizacion;
        this.fechaTamizacion = fechaTamizacion;
        this.idPruebaVPH = idPruebaVPH;
        this.resultadoPruebaVPH = resultadoPruebaVPH;
        this.fechaPruebVPH = fechaPruebVPH;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdMetodoTamizacion() {
        return idMetodoTamizacion;
    }

    public void setIdMetodoTamizacion(int idMetodoTamizacion) {
        this.idMetodoTamizacion = idMetodoTamizacion;
    }

    public Date getFechaTamizacion() {
        return fechaTamizacion;
    }

    public void setFechaTamizacion(Date fechaTamizacion) {
        this.fechaTamizacion = fechaTamizacion;
    }

    public int getIdPruebaVPH() {
        return idPruebaVPH;
    }

    public void setIdPruebaVPH(int idPruebaVPH) {
        this.idPruebaVPH = idPruebaVPH;
    }

    public boolean isResultadoPruebaVPH() {
        return resultadoPruebaVPH;
    }

    public void setResultadoPruebaVPH(boolean resultadoPruebaVPH) {
        this.resultadoPruebaVPH = resultadoPruebaVPH;
    }

    public Date getFechaPruebVPH() {
        return fechaPruebVPH;
    }

    public void setFechaPruebVPH(Date fechaPruebVPH) {
        this.fechaPruebVPH = fechaPruebVPH;
    }



    @Override
    public String toString() {
        return "PrevencionSecundaria{" +
                "idPaciente=" + idPaciente +
                ", idMetodoTamizacion=" + idMetodoTamizacion +
                ", fechaTamizacion='" + fechaTamizacion + '\'' +
                ", idPruebaVPH=" + idPruebaVPH +
                ", resultadoPruebaVPH=" + resultadoPruebaVPH +
                ", fechaPruebVPH='" + fechaPruebVPH + '\'' +
                '}';
    }
}
