package edu.escuelaing.arep;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.escuelaing.arep.model.*;
import edu.escuelaing.arep.persistence.DBConnection;
import spark.Filter;
import spark.Request;
import spark.Response;
import spark.Spark;

import java.util.HashMap;

import static spark.Spark.*;

public class App {


    public static void main(String args[]){
        port(getPort());
        DBConnection connection = new DBConnection();

        after("*", (req,res) ->{
            res.header("Access-Control-Allow-Headers", "Content-Type,Authorization,X-Requested-With,Content-Length,Accept,Origin");
            res.header("Access-Control-Allow-Credentials", "true");

            res.header("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
            res.header("Access-Control-Allow-Origin", "*");
        });


        get("/getCancerDeCuelloUterinoBYIdPaciente", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getCancerDeCuelloUterinoBYIdPaciente(Integer.parseInt(req.queryParams("idPaciente"))));
        });
        get("/getEspecialidadById", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getEspecialidadById(Integer.parseInt(req.queryParams("id"))));
        });
        get("/getEspecialidades", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getEspecialidades());
        });
        get("/getHistoriaSexualByIdPaciente", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getHistoriaSexualByIdPaciente(Integer.parseInt(req.queryParams("idPaciente"))));
        });
        get("/getMetodosPlanificacion", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getMetodosPlanificacion());
        });
        get("/getMetodosPlanificacionByid", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getMetodosPlanificacionByid(Integer.parseInt(req.queryParams("id"))));
        });
        get("/getMetodosTamizacion", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getMetodosTamizacion());
        });
        get("/getMetodoTamizacionByid", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getMetodoTamizacionByid(Integer.parseInt(req.queryParams("id"))));
        });
        get("/getPatologias", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getPatologias());
        });
        get("/getPatologiaByid", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getPatologiaByid(Integer.parseInt(req.queryParams("id"))));
        });
        get("/getPatologiasPreinvasivasByIdPaciente", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getPatologiasPreinvasivasByIdPaciente(Integer.parseInt(req.queryParams("idPaciente"))));
        });
        get("/getPrevencionesSecundariasByIdPaciente", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getPrevencionesSecundariasByIdPaciente(Integer.parseInt(req.queryParams("idPaciente"))));
        });
        get("/getPrevencionPrimariaByIdPaciente", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getPrevencionPrimariaByIdPaciente(Integer.parseInt(req.queryParams("idPaciente"))));
        });
        get("/getTiposPurebasVPH", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getTiposPurebasVPH());
        });
        get("/getTipoPruebaVPHByid", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getTipoPruebaVPHByid(Integer.parseInt(req.queryParams("id"))));
        });
        get("/getTiposVacunasVPH", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getTiposVacunasVPH());
        });
        get("/getTipoVacunaVPHByid", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getTipoVacunaVPHByid(Integer.parseInt(req.queryParams("id"))));
        });
        get("/getPacienteByTdocAndNdoc", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getPacienteByTdocAndNdoc(req.params("tdoc"),Integer.parseInt(req.queryParams("ndoc"))));
        });
        get("/getMedicoByTdocAndNdoc", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(connection.getMedicoByTdocAndNdoc(req.params("tdoc"),Integer.parseInt(req.queryParams("ndoc"))));
        });
        get("/login", (req,res) ->{
            res.status(200);
            //res.type("application/json");
            System.out.println(req.queryParams("correo"));
            res.body(connection.login(req.queryParams("correo")).toString());
            return new Gson().toJson(connection.login(req.queryParams("correo")));
        });
        post("/insertCancerDeCuelloUterino", (req, res) -> {
            res.status(200);
            res.type("application/json");
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            CancerDeCuelloUterino cancerDeCuelloUterino = gson.fromJson(req.body(),CancerDeCuelloUterino.class);
            connection.insertCancerDeCuelloUterino(cancerDeCuelloUterino);
            return null;
        });
        post("/insertCancerDeCuelloUterino", (req, res) -> {
            res.status(200);
            res.type("application/json");
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            Especialidad especialidad = gson.fromJson(req.body(),Especialidad.class);
            connection.insertEspecialidad(especialidad);
            return null;
        });
        post("/insertHistoriaSexual", (req, res) -> {
            res.status(200);
            res.type("application/json");
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            HistoriaSexual historiaSexual = gson.fromJson(req.body(),HistoriaSexual.class);
            connection.insertHistoriaSexual(historiaSexual);
            return null;
        });
        post("/insertMedico", (req, res) -> {
            res.status(200);
            res.type("application/json");
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            InfoMedico infoMedico = gson.fromJson(req.body(), InfoMedico.class);
            connection.insertMedico(infoMedico);
            return null;
        });
        post("/insertMetodoPlanificacion", (req, res) -> {
            res.status(200);
            res.type("application/json");
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            MetodoPlanificacion metodoPlanificacion = gson.fromJson(req.body(),MetodoPlanificacion.class);
            connection.insertMetodoPlanificacion(metodoPlanificacion);
            return null;
        });
        post("/insertMetodoTamizacion", (req, res) -> {
            res.status(200);
            res.type("application/json");
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            MetodoTamizacion metodoTamizacion = gson.fromJson(req.body(),MetodoTamizacion.class);
            connection.insertMetodoTamizacion(metodoTamizacion);
            return null;
        });
        post("/insertUsuario", (req, res) -> {
            System.out.println(req.body().toString());
            System.out.println("sssssssssssss");
            res.status(200);
            res.type("application/json");
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            Usuario usuario = gson.fromJson(req.body(), Usuario.class);
            System.out.println(usuario.toString());
            connection.insertPaciente(usuario);
            return null;
        });
        post("/insertPatologia", (req, res) -> {
            res.status(200);
            res.type("application/json");
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            Patologia patologia = gson.fromJson(req.body(),Patologia.class);
            connection.insertPatologia(patologia);
            return null;
        });
        post("/insertPatologiaPreinvasiva", (req, res) -> {
            res.status(200);
            res.type("application/json");
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            PatologiaPreinvasiva patologiaPreinvasiva = gson.fromJson(req.body(),PatologiaPreinvasiva.class);
            connection.insertPatologiaPreinvasiva(patologiaPreinvasiva);
            return null;
        });
        post("/insertPrevencionPrimaria", (req, res) -> {
            res.status(200);
            res.type("application/json");
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            PrevencionPrimaria prevencionPrimaria = gson.fromJson(req.body(),PrevencionPrimaria.class);
            connection.insertPrevencionPrimaria(prevencionPrimaria);
            return null;
        });
        post("/insertPrevencionSecundaria", (req, res) -> {
            res.status(200);
            res.type("application/json");
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            PrevencionSecundaria prevencionSecundaria = gson.fromJson(req.body(),PrevencionSecundaria.class);
            connection.insertPrevencionSecundaria(prevencionSecundaria);
            return null;
        });
        post("/insertTipoPruebaVPH", (req, res) -> {
            res.status(200);
            res.type("application/json");
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            TipoPruebaVPH tipoPruebaVPH = gson.fromJson(req.body(),TipoPruebaVPH.class);
            connection.insertTipoPruebaVPH(tipoPruebaVPH);
            return null;
        });
        post("/insertTipoVacunaVPH", (req, res) -> {
            res.status(200);
            res.type("application/json");
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            TipoVacunaVPH tipoVacunaVPH = gson.fromJson(req.body(),TipoVacunaVPH.class);
            connection.insertTipoVacunaVPH(tipoVacunaVPH);
            return null;
        });
        put("/insertTipoPruebaVPH", (req, res) -> {
            res.status(200);
            res.type("application/json");
            connection.putHistoriaSexual(Integer.parseInt(req.params("idPaciente")),Integer.parseInt(req.params("nCompaneros")),Integer.parseInt(req.params("paridad")),Integer.parseInt("idMetodoPlanificacion"));
            return null;
        });
        put("/insertTipoVacunaVPH", (req, res) -> {
            res.status(200);
            res.type("application/json");
            connection.putPaciente(Integer.parseInt(req.params("idPaciente")), req.params("pais"), req.params("departamento"), req.params("municipio"), req.params("estado"), req.params("educacion"), req.params("salud"), req.params("eps"));
            return null;
        });
    }

    static int getPort(){
        if (System.getenv("PORT")!=null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
