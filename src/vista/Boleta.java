package vista;



public class Boleta extends javax.swing.JFrame {
    
    private String dato;
    private String dato2;
    private String dato3;
    
//    double cant;
//    double pre;
//    double totalpagarboelta;
    public Boleta() {
        initComponents();
        this.setLocationRelativeTo(null);
        btncalcular.addActionListener((java.awt.event.ActionEvent evt) -> {
//        sumarcolumnaboleta();
        });        
    }
    //Obtener datos del JFrame RegistroDeVentas
    public void setDato(String dato){  
        this.dato=dato;
        txtnombreboleta.setText(dato);
    }
    public void setDato2(String dato2){
        this.dato2=dato2;
        txtapellidoboleta.setText(dato2);
    }
    public void setDato3(String dato3){
        this.dato3=dato3;
        txtboletatotal.setText(dato3);
    }
//    public void setDato3(double datp3){
//        this.dato3=dato3;
//        txtboletatotal.setText(dato3);
//    }
    //Suma de Columna
//    public void sumarcolumnaboleta(){
//        totalpagarboelta =0;
//        for(int i=0;i<tablaboleta.getRowCount();i++){
//            cant=Integer.parseInt(tablaboleta.getValueAt(i, 1).toString());
//            pre=Double.parseDouble(tablaboleta.getValueAt(i, 2).toString());
//            totalpagarboelta=totalpagarboelta+(cant*pre);           
//        }
//        txtboletatotal.setText(String.valueOf(totalpagarboelta));
//    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnombreboleta = new javax.swing.JTextField();
        txtapellidoboleta = new javax.swing.JTextField();
        txtimportepagado = new javax.swing.JTextField();
        txtvuelto = new javax.swing.JTextField();
        btncalcular = new javax.swing.JButton();
        txtboletatotal = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnombreboleta.setBackground(new java.awt.Color(0,0,0,1));
        txtnombreboleta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtnombreboleta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtnombreboleta.setBorder(null);
        getContentPane().add(txtnombreboleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 93, 220, 30));

        txtapellidoboleta.setBackground(new java.awt.Color(0,0,0,1));
        txtapellidoboleta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtapellidoboleta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtapellidoboleta.setBorder(null);
        getContentPane().add(txtapellidoboleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 143, 220, 30));

        txtimportepagado.setBackground(new java.awt.Color(0,0,0,1));
        txtimportepagado.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtimportepagado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtimportepagado.setBorder(null);
        txtimportepagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtimportepagadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtimportepagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 253, 220, 30));

        txtvuelto.setBackground(new java.awt.Color(0,0,0,1));
        txtvuelto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtvuelto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtvuelto.setBorder(null);
        getContentPane().add(txtvuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 220, 30));

        btncalcular.setBackground(new java.awt.Color(0,0,0,1));
        btncalcular.setBorder(null);
        btncalcular.setContentAreaFilled(false);
        btncalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncalcularMouseClicked(evt);
            }
        });
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btncalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 90, 80));

        txtboletatotal.setBackground(new java.awt.Color(0,0,0,1));
        txtboletatotal.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtboletatotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtboletatotal.setBorder(null);
        txtboletatotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtboletatotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtboletatotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 220, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boleta  3.0.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtboletatotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtboletatotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtboletatotalActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        // TODO add your handling code here:
        double n1,n2,restavuelto;
        n1=Double.parseDouble(txtboletatotal.getText());
        n2=Double.parseDouble(txtimportepagado.getText());
        restavuelto=n2-n1;
        txtvuelto.setText(String.valueOf(restavuelto));
//        sumarcolumnaboleta();
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btncalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncalcularMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncalcularMouseClicked

    private void txtimportepagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtimportepagadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtimportepagadoActionPerformed

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
            java.util.logging.Logger.getLogger(Boleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btncalcular;
    private javax.swing.JTextField txtapellidoboleta;
    private javax.swing.JTextField txtboletatotal;
    private javax.swing.JTextField txtimportepagado;
    private javax.swing.JTextField txtnombreboleta;
    private javax.swing.JTextField txtvuelto;
    // End of variables declaration//GEN-END:variables
}
