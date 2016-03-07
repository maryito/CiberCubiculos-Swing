/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import ventanas.Ven_Cubico;
import ventanas.VentanaRegistrar;

/**
 *
 * @author maryonday
 */
public class Procesos implements Runnable{
    String hora, minutos, segundos, ampm, fecha, tiempo ;
    Calendar calendario;
    int CubiculoMinuto=0, CubiculoSegundo=0,x=0;
    static boolean inicio = true, ini_cubiculo = false;
    private Coordinador miCoordinador;
    @Override
    public void run() {
        while(inicio){
          //tiempo=("Fecha: "+Fecha()+" "+ Hora());
          VentanaRegistrar.lb_hora.setText("Fecha: "+Fecha()+" "+ Hora());          
            //System.out.println(""+VentanaRegistrar.lb_hora.getText());
          
        //manejo del tiempo de los cubilos
            while (ini_cubiculo){  
              try {
                   // Thread.sleep(1000);
                    Thread.sleep(10);
                    TiempoCubico(x);
                    x++;
                } catch (InterruptedException e) {
                    System.out.println("Acabo el proceso del Cubico");
                }   
              }
            }
       
        
    }
    public  String Fecha(){
         Date fechaHoraActual = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        fecha = (dateFormat.format(fechaHoraActual));
        return  ""+fecha;
    }
    public  String Hora() {
        Calendar calendario = new GregorianCalendar();      

        //calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
        return  hora+":"+minutos+":"+segundos+" " + ampm;
    }

    void setProcesos(Coordinador miCoordinador) {
       this.miCoordinador = miCoordinador; 
    }

    private void TiempoCubico(int x) {
       // System.out.println(CubiculoMinuto+":"+ CubiculoSegundo);

        CubiculoSegundo++;
        String seg="0", min="0";
        if (CubiculoSegundo < 10)seg ="0"+CubiculoSegundo;
        else seg =""+CubiculoSegundo;
        
        if(CubiculoMinuto < 10) min ="0"+CubiculoMinuto;
        else min =""+CubiculoMinuto;
        
        Ven_Cubico.bt_Cubico1.setText(min+":"+ seg);
      //  System.out.println(min+":"+ seg);
        
        if (CubiculoSegundo >59){
            CubiculoSegundo=0;
            CubiculoMinuto++;
            if(CubiculoMinuto <16){
                Ven_Cubico.bt_Cubico1.setBackground(Color.yellow);
                Ven_Cubico.bt_Cubico2.setBackground(Color.yellow);
                Ven_Cubico.bt_Cubico3.setBackground(Color.yellow);
                Ven_Cubico.bt_Cubico4.setBackground(Color.yellow);
                Ven_Cubico.bt_Cubico5.setBackground(Color.yellow);
                Ven_Cubico.bt_Cubico6.setBackground(Color.yellow);
                Ven_Cubico.bt_Cubico7.setBackground(Color.yellow);
                Ven_Cubico.bt_Cubico8.setBackground(Color.yellow);
                Ven_Cubico.bt_Cubico9.setBackground(Color.yellow); 
            }
            else if(CubiculoMinuto <26){
                Ven_Cubico.bt_Cubico1.setBackground(Color.BLUE);
                Ven_Cubico.bt_Cubico2.setBackground(Color.BLUE);
                Ven_Cubico.bt_Cubico3.setBackground(Color.BLUE);
                Ven_Cubico.bt_Cubico4.setBackground(Color.BLUE);
                Ven_Cubico.bt_Cubico5.setBackground(Color.BLUE);
                Ven_Cubico.bt_Cubico6.setBackground(Color.BLUE);
                Ven_Cubico.bt_Cubico7.setBackground(Color.BLUE);
                Ven_Cubico.bt_Cubico8.setBackground(Color.BLUE);
                Ven_Cubico.bt_Cubico9.setBackground(Color.BLUE);
            }
            else if(CubiculoMinuto >30){
                CubiculoMinuto=0;
                //miCoordinador.ManejoStatus("cubiculoTiempo");
                Ven_Cubico.bt_Cubico1.setBackground(Color.red);
                Ven_Cubico.bt_Cubico2.setBackground(Color.red);
                Ven_Cubico.bt_Cubico3.setBackground(Color.red);
                Ven_Cubico.bt_Cubico4.setBackground(Color.red);
                Ven_Cubico.bt_Cubico5.setBackground(Color.red);
                Ven_Cubico.bt_Cubico6.setBackground(Color.red);
                Ven_Cubico.bt_Cubico7.setBackground(Color.red);
                Ven_Cubico.bt_Cubico8.setBackground(Color.red);
                Ven_Cubico.bt_Cubico9.setBackground(Color.red);
                ini_cubiculo = false; //detenemos el hilo
                       
                
            }
        }
       
    }
}