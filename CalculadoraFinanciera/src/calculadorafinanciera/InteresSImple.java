/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadorafinanciera;

//  import datosInteresSimple.CalcularMontoSimple;
import datosInteresSimple.CalcularTasaInteresSimple;
import javax.swing.JFrame;

/**
 *
 * @author gonzalo
 */
public class InteresSImple extends javax.swing.JFrame {

    /**
     * Creates new form InteresSImple
     */
    public InteresSImple() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMonto = new javax.swing.JButton();
        btnCapital = new javax.swing.JButton();
        btnInteres = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        btnInteres.setText("TASA DE INTERES SIMPLE");
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
        jLabel1.setText("INTERES SIMPLE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnInteres)
                        .addComponent(btnCapital)
                        .addComponent(btnMonto)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(btnMonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapital)
                .addGap(18, 18, 18)
                .addComponent(btnInteres)
                .addContainerGap(182, Short.MAX_VALUE))
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
        // boton para calcular monto
//        JFrame frame = new JFrame("Información de Monto Simple");
//        frame.setContentPane(new CalcularMontoSimple());
//        frame.pack();
//        frame.setVisible(true);

    }//GEN-LAST:event_btnMontoMouseClicked

    private void btnMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMontoActionPerformed

    private void btnCapitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapitalMouseClicked
        // action de boton capital

        JFrame frame = new JFrame("Información de Capital Simple");
        frame.setContentPane(new CalcularCapital());
        frame.pack();
        frame.setVisible(true);

    }//GEN-LAST:event_btnCapitalMouseClicked

    private void btnCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapitalActionPerformed

    private void btnInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInteresActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Información de Interés Simple");
        frame.setContentPane(new CalcularTasaInteresSimple());
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_btnInteresActionPerformed

    private void btnInteresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInteresMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInteresMouseClicked

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
            java.util.logging.Logger.getLogger(InteresSImple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InteresSImple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InteresSImple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InteresSImple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InteresSImple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapital;
    private javax.swing.JButton btnInteres;
    private javax.swing.JButton btnMonto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
