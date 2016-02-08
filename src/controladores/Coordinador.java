package controladores;

import static controladores.Procesos.ini_cubiculo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import modelo.conexion.UsuarioDao;
import ventanas.Cubico.VentanaCubico;
import ventanas.Ven_Cubico;
import ventanas.VentanaConsultar;
import ventanas.Ven_Pri_Registro;
import ventanas.VentanaRegistrar;
import ventanas.ven;
import ventanas.ven_Principal;

/**
 *
 * @author maryonday
 */
public class Coordinador {
    private ven_Principal miVentana;
    private VentanaRegistrar miVentanaRegistrar;
    private Logica miLogica;
    private UsuarioDao miUsuarioDao;
    private VentanaConsultar miVentanaConsultar;
    private ven venmiGrafico;
    private Ven_Pri_Registro miVentainiRegistro;
    private ven_Principal miVentanaInicio;
    public Ven_Cubico miVentanaCubico;
    private VentanaCubico micubico;
    private Procesos misProcesos;
    
    public static boolean Usado = false;
    
    
   public void setVentanaPrincipal(ven_Principal miVentana) {
       this.miVentana=miVentana;
    }
   public void setVentanaRegistrar(VentanaRegistrar miVentanaRegistrar) {
        this.miVentanaRegistrar= miVentanaRegistrar;
    }
   public void setUsuarioDao(UsuarioDao miUsuarioDao) {
		this.miUsuarioDao = miUsuarioDao;
	}
   public void setveconsultar(ven vemiconsulta) {
        this.venmiGrafico =vemiconsulta;  }
   public void setVentanaConsultar(VentanaConsultar miVentanaConsultar) {
       this.miVentanaConsultar = miVentanaConsultar;
    }
   public void setLogica(Logica miLogica) {
       this.miLogica=miLogica;
    }
   
   public  void setProcesos(Procesos misProcesos) {
     this.misProcesos = misProcesos;   
   }
    
   public void setmiVentanaInicio(ven_Principal miVentanaInicio) {
       this.miVentanaInicio =miVentanaInicio;
    }

    public void setmimiVentainiRegistro(Ven_Pri_Registro miVentainiRegistro) {
       this.miVentainiRegistro =miVentainiRegistro;
    }   
   
    public void setVentanaCubico(Ven_Cubico miVentanaCubico) {
       this.miVentanaCubico = miVentanaCubico;
    }

    public void setMiCubico(VentanaCubico micubico) {
        this.micubico = micubico;
    }
    
   // TRaer funciones con coordinador
    public void IniciarTiempo(){        
        Thread ini = new Thread(misProcesos);
        ini.start();
    }
    public void IniciarCubiculo(){        
        misProcesos.ini_cubiculo = true;
    }
     public void mostrarVentanaPrincipalRegistro() {
	miVentainiRegistro.setVisible(true);	
        miVentainiRegistro.setState(miVentanaRegistrar.NORMAL);
	miLogica.pasarGarbageCollector();
    }
   public void mostrarVentanaRegistro() {
	miVentanaRegistrar.setVisible(true);	
        miVentanaRegistrar.setState(miVentanaRegistrar.NORMAL);
	miLogica.pasarGarbageCollector();
    } 

   public void mostrarVentanaConsulta() {
           miVentanaConsultar.setVisible(true);	
           miVentanaConsultar.setState(miVentanaConsultar.NORMAL);
           bi_registro_cs(); 
           miLogica.pasarGarbageCollector();
 }
    public void mostrarVentanaCubiculo() {
           miVentanaCubico.setVisible(true);	
           miVentanaCubico.setState(miVentanaCubico.NORMAL);
           miLogica.pasarGarbageCollector();
 }
     public void mostrarCubiculo(int cubiculo) {
          miVentanaCubico.setVisible(false);
           micubico.inico(cubiculo);
           micubico.setVisible(true);	
           micubico.setState(micubico.NORMAL);
           miLogica.pasarGarbageCollector();
           
 }     public void mostrarGrafico() {
           venmiGrafico.setVisible(true);
           venmiGrafico.setState(miVentanaConsultar.NORMAL);
           venmiGrafico.graficoGenero();
            System.out.println("grafico");
           miLogica.pasarGarbageCollector();
           
 }
   public void bi_registro_cs() {
        miVentanaConsultar.Consulta();
        miLogica.pasarGarbageCollector();
    }
     public void _bi_registro_up() {
        miLogica.Registro_leer_off_actualiza();
        miLogica.pasarGarbageCollector();
    }


   public void Limpiar(){
         miLogica.pasarGarbageCollector();
    }

// traer informacion o pasar atraves del coordinadoe   
    public Object[] bi_consulta_rg() {
        return miUsuarioDao.bi_regristro_consultar("");
    }
    public Object[] bi_consulta_rg_sexo() {
        return miUsuarioDao.bi_regristro_consultar("grafico");
    }

    public void ManejoStatus(String retorno) {
        String informacion;
        String estado;
        int icon = 0;
       switch (retorno){
                
                case "errorbd":
                    informacion =  "El Usuario fue registrado con exito";
                    estado ="Guardado Exitosamente Localmente !";
                    icon = JOptionPane.WARNING_MESSAGE;  
                    break;
                case "ok":
                    informacion = "El Usuario fue registrado con exito";
                    estado ="Guardado Exitosamente BD!";
                    icon =JOptionPane.INFORMATION_MESSAGE;
                    break;               
                case "error":
                    informacion ="El Usuario no pudo ser registrado, verifiquela taza de error";
                    estado ="Error";
                    icon = JOptionPane.ERROR_MESSAGE;
                    break; 
                 case "":
                    informacion = "Se necesita diligenciarlos campos obligatorios (*)";
                    estado = "Advertencia";
                    icon = JOptionPane.WARNING_MESSAGE;
                    break; 
                 case "actualizado":
                    informacion = "Base de Datos Actualizada :)";
                    estado = "Actualizado";
                    icon = JOptionPane.INFORMATION_MESSAGE;
                    break; 
                 case "cubiculoTiempo":
                    informacion = "Se Acabo el tiempo en cubiculo #";
                    estado = "Tiempo Terminado !";
                    icon = JOptionPane.INFORMATION_MESSAGE;
                    break; 
                default:
                    informacion = "";
                    estado ="Error no categorizado";                   
                    break;
            }
            JOptionPane.showMessageDialog(null,""+informacion,""+estado,icon);    }

    public String  MostrarFechaHora(String opc) {
        String Fecha = misProcesos.Fecha();
        String Hora = misProcesos.Hora();
        
        if(opc =="hora") {
            opc= Hora;
            //opc = Hora;
        }else if (opc=="fecha") {
             opc= "Fecha: "+Fecha;
        }else{
             opc= "Fecha: "+Fecha+" Hora: "+Hora;
        }
        return  opc;
    }
     public static boolean ValidarCampos(String nombre, String id){
        return Logica.ValidarCampos(nombre, id);
     }
    Map  status = new HashMap();
    public void CubiculoStatus(int num) {
       
        
        if(num !=0 ){
          this.Usado =true;
        status.put(num, "usando");
        Iterator it_llave = status.keySet().iterator();
        while (it_llave.hasNext()) {
                   
                    // asignamos la llave que es la materia
                    Object llave = it_llave.next();
                    // traemos las notas de esa materias y las mostramos
                    Object valor = status.get(llave);
                    System.out.println("clave: "+llave + 
                                        "\tValor:  " + valor);
                }
        //cerramos 
       // if (ok== "ok"){
          //  micubico.limpiar();
       }
            micubico.setVisible(false);
            miVentanaCubico.setVisible(true);
      //  }
       
    }    


}
    
