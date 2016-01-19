/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import modelo.UsuarioVo;
import modelo.conexion.UsuarioDao;

public class Logica {
    private Coordinador miCoordinador;
  
     
     
    public static boolean ValidarCampos(String nombre, String apellido) {
    boolean Validarnombre= false, Validarapellido = false;  
    
    if (nombre !=null && !nombre.equals("")){
        Validarnombre = true;
    }
    if (apellido !=null && !apellido.equals("")){
        Validarapellido = true;
    }
    
    if (Validarnombre && Validarapellido){
        return true;
    }
    else{
        return false;
}
}
    public void pasarGarbageCollector(){
 
    Runtime garbage = Runtime.getRuntime();
    garbage.gc();
 
}
    public static boolean ValidarSexo(boolean f, boolean m) {
        if (f || m){
            return true;
        }else{
            return false;
        }
    }

    public static boolean ValidarCarrera(boolean selected, boolean selected0, boolean selected1, boolean selected2, boolean selected3, boolean selected4, boolean selected5, boolean selected6) {
     if ( selected ||  selected0 ||  selected1 ||  selected2 ||  selected3 ||  selected4 ||  selected5 ||  selected6)
     {
         return true;
     }else{
         return false;
     }
    }  
    
    void setLogica(Coordinador miCoordinador) {
     this.miCoordinador = miCoordinador; 
    }
    
    public  void Registro_leer_off_actualiza() {
      System.out.println("metodo leer");
      String nombreArchivo="/home/maryonday/NetBeansProjects/Sistema de Registro Biblioteca/src/OffLinea.csv";
       String re = null;   
       FileReader archivo = null;
       String linea = "";
       //String [][]   Datos = new String[100][6];
       try {
         archivo = new FileReader(nombreArchivo);
         BufferedReader lector = new BufferedReader(archivo);
        // int i=0, y=0;      
         while ((linea = lector.readLine()) != null) {
             String [] fila = linea.split(",");
             UsuarioVo actualizar = new UsuarioVo();
             actualizar.setFechahora(fila[0]);
             actualizar.setNombre(fila[1]);
             actualizar.setCedula(fila[2]);
             actualizar.setSexo(fila[3]);
             actualizar.setCarrera(fila[4].replace(";", ""));
             UsuarioDao bd = new UsuarioDao();
             re = bd.registraUsuario(actualizar);
//             for(String x: fila){
//                  Datos[i][y]= x ;
//              // System.out.print("{"+i+","+y+"}"+ Datos[i][y]);
//                y++;
//             }
           //  i++;           
          //  y=0; 
         }
        // mandamos la respuesta del ultimo registro  
        miCoordinador.ManejoStatus(re);
       } catch (FileNotFoundException e) {           
         this.miCoordinador.ManejoStatus("actualizado");
          System.out.println("Archivo no encontrado");
       } catch (IOException e) {
          System.out.println("Ocurrio un error de entrada/salida");
       } finally {
         if (archivo != null) {
           try {
               File fichero = new File(nombreArchivo);
                   if (re =="ok"){
                       fichero.delete();
                        System.out.println("El fichero ha sido borrado satisfactoriamente"); 
                   } else
                        System.out.println("El fichero no puede ser borrado Atodavia");
               archivo.close();
           } catch (IOException e) {
             e.printStackTrace();
           }
         }
       }
       //return Datos;
     }
    
    public static void Registro_save_off(String texto) {
       System.out.println("metodo escribir");
       FileWriter salida = null;
       String nombreArchivo="/home/maryonday/NetBeansProjects/Sistema de Registro Biblioteca/src/OffLinea.csv";
       try {
         salida = new FileWriter(nombreArchivo,true);
         BufferedWriter escritor = new BufferedWriter(salida);
         escritor.write(texto);
         escritor.newLine();
         escritor.flush();
       } catch (IOException e) {
         e.printStackTrace();
       } finally {
         if (salida != null) {
           try {
             salida.close();
           } catch (IOException e) {
             e.printStackTrace();
           }
         }
       }

     } 

     
}
