
package ventanas;

import controladores.Coordinador;
import controladores.Logica;
import controladores.Procesos;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.UsuarioVo;
import modelo.conexion.UsuarioDao;


/**
 *
 * @author maryonday
 */
public class VentanaRegistrar extends javax.swing.JFrame{
    private Coordinador miCoordinador;  
    
    public VentanaRegistrar(ven_Principal miVentana, boolean b) {
       initComponents();
       
       float an = 0.6F; // una ventana al 50% del tamaño de la pantalla
       float escalar = 0.9F;
       int ancho = (int)(Toolkit.getDefaultToolkit().getScreenSize(). width*an);
       int alto = (int)(Toolkit.getDefaultToolkit().getScreenSize(). height*escalar);
       this.setSize(ancho,alto);
       setLocationRelativeTo(null);
       setResizable(false);       
    }

    
    private void registrar() {
       
        
        boolean verificarCampos = Coordinador.ValidarCampos(txt_Nombre.getText().trim(),txt_Cedula.getText().trim());
        boolean verificarsexo  =  Logica.ValidarSexo(rb_Femenino.isSelected(),rb_Masculino.isSelected() );
        boolean verificarCarrera = Logica.ValidarCarrera(cb_ACD.isSelected(),cb_MP.isSelected(),
                    cb_ING.isSelected(),cb_DR.isSelected(),cb_CA.isSelected(),
                    cb_GLION.isSelected(),cb_CS.isSelected(),cb_Otros.isSelected() );
        
        if(verificarCampos && verificarsexo && verificarCarrera){
            UsuarioVo usu = new UsuarioVo(); 
            usu.setNombre(txt_Nombre.getText().trim());
            usu.setCedula(txt_Cedula.getText().trim());   
            
            usu.setFechahora(lb_hora.getText().trim().replaceAll("Fecha: ",""));
             //sexo
           if(rb_Femenino.isSelected() == true){  usu.setSexo("femenino"); }  
           if (rb_Masculino.isSelected() == true){usu.setSexo("masculino"); } 

           // carrera 
           if (cb_ACD.isSelected()  == true) {usu.setCarrera("ACD");}
           if (cb_MP.isSelected()  == true) {usu.setCarrera("MP");}
           if (cb_ING.isSelected()  == true) {usu.setCarrera("ING");}
            if (cb_DR.isSelected()  == true) {usu.setCarrera("DR");}
           if (cb_CA.isSelected()  == true) {usu.setCarrera("CA");}
           if (cb_GLION.isSelected()  == true) {usu.setCarrera("GLION");}
           if (cb_CS.isSelected()  == true) {usu.setCarrera("CS");}
           if (cb_Otros.isSelected()  == true) {usu.setCarrera("Otros");}
           
           UsuarioDao bd = new UsuarioDao();
          // miCoordinador.RegistroExitoso();
           String retorno="";
           System.out.println(retorno);
           
           retorno = bd.registraUsuario(usu);
            String informacion = null;
            String estado = null;
            int icon = 0;
            
            //sino hay conexion a la bd de datos se guardan localmente
            if(retorno != "ok"){
                String estafo_fuera = bd.RegistrarFueraLinea(usu);
                Logica.Registro_save_off(estafo_fuera);
            }
            // manejo de ventanas de informacion xD
           miCoordinador.ManejoStatus(retorno);
         limpiar();
         bd.bi_regristro_datos(usu.getCedula());
        }else{
            String resultado ="";  
            if(verificarCampos){ resultado = "Sexo y Área Académica";}
            if(verificarsexo){ resultado = "Nombre/Cedula y Área Académica";}
            if(verificarCarrera){ resultado += "Nombre/Cedula y Sexo";}
            if ((verificarCarrera && verificarsexo )){ resultado = "Nombre o Cédula";}
            if  (verificarCampos && verificarCarrera){ resultado ="Sexo";}
            if  (verificarCampos && verificarsexo){ resultado ="Área Academia";}
            if(resultado ==""){
                 JOptionPane.showMessageDialog(null,"El Usuario no pudo ser registrado. \n Campos Incompletos"+resultado,"Error",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"El Usuario no pudo ser registrado. \n Verifique los  Siguientes Campos: "+resultado,"Faltan Datos",JOptionPane.WARNING_MESSAGE);
            }
           
        }    
          
       
    }
    
    private void limpiar() {
        txt_Nombre.setText(null);
        txt_Cedula.setText(null);
        rb_Femenino.setSelected(false);
        rb_Masculino.setSelected(false);
        btg_sexo.clearSelection();
        btg_academico.clearSelection();      
   }
    
    public void setCoordinador(Coordinador miCoordinador) {
       this.miCoordinador = miCoordinador;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btg_sexo = new javax.swing.ButtonGroup();
        btg_academico = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_principal = new javax.swing.JPanel();
        bt_Aceptar = new javax.swing.JButton();
        Lb_titulo3 = new javax.swing.JLabel();
        panel_datos = new javax.swing.JPanel();
        lb_Nombre = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        lb_Cedula = new javax.swing.JLabel();
        txt_Cedula = new javax.swing.JTextField();
        lb_Sexo = new javax.swing.JLabel();
        rb_Femenino = new javax.swing.JRadioButton();
        rb_Masculino = new javax.swing.JRadioButton();
        pane_academia = new javax.swing.JPanel();
        Lb_titulo4 = new javax.swing.JLabel();
        cb_DR = new javax.swing.JCheckBox();
        cb_ACD = new javax.swing.JCheckBox();
        cb_MP = new javax.swing.JCheckBox();
        cb_ING = new javax.swing.JCheckBox();
        cb_CA = new javax.swing.JCheckBox();
        cb_GLION = new javax.swing.JCheckBox();
        cb_CS = new javax.swing.JCheckBox();
        cb_Otros = new javax.swing.JCheckBox();
        Lb_titulo1 = new javax.swing.JLabel();
        lb_hora = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resgistrar");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        panel_principal.setBackground(java.awt.Color.white);
        panel_principal.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.white));
        panel_principal.setToolTipText("");
        panel_principal.setAutoscrolls(true);
        panel_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_principal.setFocusCycleRoot(true);

        bt_Aceptar.setBackground(new java.awt.Color(121, 224, 231));
        bt_Aceptar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        bt_Aceptar.setForeground(new java.awt.Color(0, 185, 6));
        bt_Aceptar.setText("ACEPTAR");
        bt_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AceptarActionPerformed(evt);
            }
        });

        Lb_titulo3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        Lb_titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_titulo3.setText("GRACIAS POR COMPLETAR");

        panel_datos.setBackground(new java.awt.Color(218, 214, 232));

        lb_Nombre.setFont(new java.awt.Font("Ubuntu", 2, 24)); // NOI18N
        lb_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_Nombre.setText("Nombre: ");

        lb_Cedula.setFont(new java.awt.Font("Ubuntu", 2, 24)); // NOI18N
        lb_Cedula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_Cedula.setText("Cedula / Pasaporte:");

        lb_Sexo.setFont(new java.awt.Font("Ubuntu", 2, 24)); // NOI18N
        lb_Sexo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_Sexo.setText("Sexo:");

        rb_Femenino.setBackground(new java.awt.Color(200, 200, 200));
        btg_sexo.add(rb_Femenino);
        rb_Femenino.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        rb_Femenino.setForeground(new java.awt.Color(177, 30, 54));
        rb_Femenino.setText("Femenino");

        rb_Masculino.setBackground(new java.awt.Color(200, 200, 200));
        btg_sexo.add(rb_Masculino);
        rb_Masculino.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        rb_Masculino.setForeground(new java.awt.Color(177, 30, 54));
        rb_Masculino.setText("Masculino");

        pane_academia.setBackground(new java.awt.Color(185, 202, 214));
        pane_academia.setForeground(new java.awt.Color(1, 1, 1));
        pane_academia.setToolTipText("");

        Lb_titulo4.setBackground(new java.awt.Color(53, 168, 224));
        Lb_titulo4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        Lb_titulo4.setForeground(new java.awt.Color(254, 254, 254));
        Lb_titulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_titulo4.setText("AREA ACADEMICA");

        cb_DR.setBackground(new java.awt.Color(200, 200, 200));
        btg_academico.add(cb_DR);
        cb_DR.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cb_DR.setForeground(new java.awt.Color(177, 30, 54));
        cb_DR.setText("DR");

        cb_ACD.setBackground(new java.awt.Color(200, 200, 200));
        btg_academico.add(cb_ACD);
        cb_ACD.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cb_ACD.setForeground(new java.awt.Color(177, 30, 54));
        cb_ACD.setText("ACD");

        cb_MP.setBackground(new java.awt.Color(200, 200, 200));
        btg_academico.add(cb_MP);
        cb_MP.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cb_MP.setForeground(new java.awt.Color(177, 30, 54));
        cb_MP.setText("MP");

        cb_ING.setBackground(new java.awt.Color(200, 200, 200));
        btg_academico.add(cb_ING);
        cb_ING.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cb_ING.setForeground(new java.awt.Color(177, 30, 54));
        cb_ING.setText("Ingenieria");

        cb_CA.setBackground(new java.awt.Color(200, 200, 200));
        btg_academico.add(cb_CA);
        cb_CA.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cb_CA.setForeground(new java.awt.Color(177, 30, 54));
        cb_CA.setText("CA");

        cb_GLION.setBackground(new java.awt.Color(200, 200, 200));
        btg_academico.add(cb_GLION);
        cb_GLION.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cb_GLION.setForeground(new java.awt.Color(177, 30, 54));
        cb_GLION.setText("GLION");

        cb_CS.setBackground(new java.awt.Color(200, 200, 200));
        btg_academico.add(cb_CS);
        cb_CS.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cb_CS.setForeground(new java.awt.Color(177, 30, 54));
        cb_CS.setText("CS");

        cb_Otros.setBackground(new java.awt.Color(200, 200, 200));
        btg_academico.add(cb_Otros);
        cb_Otros.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cb_Otros.setForeground(new java.awt.Color(177, 30, 54));
        cb_Otros.setText("OTROS");

        javax.swing.GroupLayout pane_academiaLayout = new javax.swing.GroupLayout(pane_academia);
        pane_academia.setLayout(pane_academiaLayout);
        pane_academiaLayout.setHorizontalGroup(
            pane_academiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_academiaLayout.createSequentialGroup()
                .addGroup(pane_academiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pane_academiaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lb_titulo4))
                    .addGroup(pane_academiaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pane_academiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_ACD)
                            .addComponent(cb_MP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pane_academiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_ING)
                            .addComponent(cb_DR))
                        .addGap(47, 47, 47)
                        .addGroup(pane_academiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_Otros)
                            .addComponent(cb_CS))))
                .addGap(60, 60, 60)
                .addGroup(pane_academiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_GLION)
                    .addComponent(cb_CA))
                .addGap(24, 24, 24))
        );
        pane_academiaLayout.setVerticalGroup(
            pane_academiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_academiaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lb_titulo4)
                .addGap(22, 22, 22)
                .addGroup(pane_academiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane_academiaLayout.createSequentialGroup()
                        .addGroup(pane_academiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_ACD)
                            .addComponent(cb_ING)
                            .addComponent(cb_Otros))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pane_academiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pane_academiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cb_MP)
                                .addComponent(cb_DR))
                            .addComponent(cb_CS)))
                    .addGroup(pane_academiaLayout.createSequentialGroup()
                        .addComponent(cb_CA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_GLION)))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout panel_datosLayout = new javax.swing.GroupLayout(panel_datos);
        panel_datos.setLayout(panel_datosLayout);
        panel_datosLayout.setHorizontalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosLayout.createSequentialGroup()
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(lb_Cedula)
                                .addGap(30, 30, 30)
                                .addComponent(txt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(lb_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosLayout.createSequentialGroup()
                        .addComponent(lb_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(rb_Femenino)
                        .addGap(18, 18, 18)
                        .addComponent(rb_Masculino)
                        .addGap(48, 48, 48)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane_academia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_datosLayout.setVerticalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_Femenino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_Masculino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pane_academia, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Lb_titulo1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        Lb_titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_titulo1.setText("REGISTRO PARA USO DE COMPUTADORAS");

        lb_hora.setFont(new java.awt.Font("Ubuntu", 2, 24)); // NOI18N
        lb_hora.setForeground(new java.awt.Color(39, 127, 228));
        lb_hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hora.setText("HORA DEL SISTEMA");
        lb_hora.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 185, 0)));

        jTextField1.setBackground(new java.awt.Color(1, 1, 1));
        jTextField1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(216, 255, 0));
        jTextField1.setText("Desarrollado by Maryon  Torres  2015");
        jTextField1.setCaretColor(new java.awt.Color(227, 212, 36));
        jTextField1.setEnabled(false);
        jTextField1.setFocusTraversalPolicyProvider(true);

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lb_titulo1)
                            .addGroup(panel_principalLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lb_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lb_titulo3)
                            .addComponent(bt_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Lb_titulo1)
                .addGap(20, 20, 20)
                .addComponent(lb_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lb_titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(bt_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(panel_principal);
        panel_principal.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public  void InicarHora(){
        Procesos time = new Procesos();
    };
    private void bt_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AceptarActionPerformed
        // TODO add your handling code here:
        registrar();        
        
    }//GEN-LAST:event_bt_AceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb_titulo1;
    private javax.swing.JLabel Lb_titulo3;
    private javax.swing.JLabel Lb_titulo4;
    private javax.swing.JButton bt_Aceptar;
    private javax.swing.ButtonGroup btg_academico;
    private javax.swing.ButtonGroup btg_sexo;
    private javax.swing.JCheckBox cb_ACD;
    private javax.swing.JCheckBox cb_CA;
    private javax.swing.JCheckBox cb_CS;
    private javax.swing.JCheckBox cb_DR;
    private javax.swing.JCheckBox cb_GLION;
    private javax.swing.JCheckBox cb_ING;
    private javax.swing.JCheckBox cb_MP;
    private javax.swing.JCheckBox cb_Otros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb_Cedula;
    private javax.swing.JLabel lb_Nombre;
    private javax.swing.JLabel lb_Sexo;
    public static javax.swing.JLabel lb_hora;
    private javax.swing.JPanel pane_academia;
    private javax.swing.JPanel panel_datos;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JRadioButton rb_Femenino;
    private javax.swing.JRadioButton rb_Masculino;
    private javax.swing.JTextField txt_Cedula;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables


}
