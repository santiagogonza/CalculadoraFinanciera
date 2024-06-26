
package Datos;

import javax.swing.JFrame;


/**
 *
 * @author gonzalo
 */
public class InteresCompuesto extends javax.swing.JFrame {

    /**
     * Creates new form InteresSImple
     */
    public InteresCompuesto() {
        initComponents();
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMonto = new javax.swing.JButton();
        btnCapital = new javax.swing.JButton();
        btnInteres = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTiempo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMonto.setText("MONTO");
        btnMonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMontoMouseClicked(evt);
            }
        });
        btnMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontoActionPerformed(evt);
            }
        });

        btnCapital.setText("CAPITAL");
        btnCapital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCapitalMouseClicked(evt);
            }
        });
        btnCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapitalActionPerformed(evt);
            }
        });

        btnInteres.setText("TASA DE INTERES COMPUESTO");
        btnInteres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInteresMouseClicked(evt);
            }
        });
        btnInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInteresActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INTERES COMPUESTO");

        btnTiempo.setText("TEMPO");
        btnTiempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTiempoMouseClicked(evt);
            }
        });
        btnTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiempoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnInteres)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCapital)
                            .addComponent(btnMonto)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnTiempo)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(btnMonto)
                .addGap(18, 18, 18)
                .addComponent(btnCapital)
                .addGap(18, 18, 18)
                .addComponent(btnInteres)
                .addGap(18, 18, 18)
                .addComponent(btnTiempo)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMontoMouseClicked


    }//GEN-LAST:event_btnMontoMouseClicked

    private void btnMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontoActionPerformed
        // boton para calcular monto
        JFrame frame = new JFrame("Información de Monto Compuesto");
        frame.setContentPane(new CalcularMontoCompuesto());
        frame.pack();
        frame.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnMontoActionPerformed

    private void btnCapitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapitalMouseClicked


    }//GEN-LAST:event_btnCapitalMouseClicked

    private void btnCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapitalActionPerformed
               // action de boton capital

       JFrame frame = new JFrame("Información de Capital Compuesto");
        frame.setContentPane(new CalcularCapitalCompuesto());
        frame.pack();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCapitalActionPerformed

    private void btnInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInteresActionPerformed
           // btn calcular tasa de interes compuesto

        JFrame frame = new JFrame("Información de Interés Compuesto");
        frame.setContentPane(new CalcularTasaInteresCompuesto());
        frame.pack();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInteresActionPerformed

    private void btnInteresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInteresMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInteresMouseClicked

    private void btnTiempoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseClicked
        // TODO add your handling code here:

        
    }//GEN-LAST:event_btnTiempoMouseClicked

    private void btnTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiempoActionPerformed
        // btn calcular el tiempo completo
        
        JFrame frame = new JFrame("Información de Tiempo Compuesto");
        frame.setContentPane(new CalcularTiempoCompuesto());
        frame.pack();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTiempoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InteresCompuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InteresCompuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InteresCompuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InteresCompuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InteresCompuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapital;
    private javax.swing.JButton btnInteres;
    private javax.swing.JButton btnMonto;
    private javax.swing.JButton btnTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
