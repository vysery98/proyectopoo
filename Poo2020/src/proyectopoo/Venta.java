package proyectopoo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author vysery98
 */
public class Venta extends javax.swing.JFrame {

    static List<Producto> productos = new ArrayList<Producto>();

    double subtotal = 0;
    double iva = 0;
    double total = 0;

    /**
     * Creates new form Venta
     */
    public Venta() {
        initComponents();
        this.setTitle("Venta de Productos");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setIconImage(new ImageIcon(getClass()
                .getResource("/imagenes/iconoBarra.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        labelDesc = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        salidaSubtotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        salidaIva = new javax.swing.JLabel();
        salidaTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel1.setText("Punto de venta");

        jLabel2.setText("Buscar: ");

        txtBuscar.setToolTipText("");
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo");

        jLabel4.setText("Descripción");

        jLabel5.setText("P. Unitario");

        jLabel7.setText("$");

        labelTipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTipo.setText("      ");

        labelDesc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDesc.setText("     ");

        labelPrecio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelPrecio.setText("      ");

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        btnComprar.setText("C O M P R A R");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jLabel6.setText("Stock");

        jScrollPane1.setViewportView(lista);

        jLabel8.setText("Cantidad a comprar:");

        jLabel9.setText("Subtotal =");

        jLabel10.setText("         IVA =");

        jLabel11.setText("TOTAL =");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salidaIva, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salidaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(salidaSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(187, 187, 187))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(labelDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(btnComprar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(buscar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelTipo)
                                .addComponent(labelDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnComprar)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salidaSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(salidaIva, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(salidaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(137, 137, 137))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atras))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        String buscar = txtBuscar.getText();

        labelDesc.setText("");
        labelTipo.setText("");
        labelPrecio.setText("");
        labelCantidad.setText("");

        for (Producto prod : Registro.productos) {

            if (prod.getDescripcion().contains(buscar.toUpperCase())) {
                labelTipo.setText(prod.getTipo());
                labelDesc.setText(prod.getDescripcion());
                labelPrecio.setText(prod.getPrecio());
                labelCantidad.setText(prod.getStock());

                Reporte reporte = new Reporte(labelTipo.getText(), labelDesc.getText(), labelPrecio.getText(), labelCantidad.getText());
                productos.add(reporte);

            }

        }

        if (labelDesc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No existe ningún producto "
                    + "que contenga esa descripción.");
        }

    }//GEN-LAST:event_buscarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Menu objMenu = new Menu();

        subtotal = 0;
        iva = 0;
        total = 0;

        objMenu.setVisible(true);
        limpiarLista();
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed

        if ((labelCantidad.getText().equals("")) || (labelPrecio.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "No hay productos que añadir.");
        } else {
            if (Integer.parseInt(labelCantidad.getText()) < Integer.parseInt(txtCantidad.getText())) {
                JOptionPane.showMessageDialog(null, "La cantidad digitada mayor"
                        + " a la que se encuentra en Stock.");
            } else {

                for (int i = 0; i < productos.size(); i++) {

                    if (Registro.productos.get(i).getDescripcion().equals(labelDesc.getText().toUpperCase())) {

                        int operacion = Integer.parseInt(labelCantidad.getText()) - Integer.parseInt(txtCantidad.getText());
                        Registro.productos.get(i).setStock(String.valueOf(operacion));
                    }

                }

                subtotal += (Double.parseDouble(txtCantidad.getText()) * Double.parseDouble(labelPrecio.getText()));
                iva = subtotal * 0.12;
                total = (subtotal + iva);

                salidaSubtotal.setText(String.valueOf(subtotal));
                salidaIva.setText(String.valueOf(iva));
                salidaTotal.setText(String.valueOf(total));
            }

        }

        visualizarLista();
        limpiar();

    }//GEN-LAST:event_btnComprarActionPerformed

    public void limpiarLista() {
        String[] reporteVacio = {""};
        productos.clear();
        lista.setListData(reporteVacio);
    }

    public void visualizarLista() {
        String[] prodReporte = new String[productos.size()];
        int i = 0;
        for (Producto producto : productos) {

            prodReporte[i] = producto.getTipo() + "           "
                    + producto.getDescripcion() + "                            "
                    + producto.getPrecio() + "        " + txtCantidad.getText();
            i++;
        }
        lista.setListData(prodReporte);
    }

    public void limpiar() {
        txtCantidad.setText("");
        txtBuscar.setText("");
    }

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelDesc;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JList lista;
    private javax.swing.JLabel salidaIva;
    private javax.swing.JLabel salidaSubtotal;
    private javax.swing.JLabel salidaTotal;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
