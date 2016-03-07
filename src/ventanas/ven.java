
package ventanas;

import controladores.Coordinador;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

 
public final  class ven extends javax.swing.JFrame
{
   
      public  ven(ven_Principal miVentana, boolean b) {
 
        initComponents();             
        setLocationRelativeTo(null);
        setResizable(false); 
         //graficoGenero();
     
      }
   private Coordinador miCoordinador;
       
         private void initComponents() {
            this.setTitle("Datos Locales");     
            this.pack();
         }
   public void setCoordinador(Coordinador miCoordinador) {
       this.miCoordinador = miCoordinador;
    }

    public void setven(Coordinador miCoordinador) {
         this.miCoordinador = miCoordinador; }

  
  public  void graficoGenero(){
      // por actualizar y mejorar
   /*
      // traemos los datos de la consulta y recoleccion de datos 
       Object[] datos = miCoordinador.bi_consulta_rg_sexo();
       int total = (int) datos[0];
       int f = (int) datos[2];
       int m = (int) datos[1];
       System.out.println("total "+total+" f: "+f+" m: "+m);
       // Fuente de Datos
      
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Femenino",f);
        data.setValue("Masculino", m);
        System.out.println(""+data);
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
         "Grafico por Genero del Uso de Computadoras", 
         data, 
         true, 
         true, 
         false);
 
        // Mostrar Grafico
        ChartFrame frame = new ChartFrame("Grafica por Genero", chart);
        setLocationRelativeTo(null);
        setResizable(false); 
        frame.pack();
        frame.setVisible(true);
*/
   }
  
   }