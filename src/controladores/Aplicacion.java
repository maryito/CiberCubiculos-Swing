package controladores;

import static java.awt.Frame.MAXIMIZED_BOTH;
import ventanas.Cubico.VentanaCubico;
import ventanas.Ven_Cubico;
import ventanas.VentanaConsultar;
import ventanas.Ven_Pri_Registro;
import ventanas.VentanaRegistrar;

import ventanas.ven;
import ventanas.ven_Principal;

public class Aplicacion {

     
   void IniciarSistema(){
       
        ven_Principal miVentana =new ven_Principal();
       
        Coordinador miCoordinador = new Coordinador();
        Logica miLogica = new Logica();
        Procesos misProcesos = new Procesos();
        
        Ven_Pri_Registro miVentainiRegistro = new Ven_Pri_Registro(miVentana,true);
        VentanaRegistrar miVentanaRegistrar = new VentanaRegistrar(miVentana,true);
        VentanaConsultar miVentanaConsultar = new VentanaConsultar(miVentana,true);
        ven vemiconsulta  = new ven(miVentana,true);
        Ven_Cubico miVentanaCubico = new Ven_Cubico(miVentana,true);
        VentanaCubico micubico = new VentanaCubico(miVentana, true);
       
        
        miVentainiRegistro.setCoordinador(miCoordinador);
        miVentana.setCoordinador(miCoordinador);
        miVentanaRegistrar.setCoordinador(miCoordinador);
        
        miLogica.setLogica(miCoordinador);
        misProcesos.setProcesos(miCoordinador);
        
        miVentanaConsultar.setCoordinador(miCoordinador);
        vemiconsulta.setven(miCoordinador);
        miVentanaCubico.setCoordinador(miCoordinador);
        micubico.setCoordinador(miCoordinador);
        miCoordinador.setmimiVentainiRegistro(miVentainiRegistro);
        miCoordinador.setVentanaPrincipal(miVentana);
        miCoordinador.setVentanaRegistrar(miVentanaRegistrar);  
        miCoordinador.setVentanaConsultar(miVentanaConsultar);
        
        miCoordinador.setLogica(miLogica);
        miCoordinador.setProcesos(misProcesos);
        
        miCoordinador.setveconsultar(vemiconsulta);
        miCoordinador.setVentanaCubico(miVentanaCubico);
        miCoordinador.setMiCubico(micubico);
        
        
        miVentana.setVisible(true);
        miVentana.setExtendedState(MAXIMIZED_BOTH);
        miLogica.pasarGarbageCollector();
    }

}

