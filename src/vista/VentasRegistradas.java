package vista;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class VentasRegistradas extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    
    public VentasRegistradas() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarmodelo();
        calculartotaligvregistrado();
        calculartotalregistrado();
    }
    
    private void cargarmodelo(){
        try{
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Total");
            modelo.addColumn("IGV");
            tablaregistro.setModel(modelo);
            cargararchivo();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    private void calculartotalregistrado(){
        double contar=tablaregistro.getRowCount();
        double suma = 0;
        for(int i = 0;i<contar;i++){
            suma=suma+Double.parseDouble(tablaregistro.getValueAt(i, 2).toString());
            txttotaldeventas.setText(String.valueOf(suma));
        }
    }
    private void calculartotaligvregistrado(){
        double contar2=tablaregistro.getRowCount();
        double suma2 = 0;
        for(int i = 0;i<contar2;i++){
            suma2=suma2+Double.parseDouble(tablaregistro.getValueAt(i, 3).toString());
            impuestototal.setText(String.valueOf(suma2));
        }
    }
    
    private void cargararchivo() throws IOException{
        String fila[];
        try{
            FileReader archivo = new FileReader("RegistroDeVentas.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            
            String linea = lectura.readLine();
            while(linea!=null){
                fila = linea.split("%");
                modelo.addRow(fila);
                linea = lectura.readLine();
            }
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaregistro = new javax.swing.JTable();
        btnvolver = new javax.swing.JButton();
        txttotaldeventas = new javax.swing.JTextField();
        impuestototal = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaregistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE", "APELLIDO", "TOTAL", "IGV"
            }
        ));
        jScrollPane1.setViewportView(tablaregistro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 630, 470));

        btnvolver.setText("Volver");
        btnvolver.setBorderPainted(false);
        btnvolver.setContentAreaFilled(false);
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 663, 140, 70));

        txttotaldeventas.setBackground(new java.awt.Color(0,0,0,1));
        txttotaldeventas.setBorder(null);
        getContentPane().add(txttotaldeventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 647, 220, 30));

        impuestototal.setBackground(new java.awt.Color(0,0,0,1));
        impuestototal.setBorder(null);
        getContentPane().add(impuestototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 705, 220, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro de Ventas Final TGS.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 700, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:
        RegistroDeVentas rv = new RegistroDeVentas();
        this.setVisible(false);
        rv.setVisible(true);
    }//GEN-LAST:event_btnvolverActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentasRegistradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentasRegistradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentasRegistradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentasRegistradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentasRegistradas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField impuestototal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaregistro;
    private javax.swing.JTextField txttotaldeventas;
    // End of variables declaration//GEN-END:variables
}
