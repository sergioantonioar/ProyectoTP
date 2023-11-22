package vista;

import modelo.Ventas;
import controlador.Archivo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroDeVentas extends javax.swing.JFrame {
    String productos[]={"Ninguno","Tonificadores Abdominales","Tobilleras","Fajas Reductoras",
        "Mat de Yoga","Proteinas","Masajeador Facial","Crema Reductora","Pesas","Rueda Abdominal"
        ,"Pelota Fitness"};
    double precios[]={0,125,10,55,10,72,125,25,22,42,63};
    double precio=0;
    int  cantidad;
    int cant;
    double pre;
    double tpagar,tpagarigv;
    double total;
    double sumatotal;
    double sumatoriaigv;
    double resultadoigv;
    double igvunidad;
    DefaultTableModel modelo;

    public RegistroDeVentas() {
        initComponents();
        sumarcolumnatotal();
        sumarcolumnatotaligv();
        limpiar();
        iniciar();
        //sumarcolumnatotal();
//        decimales();
        this.setLocationRelativeTo(null);
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(productos);
        selectordeproducto.setModel(comboModel);
        modelo=new DefaultTableModel();
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("PRODUCTO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PRECIO");
        modelo.addColumn("TOTAL");
        modelo.addColumn("IGV");
        this.tabla.setModel(modelo);                
    }
    public void iniciar(){
        txtnombre.setText("Sergio");
        txtapellido.setText("Ariza");
    }
    public void nuevatabla(){
        modelo = new DefaultTableModel();
        tabla.setModel(modelo);
    }
    
    public void calculadora(){
        precio=precios[selectordeproducto.getSelectedIndex()];
        cantidad=Integer.parseInt(cantidadspiner.getValue().toString());
        txtprecio.setText(String.valueOf(precio));
        txttotal.setText((String.valueOf(total=precio*cantidad)));
        
        igvunidad=(precio*cantidad)*0.18;
        int decimalesdeseados1 = 2;
        double factor1 = Math.pow(10, decimalesdeseados1);
        double numeroredondeado1 = Math.round(igvunidad*factor1)/factor1;
        txtigv.setText(String.valueOf(numeroredondeado1));
    }
    public void sumarcolumnatotal(){
        tpagar=0;
        for(int i=0;i<tabla.getRowCount();i++){
            cant=Integer.parseInt(tabla.getValueAt(i, 3).toString());
            pre=Double.parseDouble(tabla.getValueAt(i, 4).toString());
            tpagar=tpagar+(cant*pre);
        }
        ganancias.setText(String.valueOf(tpagar));
    }
    public void sumarcolumnatotaligv(){
        tpagarigv =0;
        for(int i=0;i<tabla.getRowCount();i++){
            cant=Integer.parseInt(tabla.getValueAt(i, 3).toString());
            pre=Double.parseDouble(tabla.getValueAt(i, 4).toString());
            tpagarigv=tpagarigv+((cant*pre)*0.18);           
        }
        totaligv.setText(String.valueOf(tpagarigv));
    }       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        btningresar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btneliminartodo = new javax.swing.JButton();
        txtigv = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        ganancias = new javax.swing.JTextField();
        totaligv = new javax.swing.JTextField();
        selectordeproducto = new javax.swing.JComboBox<>();
        cantidadspiner = new javax.swing.JSpinner();
        btnlimpiar = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        ganaciatotal = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnregistro = new javax.swing.JButton();
        jlabelfondo = new javax.swing.JLabel();

        jMenuItem1.setText("Enviar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnombre.setBackground(new java.awt.Color(0,0,0,1));
        txtnombre.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtnombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnombre.setBorder(null);
        txtnombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 92, 310, 30));

        txtapellido.setBackground(new java.awt.Color(0,0,0,1));
        txtapellido.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtapellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtapellido.setBorder(null);
        txtapellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 132, 310, 30));

        txtprecio.setBackground(new java.awt.Color(0,0,0,1));
        txtprecio.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtprecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtprecio.setText("S/. 0.00 PEN");
        txtprecio.setBorder(null);
        txtprecio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 132, 310, 30));

        txttotal.setBackground(new java.awt.Color(0,0,0,1));
        txttotal.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txttotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txttotal.setText("S/. 0.00 PEN");
        txttotal.setBorder(null);
        txttotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 310, 30));

        btningresar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btningresar.setBorder(null);
        btningresar.setBorderPainted(false);
        btningresar.setContentAreaFilled(false);
        btningresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btningresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btningresarMouseClicked(evt);
            }
        });
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        getContentPane().add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, 40));

        btneliminar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btneliminar.setBorder(null);
        btneliminar.setBorderPainted(false);
        btneliminar.setContentAreaFilled(false);
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 120, 40));

        btneliminartodo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btneliminartodo.setBorder(null);
        btneliminartodo.setBorderPainted(false);
        btneliminartodo.setContentAreaFilled(false);
        btneliminartodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminartodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminartodoMouseClicked(evt);
            }
        });
        getContentPane().add(btneliminartodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 110, 40));

        txtigv.setBackground(new java.awt.Color(0,0,0,1));
        txtigv.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtigv.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtigv.setText("S/. 0.00 PEN");
        txtigv.setBorder(null);
        txtigv.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtigv, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 94, 160, 30));

        tabla.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO", "PRODUCTO", "CANTIDAD", "PRECIO UNITARIO", "TOTAL", "IGV"
            }
        ));
        tabla.setComponentPopupMenu(jPopupMenu1);
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 1320, 370));

        ganancias.setBackground(new java.awt.Color(0,0,0,1));
        ganancias.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ganancias.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ganancias.setText("S/. 0.00 PEN");
        ganancias.setBorder(null);
        ganancias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ganancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gananciasActionPerformed(evt);
            }
        });
        getContentPane().add(ganancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 663, 190, 30));

        totaligv.setBackground(new java.awt.Color(0,0,0,1));
        totaligv.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        totaligv.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totaligv.setText("S/. 0.00 PEN");
        totaligv.setBorder(null);
        totaligv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(totaligv, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 729, 190, 30));

        selectordeproducto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        selectordeproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectordeproducto.setBorder(null);
        selectordeproducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectordeproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectordeproductoActionPerformed(evt);
            }
        });
        getContentPane().add(selectordeproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 172, 310, 30));

        cantidadspiner.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cantidadspiner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        cantidadspiner.setBorder(null);
        cantidadspiner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cantidadspiner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadspinerStateChanged(evt);
            }
        });
        getContentPane().add(cantidadspiner, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 92, 310, 30));

        btnlimpiar.setBorder(null);
        btnlimpiar.setBorderPainted(false);
        btnlimpiar.setContentAreaFilled(false);
        btnlimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 120, 40));

        btnimprimir.setBorder(null);
        btnimprimir.setContentAreaFilled(false);
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 210, 80));
        getContentPane().add(ganaciatotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 660, 180, 40));

        btnguardar.setBorderPainted(false);
        btnguardar.setContentAreaFilled(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 670, 210, 80));

        btnregistro.setBorderPainted(false);
        btnregistro.setContentAreaFilled(false);
        btnregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 670, 210, 80));

        jlabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Punto De Venta TGS Final.png"))); // NOI18N
        getContentPane().add(jlabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed

    }//GEN-LAST:event_txttotalActionPerformed

    private void btningresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btningresarMouseClicked
   
    }//GEN-LAST:event_btningresarMouseClicked

    private void btneliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarMouseClicked

        int fila=tabla.getSelectedRow();
        if(fila>=0){
            modelo.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione una fila");
        }
        sumarcolumnatotal();
        sumarcolumnatotaligv();
    }//GEN-LAST:event_btneliminarMouseClicked

    private void btneliminartodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminartodoMouseClicked

        int fila=tabla.getRowCount();
        for (int i = fila-1;i >=0;i--){
            modelo.removeRow(i);
        }
        sumarcolumnatotal();
        sumarcolumnatotaligv();
    }//GEN-LAST:event_btneliminartodoMouseClicked

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
     
        String []info=new String[7];
        info[0]=txtnombre.getText();
        info[1]=txtapellido.getText();
        info[2]=selectordeproducto.getSelectedItem().toString();
        info[3]=cantidadspiner.getValue().toString();
        info[4]=txtprecio.getText();
        info[5]=txttotal.getText();
        info[6]=txtigv.getText();
        modelo.addRow(info);               
        selectordeproducto.setSelectedIndex(0);
        cantidadspiner.setValue(1);
        txtprecio.setText("S/. 0.00 PEN");
        txttotal.setText("S/. 0.00 PEN");
        txtigv.setText("S/. 0.00 PEN");
        calculadora();
        sumarcolumnatotal();
        sumarcolumnatotaligv();
        
    }//GEN-LAST:event_btningresarActionPerformed

    private void cantidadspinerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadspinerStateChanged
        calculadora();
    }//GEN-LAST:event_cantidadspinerStateChanged

    private void gananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gananciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gananciasActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
       Boleta boleta = new Boleta();       
       boleta.setDato(txtnombre.getText());
       boleta.setDato2(txtapellido.getText());
       boleta.setDato3(ganancias.getText());
       boleta.setVisible(true);                  
    }//GEN-LAST:event_btnimprimirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void selectordeproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectordeproductoActionPerformed
        calculadora();
    }//GEN-LAST:event_selectordeproductoActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        Archivo archivo = new Archivo();
archivo.creararchivo();

if(txtnombre.getText().isEmpty() || txtapellido.getText().isEmpty() || ganancias.getText().isEmpty() || totaligv.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "No hay ningún dato disponible para registrar");
} else {
    String nombre = txtnombre.getText();
    String apellido = txtapellido.getText();
    String totalventa = ganancias.getText();
    String igvventa = totaligv.getText();
    
    Ventas persona = new Ventas(nombre, apellido, totalventa, igvventa);
    archivo.escribirenarchivo(persona);
    JOptionPane.showMessageDialog(null, "Venta Guardada");
}
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistroActionPerformed
        // TODO add your handling code here:
        VentasRegistradas vr = new VentasRegistradas();
        vr.setVisible(true);
    }//GEN-LAST:event_btnregistroActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btneliminartodo;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnregistro;
    private javax.swing.JSpinner cantidadspiner;
    private javax.swing.JLabel ganaciatotal;
    private javax.swing.JTextField ganancias;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabelfondo;
    private javax.swing.JComboBox<String> selectordeproducto;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField totaligv;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtigv;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtnombre.setText("");
        txtapellido.setText("");
        selectordeproducto.setSelectedIndex(0);
        cantidadspiner.setValue(1);
        txtprecio.setText("S/. 0.00 PEN");
        txttotal.setText("S/. 0.00 PEN");
        txtigv.setText("S/. 0.00 PEN");
    }

    private double round(double sumatoriaigv, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
