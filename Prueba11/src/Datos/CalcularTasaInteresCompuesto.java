
package Datos;



/**
 *
 * @author gonzalo
 */
public class CalcularTasaInteresCompuesto extends javax.swing.JPanel {

  
    public CalcularTasaInteresCompuesto() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCapital = new javax.swing.JLabel();
        jTextMonto = new javax.swing.JTextField();
        jLabelInteres = new javax.swing.JLabel();
        jTextCapital = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextTiempo = new javax.swing.JTextField();
        jLabelResultado = new javax.swing.JLabel();
        jTextResultado = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        jLabelCapital.setText("Inserte el Monto:");

        jTextMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMontoActionPerformed(evt);
            }
        });

        jLabelInteres.setText("Inserte el Capital:");

        jTextCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCapitalActionPerformed(evt);
            }
        });

        jLabel1.setText("Inserte el tiempo:");

        jLabelResultado.setText("Rersultado");

        btnCancelar.setText("CANCELAR");

        btnCalcular.setText("CALCULAR");
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextTiempo))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelInteres)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextCapital))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelCapital)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelResultado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnCancelar)
                        .addGap(35, 35, 35)
                        .addComponent(btnCalcular)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCapital)
                    .addComponent(jTextMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInteres)
                    .addComponent(jTextCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResultado)
                    .addComponent(jTextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnCalcular))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMontoActionPerformed

    private void jTextCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCapitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCapitalActionPerformed

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked
        // calcular la tasa de interes simple


    double capital = Double.parseDouble(jTextCapital.getText());
    double monto = Double.parseDouble(jTextMonto.getText()); // Asegúrate de que el monto esté ingresado
    double tiempo = Double.parseDouble(jTextTiempo.getText());
    

  
  //formula para calcular tasa de interes compuesto
 
   double tasaInteres = Math.pow(monto / capital, 1.0 / tiempo) - 1;
  
    
    // Mostrar el resultado del interés en el campo de texto correspondiente
   jTextResultado.setText(String.format("%.4f", tasaInteres)); // Formatear a 2 decimales
  // jTextResultado.setText(String.format("%.4f", tasaInteres)); // Formatear a 2 decimales

    }//GEN-LAST:event_btnCalcularMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCapital;
    private javax.swing.JLabel jLabelInteres;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JTextField jTextCapital;
    private javax.swing.JTextField jTextMonto;
    private javax.swing.JTextField jTextResultado;
    private javax.swing.JTextField jTextTiempo;
    // End of variables declaration//GEN-END:variables
}
