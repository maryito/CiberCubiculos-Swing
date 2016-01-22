package ventanas;

import controladores.Coordinador;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author maryonday
 */
public class ven_Principal extends javax.swing.JFrame {

    /**
     * Creates new form ven_Principal
     */
    private Dimension tamPantalla;
    private Rectangle pantalla;
    private Coordinador miCoordinador;
    public ven_Principal() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage (new ImageIcon(getClass().getResource("/imagenes/imac.png")).getImage());
        tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        pantalla = new Rectangle(tamPantalla);
        setBounds(pantalla); 
         setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        addWindowListener(new WindowAdapter(){
        	
        @Override
        public void windowClosing(WindowEvent e){
        	Object[] options = {"Si","No"};
        	int n = JOptionPane.showOptionDialog( null,
        		"¿Seguro que Desea Salir?. \n Si sale el sistema se Cerrara","Confirmacion",JOptionPane.YES_NO_CANCEL_OPTION,
        	   JOptionPane.WARNING_MESSAGE,null,options,options[0]);
        	 if (n == JOptionPane.YES_OPTION){
                  System.exit(0);// permite cerrar el sistema
                 }
        	 else if( n == JOptionPane.NO_OPTION){ }
        	
        }
        
        });
    }   

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_Computadoras = new javax.swing.JButton();
        bt_Cubiculos = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(48, 214, 218));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
        jLabel1.setText("BIENVENIDO AL SISTEMA ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        bt_Computadoras.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        bt_Computadoras.setText("Computadoras");
        bt_Computadoras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_Computadoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ComputadorasActionPerformed(evt);
            }
        });
        jPanel2.add(bt_Computadoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 228, 94));
        bt_Computadoras.getAccessibleContext().setAccessibleDescription("");

        bt_Cubiculos.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        bt_Cubiculos.setText("Cubículos");
        bt_Cubiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CubiculosActionPerformed(evt);
            }
        });
        jPanel2.add(bt_Cubiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 253, 94));

        jTextField1.setBackground(new java.awt.Color(1, 1, 1));
        jTextField1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(216, 255, 0));
        jTextField1.setText("Desarrollado by Maryon  Torres  2015");
        jTextField1.setCaretColor(new java.awt.Color(227, 212, 36));
        jTextField1.setEnabled(false);
        jTextField1.setFocusTraversalPolicyProvider(true);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 400, 31));

        getContentPane().add(jPanel2);

        jMenu1.setText("Consultas");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Registro de Usuario de Computadora");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Grafico");

        jMenuItem2.setText("Genero");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_CubiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CubiculosActionPerformed
        this.miCoordinador.IniciarTiempo();
        this.miCoordinador.mostrarVentanaCubiculo();        
    }//GEN-LAST:event_bt_CubiculosActionPerformed

    private void bt_ComputadorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ComputadorasActionPerformed
       this.miCoordinador.IniciarTiempo();
        this.miCoordinador.mostrarVentanaRegistro();
    }//GEN-LAST:event_bt_ComputadorasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       this.miCoordinador.mostrarVentanaConsulta();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       this.miCoordinador.mostrarGrafico();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Computadoras;
    private javax.swing.JButton bt_Cubiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public void setCoordinador(Coordinador miCoordinador) {
       this.miCoordinador =miCoordinador;
    }
}
