
package ventanas;

import controladores.Coordinador;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

/**
 *
 * @author maryonday
 */
public class Ven_Cubico extends javax.swing.JFrame {
    private Coordinador miCoordinador;
    public Boolean usocubiculo= false;
    public Ven_Cubico(ven_Principal miVentana, boolean b) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        usocubiculo = Coordinador.Usado ;      
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLayeredPane2 = new javax.swing.JLayeredPane();
        bt_Cubico1 = new javax.swing.JButton();
        bt_Cubico4 = new javax.swing.JButton();
        bt_Cubico7 = new javax.swing.JButton();
        bt_Cubico2 = new javax.swing.JButton();
        bt_Cubico5 = new javax.swing.JButton();
        bt_Cubico8 = new javax.swing.JButton();
        bt_Cubico9 = new javax.swing.JButton();
        bt_Cubico6 = new javax.swing.JButton();
        bt_Cubico3 = new javax.swing.JButton();
        Lb_titulo1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        bt_Cubico1.setText("Cubículo #1");
        bt_Cubico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cubico1ActionPerformed(evt);
            }
        });

        bt_Cubico4.setText("Cubículo#4");
        bt_Cubico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cubico4ActionPerformed(evt);
            }
        });

        bt_Cubico7.setText("Cubículo #7");
        bt_Cubico7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cubico7ActionPerformed(evt);
            }
        });

        bt_Cubico2.setText("Cubículo #2");
        bt_Cubico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cubico2ActionPerformed(evt);
            }
        });

        bt_Cubico5.setText("Cubículo#5");
        bt_Cubico5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cubico5ActionPerformed(evt);
            }
        });

        bt_Cubico8.setText("Cubículo #8");
        bt_Cubico8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cubico8ActionPerformed(evt);
            }
        });

        bt_Cubico9.setText("Cubículo #9");
        bt_Cubico9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cubico9ActionPerformed(evt);
            }
        });

        bt_Cubico6.setText("Cubículo #6");
        bt_Cubico6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cubico6ActionPerformed(evt);
            }
        });

        bt_Cubico3.setText("Cubículo#3");
        bt_Cubico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cubico3ActionPerformed(evt);
            }
        });

        Lb_titulo1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        Lb_titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_titulo1.setText("REGISTRO PARA USO DE CUBÍCULOS");

        jTextField1.setBackground(new java.awt.Color(1, 1, 1));
        jTextField1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(216, 255, 0));
        jTextField1.setText("Desarrollado by Maryon  Torres  2015");
        jTextField1.setCaretColor(new java.awt.Color(227, 212, 36));
        jTextField1.setEnabled(false);
        jTextField1.setFocusTraversalPolicyProvider(true);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(Lb_titulo1))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_Cubico4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Cubico1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Cubico7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_Cubico2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Cubico5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Cubico8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_Cubico3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Cubico6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Cubico9, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_titulo1)
                .addGap(40, 40, 40)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(bt_Cubico3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_Cubico1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Cubico2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bt_Cubico5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_Cubico6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(bt_Cubico4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bt_Cubico7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_Cubico8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_Cubico9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)))
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jLayeredPane2.setLayer(bt_Cubico1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bt_Cubico4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bt_Cubico7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bt_Cubico2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bt_Cubico5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bt_Cubico8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bt_Cubico9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bt_Cubico6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bt_Cubico3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Lb_titulo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 0);
        getContentPane().add(jLayeredPane2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Cubico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cubico1ActionPerformed
        this.miCoordinador.mostrarCubiculo(1);
       // if (usocubiculo) {
         
           bt_Cubico1.setBackground(Color.blue); 
       //}
        
        
    }//GEN-LAST:event_bt_Cubico1ActionPerformed

    private void bt_Cubico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cubico2ActionPerformed
        bt_Cubico2.setBackground(Color.CYAN);
        this.miCoordinador.mostrarCubiculo(2);
    }//GEN-LAST:event_bt_Cubico2ActionPerformed

    private void bt_Cubico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cubico3ActionPerformed
        bt_Cubico3.setBackground(Color.ORANGE);
        this.miCoordinador.mostrarCubiculo(3);
    }//GEN-LAST:event_bt_Cubico3ActionPerformed

    private void bt_Cubico4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cubico4ActionPerformed
         bt_Cubico4.setBackground(Color.DARK_GRAY);
         this.miCoordinador.mostrarCubiculo(4);
    }//GEN-LAST:event_bt_Cubico4ActionPerformed

    private void bt_Cubico5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cubico5ActionPerformed
         bt_Cubico5.setBackground(Color.MAGENTA);
         this.miCoordinador.mostrarCubiculo(5);
    }//GEN-LAST:event_bt_Cubico5ActionPerformed

    private void bt_Cubico6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cubico6ActionPerformed
       bt_Cubico6.setBackground(Color.white);
       this.miCoordinador.mostrarCubiculo(6);
    }//GEN-LAST:event_bt_Cubico6ActionPerformed

    private void bt_Cubico7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cubico7ActionPerformed
        bt_Cubico7.setBackground(Color.GRAY);
        this.miCoordinador.mostrarCubiculo(7);
    }//GEN-LAST:event_bt_Cubico7ActionPerformed

    private void bt_Cubico8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cubico8ActionPerformed
         bt_Cubico8.setBackground(Color.RED);
         this.miCoordinador.mostrarCubiculo(8);
    }//GEN-LAST:event_bt_Cubico8ActionPerformed

    private void bt_Cubico9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cubico9ActionPerformed
          bt_Cubico9.setBackground(Color.GREEN);
         this.miCoordinador.mostrarCubiculo(9);
    }//GEN-LAST:event_bt_Cubico9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb_titulo1;
    public static javax.swing.JButton bt_Cubico1;
    public static javax.swing.JButton bt_Cubico2;
    public static javax.swing.JButton bt_Cubico3;
    public static javax.swing.JButton bt_Cubico4;
    public static javax.swing.JButton bt_Cubico5;
    public static javax.swing.JButton bt_Cubico6;
    public static javax.swing.JButton bt_Cubico7;
    public static javax.swing.JButton bt_Cubico8;
    public static javax.swing.JButton bt_Cubico9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public void setCoordinador(Coordinador miCoordinador) {
       this.miCoordinador = miCoordinador;
    }
}
