package edu.escuelaing.arep.model;

public class InfoMedico {

    private int idMedico;
    private int idEspecialidad;

    public InfoMedico(int idMedico, int idEspecialidad) {
        this.idMedico = idMedico;
        this.idEspecialidad = idEspecialidad;
    }

    public InfoMedico(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }


    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    @Override
    public String toString() {
        return "InfoMedico{" +
                "idMedico=" + idMedico +
                ", idEspecialidad=" + idEspecialidad +
                '}';
    }
}
