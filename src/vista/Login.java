package vista;


import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        inicializar();
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new javax.swing.JTextField();
        entrar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setBackground(new java.awt.Color(0,0,0,1));
        user.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        user.setBorder(null);
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 353, 430, 50));

        entrar.setForeground(new java.awt.Color(255, 255, 255));
        entrar.setBorder(null);
        entrar.setContentAreaFilled(false);
        entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarMouseClicked(evt);
            }
        });
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 210, 70));

        salir.setBackground(new java.awt.Color(0,0,0,1));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setBorder(null);
        salir.setContentAreaFilled(false);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 210, 70));

        pass.setBackground(new java.awt.Color(0,0,0,1));
        pass.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        pass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pass.setBorder(null);
        pass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 515, 430, 50));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login TGS Final.png"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void inicializar(){
        user.setText("Admin");
        pass.setText("123");
    }
    private void entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseClicked
        String usuario = user.getText();
        String contra = pass.getText();
        
        if(usuario.isEmpty() || contra.isEmpty()){
            JOptionPane.showMessageDialog(null,"Algún campo esta vacio");
        }else{
            if(usuario.equals("Admin") && contra.equals("123")){
                RegistroDeVentas rv = new RegistroDeVentas();
                rv.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showConfirmDialog(null, "Su usuario o contraseña son incorrectos, intentelo nuevamente");
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_entrarMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
// TODO add your handling code here:
    }//GEN-LAST:event_salirMouseClicked

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrarActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrar;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton salir;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
