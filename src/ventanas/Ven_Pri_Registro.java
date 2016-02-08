/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import controladores.Coordinador;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author maryonday
 */

public class Ven_Pri_Registro extends javax.swing.JFrame {
     private Dimension tamPantalla;
     private Rectangle pantalla;
     private Coordinador miCoordinador;
    /**
     * Creates new form principal
     */
  

    public Ven_Pri_Registro(ven_Principal miVentana, boolean b) {
        initComponents();        
        setLocationRelativeTo(null);
        tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        pantalla = new Rectangle(tamPantalla);
        setBounds(pantalla); }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TituloPrincipal = new javax.swing.JLabel();
        BotonRegistrar = new javax.swing.JButton();
        BotonConsultar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ventana Principal");
        setBackground(new java.awt.Color(41, 130, 222));
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/imac.png")).getImage());
        setName("fr_princiapl"); // NOI18N
        setSize(new java.awt.Dimension(650, 450));

        jPanel1.setBackground(new java.awt.Color(77, 176, 250));

        TituloPrincipal.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        TituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloPrincipal.setText("BIENVENIDO AL SISTEMA  REGISTRO DE MAQUINAS");

        BotonRegistrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonRegistrar.setText("REGISTRAR");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        BotonConsultar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonConsultar.setText("CONSULTAR");
        BotonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(1, 1, 1));
        jTextField1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(216, 255, 0));
        jTextField1.setText("Desarrollado por Maryon  Torres  2015");
        jTextField1.setCaretColor(new java.awt.Color(227, 212, 36));
        jTextField1.setEnabled(false);
        jTextField1.setFocusTraversalPolicyProvider(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(BotonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(TituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
         miCoordinador.mostrarVentanaRegistro(); 
         miCoordinador.Limpiar();
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarActionPerformed
         miCoordinador.Limpiar();
         miCoordinador.mostrarVentanaConsulta(); 
        
         miCoordinador.Limpiar();
    }//GEN-LAST:event_BotonConsultarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JLabel TituloPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public void setCoordinador(Coordinador miCoordinador) {
      this.miCoordinador = miCoordinador;
   }

  
}
