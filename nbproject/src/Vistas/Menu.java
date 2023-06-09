
package Vistas;

/**
 *
 * @author User
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenuItem = new javax.swing.JMenu();
        jmRegistrarProductos = new javax.swing.JMenuItem();
        jmRealizarVentas = new javax.swing.JMenuItem();
        jmAdministrarClientes = new javax.swing.JMenuItem();
        jmRPP = new javax.swing.JMenuItem();
        jmRegistrarProveedor = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jMenuItem.setText("Opciones");
        jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemActionPerformed(evt);
            }
        });

        jmRegistrarProductos.setText("Registrar productos");
        jmRegistrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistrarProductosActionPerformed(evt);
            }
        });
        jMenuItem.add(jmRegistrarProductos);

        jmRealizarVentas.setText("Realizar ventas");
        jmRealizarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRealizarVentasActionPerformed(evt);
            }
        });
        jMenuItem.add(jmRealizarVentas);

        jmAdministrarClientes.setText("Administrar clientes");
        jmAdministrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAdministrarClientesActionPerformed(evt);
            }
        });
        jMenuItem.add(jmAdministrarClientes);

        jmRPP.setText("Realizar pedidos a proveedores");
        jmRPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRPPActionPerformed(evt);
            }
        });
        jMenuItem.add(jmRPP);

        jmRegistrarProveedor.setText("Regristrar proveedor");
        jmRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistrarProveedorActionPerformed(evt);
            }
        });
        jMenuItem.add(jmRegistrarProveedor);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenuItem.add(jmSalir);

        jMenuBar3.add(jMenuItem);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmRealizarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRealizarVentasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaVentaData vvd = new VistaVentaData();
        vvd.setVisible(true);
        escritorio.add(vvd);
        escritorio.moveToFront(vvd);
    }//GEN-LAST:event_jmRealizarVentasActionPerformed

    private void jmRegistrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistrarProductosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaProductoData vpd = new VistaProductoData();
        vpd.setVisible(true);
        escritorio.add(vpd);
        escritorio.moveToFront(vpd);
    }//GEN-LAST:event_jmRegistrarProductosActionPerformed

    private void jmAdministrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAdministrarClientesActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaClienteData vcd = new VistaClienteData();
        vcd.setVisible(true);
        escritorio.add(vcd);
        escritorio.moveToFront(vcd);
    }//GEN-LAST:event_jmAdministrarClientesActionPerformed

    private void jmRPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRPPActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaCompraData vpd = new VistaCompraData();
        vpd.setVisible(true);
        escritorio.add(vpd);
        escritorio.moveToFront(vpd);
    }//GEN-LAST:event_jmRPPActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemActionPerformed
        // TODO add your handling code here:]
    }//GEN-LAST:event_jMenuItemActionPerformed

    private void jmRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistrarProveedorActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaProveedorCrear vpc = new VistaProveedorCrear();
        vpc.setVisible(true);
        escritorio.add(vpc);
        escritorio.moveToFront(vpc);
    }//GEN-LAST:event_jmRegistrarProveedorActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenu jMenuItem;
    private javax.swing.JMenuItem jmAdministrarClientes;
    private javax.swing.JMenuItem jmRPP;
    private javax.swing.JMenuItem jmRealizarVentas;
    private javax.swing.JMenuItem jmRegistrarProductos;
    private javax.swing.JMenuItem jmRegistrarProveedor;
    private javax.swing.JMenuItem jmSalir;
    // End of variables declaration//GEN-END:variables
}
