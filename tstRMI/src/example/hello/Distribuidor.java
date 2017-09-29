/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example.hello;
import java.lang.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author RGGH
 */
public class Distribuidor 
{
    @SuppressWarnings("unchecked")
    public static void main( String args[])
    {

        System.out.println("Distribuidor, inciando con:");
        if( args.length == 0)
            System.out.println("Sin argumentos");
        else
            for(int i = 0; i < args.length; i++)
                System.out.println("args[" + i + "]:" + args[i]);
        System.out.println("------------------------------------------");

        String[] argsPar = new String[0];
        
        if( args.length > 1 )
        {
           argsPar = new String[args.length-1];
           for(int i=1;i<args.length;i++)
             argsPar[i-1] = args[i];  
        }
        if( args.length == 0 ) 
        {
            System.out.println("uso:\n" +
                               "Distribuidor Master  ip_host_localhost reset deltaTEnSegs\n" +
                               "Distribuidor Master  ip_host_localhost [reporta]\n"            +
                               "Distribuidor Cliente ip_host_localhost");
        }
        else
        {
            
//            if( args[0].compareToIgnoreCase("Master")  == 0) Master.main( argsPar );
//            if( args[0].compareToIgnoreCase("Cliente") == 0) Client.main( argsPar );
//            if( args[0].compareToIgnoreCase("Server") == 0) Server.main( argsPar );
//            if( args[0].compareToIgnoreCase("ServidorDeDisparo") == 0) ServidorDeDisparo.main( argsPar );
            
            try{
                Class cArgs[] = new Class[1];
                cArgs[0] = String[].class;
                

                Class cl;
                cl = Class.forName("example.hello." + args[0]);

                Method m = cl.getMethod("main", cArgs);
                m.invoke(cl, (Object)argsPar);
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Distribuidor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(Distribuidor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SecurityException ex) {
                Logger.getLogger(Distribuidor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Distribuidor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(Distribuidor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(Distribuidor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        // Soft encode ClassLoader GetInstanceByName Java reflection
        // Hay que hacer un arreglo y meter esas ejecuciones en un for para hacerlo dinamicamente que no te hardcodeado
        
        //ClassLoader cl;
        //cl.loadClass("Master");
        
    }
    
    
    
}
