package ventanas;

import controladores.Coordinador;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author maryonday
 */
public class VentanaConsultar extends javax.swing.JFrame {
    private Coordinador miCoordinador;
   

    public VentanaConsultar(ven_Principal miVentana, boolean b) {
       initComponents();
       setLocationRelativeTo(null);
       setResizable(false); 
    }

  
    public void   Consulta(){
       
       DefaultTableModel modelo = (DefaultTableModel) jt_consultar.getModel();
       Object[] fila =null;
       Object[] datos = null;
       modelo.setRowCount(0);  // resetarmos la tabla para que quede vacia
       fila = miCoordinador.bi_consulta_rg(); //traemos los datos de bd
       int x=0, i=0, tam = fila.length;
       System.out.println(fila.length);   
       // REcorremos los datos traidos de bd y los agregamos a la tabla 
       for(x=0; x<tam; x++){ 
           if (fila[x] != null){              
              String dt = (String) fila[x];              
              datos = dt.split(","); 
           //   System.out.println(Arrays.toString(datos));
              modelo.addRow(datos);
           }           
       } 
         miCoordinador.Limpiar();
         
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jp_consulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_consultar = new javax.swing.JTable();
        jb_exportar = new javax.swing.JButton();
        jtb_actualizar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Jp_consulta.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta"));
        Jp_consulta.setLayout(new java.awt.BorderLayout());

        jt_consultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha Hora", "Nombre", "Cedula", "Sexo", "Carrera"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_consultar.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jt_consultar);
        jt_consultar.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jt_consultar.getColumnModel().getColumnCount() > 0) {
            jt_consultar.getColumnModel().getColumn(0).setResizable(false);
            jt_consultar.getColumnModel().getColumn(1).setResizable(false);
            jt_consultar.getColumnModel().getColumn(2).setResizable(false);
            jt_consultar.getColumnModel().getColumn(3).setResizable(false);
            jt_consultar.getColumnModel().getColumn(4).setResizable(false);
        }

        Jp_consulta.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jb_exportar.setText("Exportar");
        jb_exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_exportarActionPerformed(evt);
            }
        });
        Jp_consulta.add(jb_exportar, java.awt.BorderLayout.PAGE_END);

        jtb_actualizar.setText("Actualizar");
        jtb_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_actualizarActionPerformed(evt);
            }
        });
        Jp_consulta.add(jtb_actualizar, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jp_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jp_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_exportarActionPerformed
         JOptionPane.showMessageDialog(null,"Proximamente","Por trabajar",JOptionPane.WARNING_MESSAGE);
          
    }//GEN-LAST:event_jb_exportarActionPerformed

    private void jtb_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_actualizarActionPerformed
          miCoordinador._bi_registro_up();
          Consulta();
    }//GEN-LAST:event_jtb_actualizarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jp_consulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_exportar;
    private javax.swing.JTable jt_consultar;
    private javax.swing.JToggleButton jtb_actualizar;
    // End of variables declaration//GEN-END:variables

    public void setCoordinador(Coordinador miCoordinador) {
      this.miCoordinador = miCoordinador;
      
              }
    
}
