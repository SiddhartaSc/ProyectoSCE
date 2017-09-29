/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosweb;

import escdebaile.ClsConexion;
import escdebaile.ClsGestorEscBaile;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import mensajes.ClsMensaje;

/**
 *
 * @author sdist
 */
@WebService(serviceName = "GestorAlumnos")
public class GestorAlumnos {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AltaAlumno")
    public boolean AltaAlumno() {
        //TODO write your implementation code here:
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AltaAlumnos")
    public boolean AltaAlumnos(@WebParam(name = "arr_nomCampos") java.lang.String[] arr_nomCampos, @WebParam(name = "arr_datos") java.lang.String[] arr_datos) {
        //TODO write your implementation code here:
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregaAlumno")
    public String AgregaAlumno(@WebParam(name = "clave") String clave, @WebParam(name = "nombre") String nombre, @WebParam(name = "apPaterno") String apPaterno, @WebParam(name = "apMaterno") String apMaterno) {
        ClsGestorEscBaile gestor = new ClsGestorEscBaile();
        gestor.conectaBD("rafa", "rafa");
        if(gestor.conectado()){
            String arrCampos[] = {"clvAlumno", "nombre", "apPaterno", "apMaterno"};
            String arrDatos[] = {clave, nombre, apPaterno, apMaterno};
            gestor.altaAlumno(arrCampos, arrDatos);
            return "True";
        }
        else
            return "False";
    }
    
    @WebMethod(operationName = "AltaAlumnosss")
    public ClsMensaje AltaAlumnosss() {
        
        ClsMensaje clm = new ClsMensaje(true,1,"holi");
        
        return clm;
    }

    @WebMethod(operationName = "AgregaAlumnoCls")
    public ClsMensaje AgregaAlumnoCls(@WebParam(name = "clave") String clave, @WebParam(name = "nombre") String nombre, @WebParam(name = "apPaterno") String apPaterno, @WebParam(name = "apMaterno") String apMaterno) {
        ClsGestorEscBaile gestor = new ClsGestorEscBaile();
        gestor.conectaBD("rafa", "rafa");
        
        if(gestor.conectado()){
            String arrCampos[] = {"clvAlumno", "nombre", "apPaterno", "apMaterno"};
            String arrDatos[] = {clave, nombre, apPaterno, apMaterno};
            ClsMensaje clm;
            if(gestor.altaAlumno(arrCampos, arrDatos))         
                clm = new ClsMensaje(true,1,clave+nombre+apPaterno+apMaterno);
            else
                clm = new ClsMensaje(false,2,clave+nombre+apPaterno+apMaterno);
            
            return clm;
        }
        else{
            
            ClsMensaje clm = new ClsMensaje(false,0,"no funciona conexión");
            
            return clm;
        }
            
    }
    
    
}
