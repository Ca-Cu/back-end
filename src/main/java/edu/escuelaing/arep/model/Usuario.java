package edu.escuelaing.arep.model;

import java.util.Date;

public class Usuario {
    private String id;
    private String tdoc;
    private int ndoc;
    private String nombres;
    private String apellidos;
    private Date fechaderegistro;
    private String nacionalidad;
    private String departamentodeorigen;
    private String municipiodeorigen;
    private String paisderesidencia;
    private String departamentoderesidencia;
    private String municipioderesidencia;
    private String direccionderesidencia;
    private Date fechadenacimiento;
    private int edad;
    private String estadocivil;
    private String niveleducativo;
    private String regimendesalud;
    private String eps;
    private String correo;
    private String contraseña;
    private String tipousuario;

    public Usuario(String id, String tdoc, int ndoc, String nombres, String apellidos, Date fechaderegistro, String nacionalidad, String departamentodeorigen, String municipiodeorigen, String paisderesidencia, String departamentoderesidencia, String municipioderesidencia, String direccionderesidencia, Date fechadenacimiento, int edad, String estadocivil, String niveleducativo, String regimendesalud, String eps, String correo, String contraseña, String tipousuario) {
        this.id = id;
        this.tdoc = tdoc;
        this.ndoc = ndoc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaderegistro = fechaderegistro;
        this.nacionalidad = nacionalidad;
        this.departamentodeorigen = departamentodeorigen;
        this.municipiodeorigen = municipiodeorigen;
        this.paisderesidencia = paisderesidencia;
        this.departamentoderesidencia = departamentoderesidencia;
        this.municipioderesidencia = municipioderesidencia;
        this.direccionderesidencia = direccionderesidencia;
        this.fechadenacimiento = fechadenacimiento;
        this.edad = edad;
        this.estadocivil = estadocivil;
        this.niveleducativo = niveleducativo;
        this.regimendesalud = regimendesalud;
        this.eps = eps;
        this.correo=correo;
        this.contraseña=contraseña;
        this.tipousuario=tipousuario;
    }

    public Usuario(String tdoc, int ndoc, String nombres, String apellidos, Date fechaderegistro, String nacionalidad, String departamentodeorigen, String municipiodeorigen, String paisderesidencia, String departamentoderesidencia, String municipioderesidencia, String direccionderesidencia, Date fechadenacimiento, int edad, String estadocivil, String niveleducativo, String regimendesalud, String eps, String correo, String contraseña, String tipousuario) {
        this.tdoc = tdoc;
        this.ndoc = ndoc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaderegistro = fechaderegistro;
        this.nacionalidad = nacionalidad;
        this.departamentodeorigen = departamentodeorigen;
        this.municipiodeorigen = municipiodeorigen;
        this.paisderesidencia = paisderesidencia;
        this.departamentoderesidencia = departamentoderesidencia;
        this.municipioderesidencia = municipioderesidencia;
        this.direccionderesidencia = direccionderesidencia;
        this.fechadenacimiento = fechadenacimiento;
        this.edad = edad;
        this.estadocivil = estadocivil;
        this.niveleducativo = niveleducativo;
        this.regimendesalud = regimendesalud;
        this.eps = eps;
        this.correo=correo;
        this.contraseña=contraseña;
        this.tipousuario=tipousuario;
    }

    public Usuario(String idpaciente, String tdoc, int ndoc, String nombres, String apellidos, Date fechaderegistro, String nacionalidad, String departamentodeorigen, String municipiodeorigen, String paisderesidencia, String departamentoderesidencia, String municipioderesidencia, String direccionderesidencia, Date fechadenacimiento, int edad, String estadocivil, String niveleducativo, String regimendesalud, String eps, String correo, String tipousuario) {
        this.id = idpaciente;
        this.tdoc = tdoc;
        this.ndoc = ndoc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaderegistro = fechaderegistro;
        this.nacionalidad = nacionalidad;
        this.departamentodeorigen = departamentodeorigen;
        this.municipiodeorigen = municipiodeorigen;
        this.paisderesidencia = paisderesidencia;
        this.departamentoderesidencia = departamentoderesidencia;
        this.municipioderesidencia = municipioderesidencia;
        this.direccionderesidencia = direccionderesidencia;
        this.fechadenacimiento = fechadenacimiento;
        this.edad = edad;
        this.estadocivil = estadocivil;
        this.niveleducativo = niveleducativo;
        this.regimendesalud = regimendesalud;
        this.eps = eps;
        this.correo = correo;
        this.tipousuario=tipousuario;
    }

    public Usuario(String id, String nombres, String apellidos, String contraseña, String tipousuario) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.tipousuario = tipousuario;
    }

    public String getIdpaciente() {
        return id;
    }

    public void setIdpaciente(String idpaciente) {
        this.id = idpaciente;
    }

    public String getTdoc() {
        return tdoc;
    }

    public void setTdoc(String tdoc) {
        this.tdoc = tdoc;
    }

    public int getNdoc() {
        return ndoc;
    }

    public void setNdoc(int ndoc) {
        this.ndoc = ndoc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaderegistro() {
        return fechaderegistro;
    }

    public void setFechaderegistro(Date fechaderegistro) {
        this.fechaderegistro = fechaderegistro;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDepartamentodeorigen() {
        return departamentodeorigen;
    }

    public void setDepartamentodeorigen(String departamentodeorigen) {
        this.departamentodeorigen = departamentodeorigen;
    }

    public String getMunicipiodeorigen() {
        return municipiodeorigen;
    }

    public void setMunicipiodeorigen(String municipiodeorigen) {
        this.municipiodeorigen = municipiodeorigen;
    }

    public String getPaisderesidencia() {
        return paisderesidencia;
    }

    public void setPaisderesidencia(String paisderesidencia) {
        this.paisderesidencia = paisderesidencia;
    }

    public String getDepartamentoderesidencia() {
        return departamentoderesidencia;
    }

    public void setDepartamentoderesidencia(String departamentoderesidencia) {
        this.departamentoderesidencia = departamentoderesidencia;
    }

    public String getMunicipioderesidencia() {
        return municipioderesidencia;
    }

    public void setMunicipioderesidencia(String municipioderesidencia) {
        this.municipioderesidencia = municipioderesidencia;
    }

    public String getDireccionderesidencia() {
        return direccionderesidencia;
    }

    public void setDireccionderesidencia(String direccionderesidencia) {
        this.direccionderesidencia = direccionderesidencia;
    }

    public Date getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(Date fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getNiveleducativo() {
        return niveleducativo;
    }

    public void setNiveleducativo(String niveleducativo) {
        this.niveleducativo = niveleducativo;
    }

    public String getRegimendesalud() {
        return regimendesalud;
    }

    public void setRegimendesalud(String regimendesalud) {
        this.regimendesalud = regimendesalud;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", tdoc='" + tdoc + '\'' +
                ", ndoc=" + ndoc +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaderegistro=" + fechaderegistro +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", departamentodeorigen='" + departamentodeorigen + '\'' +
                ", municipiodeorigen='" + municipiodeorigen + '\'' +
                ", paisderesidencia='" + paisderesidencia + '\'' +
                ", departamentoderesidencia='" + departamentoderesidencia + '\'' +
                ", municipioderesidencia='" + municipioderesidencia + '\'' +
                ", direccionderesidencia='" + direccionderesidencia + '\'' +
                ", fechadenacimiento=" + fechadenacimiento +
                ", edad=" + edad +
                ", estadocivil='" + estadocivil + '\'' +
                ", niveleducativo='" + niveleducativo + '\'' +
                ", regimendesalud='" + regimendesalud + '\'' +
                ", eps='" + eps + '\'' +
                ", correo='" + correo + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", tipousuario='" + tipousuario + '\'' +
                '}';
    }
}
