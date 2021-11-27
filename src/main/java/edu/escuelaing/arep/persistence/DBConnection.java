package edu.escuelaing.arep.persistence;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.BsonField;
import com.mongodb.client.model.Field;
import com.mongodb.client.model.Filters;
import edu.escuelaing.arep.model.*;

import org.bson.BsonArray;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class DBConnection {
    MongoClientURI uri;
    MongoClient mongoClient;
    private SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy");
    /**
     * Metodo constructor de la clase DBConnection.
     */
    public DBConnection() {
        uri = new MongoClientURI("mongodb+srv://cacu:cacu123@cacu.n4lmg.mongodb.net/cacu?retryWrites=true&w=majority");
        mongoClient = new MongoClient(uri);
    }

    public void insertCancerDeCuelloUterino(CancerDeCuelloUterino cancerDeCuelloUterino){
        mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection =database.getCollection("cancerdecuellouterino");
        Document document=new Document();
        document.put("idPaciente",cancerDeCuelloUterino.getIdPaciente());
        document.put("fechadiagnostico",cancerDeCuelloUterino.getFechadiagnostico());
        document.put("estadificacionFigo",cancerDeCuelloUterino.getEstadificacionFigo());
        document.put("tipoHistologico",cancerDeCuelloUterino.getTipoHistologico());
        document.put("manejoPrimario",cancerDeCuelloUterino.getManejoPrimario());
        document.put("fechaInicioManejoPrimario",cancerDeCuelloUterino.getFechaInicioManejoPrimario());
        document.put("fechaFinManejoPrimario",cancerDeCuelloUterino.getFechaFinManejoPrimario());
        collection.insertOne(document);
    }

    public void insertEspecialidad(Especialidad especialidad){
        mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection =database.getCollection("especialidad");
        Document document=new Document();
        document.put("id",especialidad.getId());
        document.put("nombre",especialidad.getNombre());
        collection.insertOne(document);
    }

    public void insertHistoriaSexual(HistoriaSexual historiaSexual){
        mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection =database.getCollection("historiasexual");
        Document document=new Document();
        document.put("idPaciente",historiaSexual.getIdPaciente());
        document.put("edadinicio",historiaSexual.getEdadinicio());
        document.put("numeroDeCompañeros",historiaSexual.getNumeroDeCompañeros());
        document.put("paridad",historiaSexual.getParidad());
        document.put("idmetodoDePlanificacion",historiaSexual.getIdMetodoDePlanificacion());
        collection.insertOne(document);
    }

    public void insertMedico(InfoMedico infoMedico){
        mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection =database.getCollection("infoMedico");
        Document document=new Document();
        document.put("idMedico", infoMedico.getIdMedico());
        document.put("idespecialidad", infoMedico.getIdEspecialidad());
        collection.insertOne(document);
    }

    public void insertMetodoPlanificacion(MetodoPlanificacion metodoPlanificacion){
        mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection =database.getCollection("metodoplanificacion");
        Document document=new Document();
        document.put("id",metodoPlanificacion.getId());
        document.put("nombre",metodoPlanificacion.getNombre());
        collection.insertOne(document);
    }

    public void insertMetodoTamizacion(MetodoTamizacion metodoTamizacion){
        mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection =database.getCollection("metodotamizacion");
        Document document=new Document();
        document.put("id",metodoTamizacion.getId());
        document.put("nombre",metodoTamizacion.getNombre());
        collection.insertOne(document);
    }

    public void insertPaciente(Usuario usuario){
        mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection =database.getCollection("usuario");
        Document document=new Document();
        document.put("id",usuario.getTdoc()+usuario.getNdoc());
        document.put("tdoc", usuario.getTdoc());
        document.put("ndoc", usuario.getNdoc());
        document.put("nombres", usuario.getNombres());
        document.put("apellidos", usuario.getApellidos());
        document.put("fechaderegistro", usuario.getFechaderegistro());
        document.put("nacionalidad", usuario.getNacionalidad());
        document.put("departamentodeorigen", usuario.getDepartamentodeorigen());
        document.put("municipiodeorigen", usuario.getMunicipiodeorigen());
        document.put("paisderesidencia", usuario.getPaisderesidencia());
        document.put("departamentoderesidencia", usuario.getDepartamentoderesidencia());
        document.put("municipioderesidencia", usuario.getMunicipioderesidencia());
        document.put("direccionderesidencia", usuario.getDireccionderesidencia());
        document.put("fechadenacimiento", usuario.getFechadenacimiento());
        document.put("edad", (Integer.parseInt(simpleDateFormat.format(usuario.getFechaderegistro().getTime()))- Integer.parseInt(simpleDateFormat.format(usuario.getFechadenacimiento().getTime()))));
        document.put("estadocivil", usuario.getEstadocivil());
        document.put("niveleducativo", usuario.getNiveleducativo());
        document.put("regimendesalud", usuario.getRegimendesalud());
        document.put("eps", usuario.getEps());
        document.put("correo", usuario.getCorreo());
        document.put("contraseña", usuario.getContraseña());
        document.put("tipousuario", usuario.getTipousuario());
        collection.insertOne(document);
    }

    public void insertPatologia(Patologia patologia){
        mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection =database.getCollection("patologia");
        Document document=new Document();
        document.put("id",patologia.getId());
        document.put("nombre",patologia.getNombre());
        collection.insertOne(document);
    }

    public void insertPatologiaPreinvasiva(PatologiaPreinvasiva patologiaPreinvasiva){
        mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection =database.getCollection("patologiapreinvasiva");
        Document document=new Document();
        document.put("idPaciente",patologiaPreinvasiva.getIdPaciente());
        document.put("idTipoPatologia",patologiaPreinvasiva.getIdTipoPatologia());
        document.put("descripcion",patologiaPreinvasiva.getDescripcion());
        document.put("fechaDeLesion",patologiaPreinvasiva.getFechaDeLesion());
        document.put("institutoDeDiagnostico",patologiaPreinvasiva.getInstitutoDeDiagnostico());
        collection.insertOne(document);
    }

    public void insertPrevencionPrimaria(PrevencionPrimaria prevencionPrimaria){
        mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection =database.getCollection("prevencionprimaria");
        Document document=new Document();
        document.put("idPaciente",prevencionPrimaria.getIdPaciente());
        document.put("idTipo",prevencionPrimaria.getIdTipo());
        document.put("nDosis",prevencionPrimaria.getnDosis());
        collection.insertOne(document);
    }

    public void insertPrevencionSecundaria(PrevencionSecundaria prevencionSecundaria){
        mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection =database.getCollection("prevencionsecundaria");
        Document document=new Document();
        document.put("idPaciente",prevencionSecundaria.getIdPaciente());
        document.put("idMetodoTamizacion",prevencionSecundaria.getIdMetodoTamizacion());
        document.put("fechaTamizacion",prevencionSecundaria.getFechaTamizacion());
        document.put("idPruebaVPH",prevencionSecundaria.getIdPruebaVPH());
        document.put("resultadoPruebaVPH",prevencionSecundaria.isResultadoPruebaVPH());
        document.put("fechaPruebVPH",prevencionSecundaria.getFechaPruebVPH());
        collection.insertOne(document);
    }

    public void insertTipoVacunaVPH(TipoVacunaVPH tipoPrevencionPrimaria){
        mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection =database.getCollection("tipovacunavph");
        Document document=new Document();
        document.put("id",collection.countDocuments()+1);
        document.put("nombre",tipoPrevencionPrimaria.getNombre());
        collection.insertOne(document);
    }

    public void insertTipoPruebaVPH(TipoPruebaVPH tipoPruebaVPH){
        mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection =database.getCollection("tipopruebavph");
        Document document=new Document();
        document.put("id",collection.countDocuments()+1);
        document.put("nombre",tipoPruebaVPH.getNombre());
        collection.insertOne(document);
    }

    /**
     * Metodo encargado de realizar una consulta a la base de datos y obtener los datos ingresados.
     * @return Retorna una lista que contiene los mensajes almacenados en la base de datos.
     */
    public ArrayList<CancerDeCuelloUterino> getCancerDeCuelloUterinoBYIdPaciente(int idPaciente) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("cancerdecuellouterino");
        Document query = new Document("idPaciente",idPaciente);
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        ArrayList<CancerDeCuelloUterino> cancerDeCuelloUterino = new ArrayList<CancerDeCuelloUterino>();
        findIterable.into(documents);
        for (Document document: documents) {
            cancerDeCuelloUterino.add(new CancerDeCuelloUterino((Integer) document.get("idPaciente"), (Date) document.get("fechadiagnostico"), (String) document.get("estadificacionFigo"), (String) document.get("tipoHistologico"), (String) document.get("manejoPrimario"), (Date) document.get("fechaInicioManejoPrimario"), (Date) document.get("fechaFinManejoPrimario")));
        }
        return cancerDeCuelloUterino;
    }

    public ArrayList<Especialidad> getEspecialidades() {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("especialidad");
        FindIterable findIterable = collection.find();
        ArrayList<Document> documents = new ArrayList<Document>();
        ArrayList<Especialidad> especialidades = new ArrayList<Especialidad>();
        findIterable.into(documents);
        for (Document document: documents) {
            especialidades.add(new Especialidad((Integer) document.get("id"), (String) document.get("nombre")));
        }
        return especialidades;
    }

    public Especialidad getEspecialidadById(int id) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("especialidad");
        Document query = new Document("id",id);
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        Especialidad especialidad = null;
        findIterable.into(documents);
        for (Document document: documents) {
            especialidad= new Especialidad((Integer) document.get("id"), (String) document.get("nombre"));
        }
        return especialidad;
    }

    public HistoriaSexual getHistoriaSexualByIdPaciente(int idPaciente) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("historiasexual");
        Document query = new Document("idPaciente",idPaciente);
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        HistoriaSexual historiaSexual=null;
        findIterable.into(documents);
        for (Document document: documents) {
            historiaSexual= new HistoriaSexual((Integer) document.get("idPaciente"), (Integer) document.get("edadinicio"), (Integer) document.get("numeroDeCompañeros"), (Integer) document.get("paridad"), (Integer) document.get("idMetodoDePlanificacion"));
        }
        return historiaSexual;
    }

    public InfoMedico getMedicoByTdocAndNdoc(String tdoc, int ndoc) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("infoMedico");
        Document query = new Document("$and", Arrays.asList(new Document("tdoc",tdoc),new Document("ndoc",ndoc)));
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        InfoMedico infoMedico =null;
        findIterable.into(documents);
        for (Document document: documents) {
            infoMedico = new InfoMedico((Integer) document.get("idMedico"), (Integer) document.get("idEspecialidad"));
        }
        return infoMedico;
    }

    public ArrayList<MetodoPlanificacion> getMetodosPlanificacion() {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("metodoplanificacion");
        FindIterable findIterable = collection.find();
        ArrayList<Document> documents = new ArrayList<Document>();
        ArrayList<MetodoPlanificacion> metodosPlanificacion = new ArrayList<MetodoPlanificacion>();
        findIterable.into(documents);
        for (Document document: documents) {
            metodosPlanificacion.add(new MetodoPlanificacion((Integer) document.get("id"), (String) document.get("nombre")));
        }
        return metodosPlanificacion;
    }

    public MetodoPlanificacion getMetodosPlanificacionByid(int id) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("metodoplanificacion");
        Document query = new Document("id",id);
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        MetodoPlanificacion metodoPlanificacion = null;
        findIterable.into(documents);
        for (Document document: documents) {
            metodoPlanificacion= new MetodoPlanificacion((Integer) document.get("id"), (String) document.get("nombre"));
        }
        return metodoPlanificacion;
    }

    public ArrayList<MetodoTamizacion> getMetodosTamizacion() {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("metodotamizacion");
        FindIterable findIterable = collection.find();
        ArrayList<Document> documents = new ArrayList<Document>();
        ArrayList<MetodoTamizacion> metodosTamizacion = new ArrayList<MetodoTamizacion>();
        findIterable.into(documents);
        for (Document document: documents) {
            metodosTamizacion.add(new MetodoTamizacion((Integer) document.get("id"), (String) document.get("nombre")));
        }
        return metodosTamizacion;
    }

    public MetodoTamizacion getMetodoTamizacionByid(int id) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("metodotamizacion");
        Document query = new Document("id",id);
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        MetodoTamizacion metodoTamizacion = null;
        findIterable.into(documents);
        for (Document document: documents) {
            metodoTamizacion= new MetodoTamizacion((Integer) document.get("id"), (String) document.get("nombre"));
        }
        return metodoTamizacion;
    }

    public Usuario getUsuarioByTdocAndNdoc(String id) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("usuario");
        Document query = new Document("id",id);
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        Usuario usuario =null;
        findIterable.into(documents);
        for (Document document: documents) {
            System.out.println(document);
            usuario = new Usuario((String) document.get("id"), (String) document.get("tdoc"),
                    (Integer) document.get("ndoc"), (String) document.get("nombres"), (String) document.get("apellidos"),
                    (Date) document.get("fechaderegistro"), (String) document.get("nacionalidad"), (String) document.get("departamentodeorigen"),
                    (String) document.get("municipiodeorigen"), (String) document.get("paisderesidencia"), (String) document.get("departamentoderesidencia"),
                    (String) document.get("municipioderesidencia"), (String) document.get("direccionderesidencia"), (Date) document.get("fechadenacimiento"),
                    (Integer) document.get("edad"), (String) document.get("estadocivil"), (String) document.get("niveleducativo"),
                    (String) document.get("regimendesalud"), (String) document.get("eps"), (String) document.get("correo"),
                    (String) document.get("tipousuario"));
        }
        return usuario;
    }

    public ArrayList<Patologia> getPatologias() {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("patologia");
        FindIterable findIterable = collection.find();
        ArrayList<Document> documents = new ArrayList<Document>();
        ArrayList<Patologia> patologias = new ArrayList<Patologia>();
        findIterable.into(documents);
        for (Document document: documents) {
            patologias.add(new Patologia((Integer) document.get("id"), (String) document.get("nombre")));
        }
        return patologias;
    }

    public Patologia getPatologiaByid(int id) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("patologia");
        Document query = new Document("id",id);
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        Patologia patologia = null;
        findIterable.into(documents);
        for (Document document: documents) {
            patologia= new Patologia((Integer) document.get("id"), (String) document.get("nombre"));
        }
        return patologia;
    }

    public List<PatologiaPreinvasiva> getPatologiasPreinvasivasByIdPaciente(int idPaciente) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("patologiapreinvasiva");
        Document query = new Document("idPaciente",idPaciente);
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        List<PatologiaPreinvasiva> patologiasPreinvasivas = new ArrayList<PatologiaPreinvasiva>();
        findIterable.into(documents);
        for (Document document: documents) {
            patologiasPreinvasivas.add(new PatologiaPreinvasiva((Integer) document.get("idPaciente"), (Integer) document.get("idTipoPatologia"), (String) document.get("descripcion"), (Date) document.get("fechaDeLesion"), (String) document.get("institutoDeDiagnostico")));
        }
        return patologiasPreinvasivas;
    }

    public PrevencionPrimaria getPrevencionPrimariaByIdPaciente(int idPaciente) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("prevencionprimaria");
        Document query = new Document("idPaciente",idPaciente);
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        PrevencionPrimaria prevencionPrimaria = null;
        findIterable.into(documents);
        for (Document document: documents) {
            prevencionPrimaria = new PrevencionPrimaria((String) document.get("idPaciente"), (Integer) document.get("idTipo"), (Integer) document.get("descripcion"));
        }
        return prevencionPrimaria;
    }

    public List<PrevencionSecundaria> getPrevencionesSecundariasByIdPaciente(int idPaciente) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("prevencionsecundaria");
        Document query = new Document("idPaciente",idPaciente);
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        List<PrevencionSecundaria> prevencionesSecundarias = new ArrayList<PrevencionSecundaria>();
        findIterable.into(documents);
        for (Document document: documents) {
            prevencionesSecundarias.add(new PrevencionSecundaria((Integer) document.get("idPaciente"), (Integer) document.get("idMetodoTamizacion"), (Date) document.get("fechaTamizacion"), (Integer) document.get("idPruebaVPH"), (Boolean) document.get("resultadoPruebaVPH"), (Date) document.get("fechaPruebVPH")));
        }
        return prevencionesSecundarias;
    }

    public ArrayList<TipoPruebaVPH> getTiposPurebasVPH() {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("tipopruebavph");
        FindIterable findIterable = collection.find();
        ArrayList<Document> documents = new ArrayList<Document>();
        ArrayList<TipoPruebaVPH> tiposPruebaVPHS = new ArrayList<TipoPruebaVPH>();
        findIterable.into(documents);
        for (Document document: documents) {
            tiposPruebaVPHS.add(new TipoPruebaVPH((Integer) document.get("id"), (String) document.get("nombre")));
        }
        return tiposPruebaVPHS;
    }

    public TipoPruebaVPH getTipoPruebaVPHByid(int id) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("tipopruebavph");
        Document query = new Document("id",id);
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        TipoPruebaVPH tipoPruebaVPH = null;
        findIterable.into(documents);
        for (Document document: documents) {
            tipoPruebaVPH= new TipoPruebaVPH((Integer) document.get("id"), (String) document.get("nombre"));
        }
        return tipoPruebaVPH;
    }

    public ArrayList<TipoVacunaVPH> getTiposVacunasVPH() {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("tipovacunavph");
        FindIterable findIterable = collection.find();
        ArrayList<Document> documents = new ArrayList<Document>();
        ArrayList<TipoVacunaVPH> tiposVacunasVPH = new ArrayList<TipoVacunaVPH>();
        findIterable.into(documents);
        for (Document document: documents) {
            tiposVacunasVPH.add(new TipoVacunaVPH(Math.toIntExact((Long) document.get("id")), (String) document.get("nombre")));
        }
        return tiposVacunasVPH;
    }

    public TipoVacunaVPH getTipoVacunaVPHByid(int id) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("tipovacunavph");
        Document query = new Document("id",id);
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        TipoVacunaVPH tipoVacunaVPH = null;
        findIterable.into(documents);
        for (Document document: documents) {
            tipoVacunaVPH= new TipoVacunaVPH((Integer) document.get("id"), (String) document.get("nombre"));
        }
        return tipoVacunaVPH;
    }

    public void putPaciente(Usuario usuario) {
        System.out.println("sss");
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("usuario");
        BasicDBObject query = new BasicDBObject();
        query.put("id", usuario.getId());
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        findIterable.into(documents);
        Document user=new Document();
        user.put("id",usuario.getId());
        user.put("paisderesidencia", usuario.getPaisderesidencia());
        user.put("departamentoderesidencia", usuario.getDepartamentoderesidencia());
        user.put("municipioderesidencia", usuario.getMunicipioderesidencia());
        user.put("direccionderesidencia", usuario.getDireccionderesidencia());
        user.put("estadocivil", usuario.getEstadocivil());
        user.put("niveleducativo", usuario.getNiveleducativo());
        user.put("regimendesalud", usuario.getRegimendesalud());


        for (Document document: documents) {
            user.put("contraseña", document.get("contraseña"));
            user.put("tipousuario", document.get("tipousuario"));
            user.put("eps", document.get("eps"));
            user.put("nombres", document.get("nombres"));
            user.put("apellidos", document.get("apellidos"));
            user.put("correo", document.get("correo"));
            user.put("tdoc",document.get("tdoc"));
            user.put("ndoc", document.get("ndoc"));
            user.put("fechadenacimiento", document.get("fechadenacimiento"));
            user.put("fechaderegistro", document.get("fechaderegistro"));
            user.put("nacionalidad", document.get("nacionalidad"));
            user.put("departamentodeorigen", document.get("municipiodeorigen"));
            user.put("municipiodeorigen", document.get("departamentodeorigen"));
            user.put("edad",document.get("edad"));
        }
        collection.findOneAndReplace(query, user);
    }

    public void putHistoriaSexual(int IdPaciente, int NumeroDeCompañeros, int Paridad, int idMetodoPlanificacion) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("historiasexual");
        Document query = new Document("idpaciente",new Document("$elemMatch",new
                Document("$eq",IdPaciente)));
        Document update = new Document("$push",Arrays.asList(new Document("numeroDeCompañeros",NumeroDeCompañeros),
                new Document("paridad",Paridad), new Document("munidMetodoDePlanificacionicipioderesidencia",idMetodoPlanificacion)));
        collection.updateOne(query,update);
    }

    public Usuario login(String correo) {
        MongoDatabase database = mongoClient.getDatabase("cacu");
        MongoCollection<Document> collection = database.getCollection("usuario");
        Document query = new Document("correo",correo);
        FindIterable findIterable = collection.find(query);
        ArrayList<Document> documents = new ArrayList<Document>();
        Usuario usuario = null;
        findIterable.into(documents);
        for (Document document: documents) {
            usuario=new Usuario((String)document.get("id"),(String)document.get("nombres"),
                    (String)document.get("apellidos"),(String)document.get("contraseña"),
                    (String)document.get("tipousuario"));
        }
        System.out.println(usuario.toString());

        return usuario;
    }
}
