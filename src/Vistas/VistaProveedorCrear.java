/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Controller.Conexion;
import Controller.ProveedorData;
import Entity.Proveedor;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class VistaProveedorCrear extends javax.swing.JInternalFrame {

    private Connection conexion;
    private ProveedorData proveedorData;

    public VistaProveedorCrear() {
        initComponents();
        conexion = Conexion.getConnection();
        proveedorData = new ProveedorData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btAgregarProvedor = new javax.swing.JButton();
        btModificarProveedor = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel1.setText("PROVEEDORES");

        jLabel2.setText("Razon social:");

        jLabel3.setText("Telefono:");

        jLabel4.setText("Direccion:");

        btAgregarProvedor.setText("AGREGAR");
        btAgregarProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarProvedorActionPerformed(evt);
            }
        });

        btModificarProveedor.setText("MODIFICAR");
        btModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarProveedorActionPerformed(evt);
            }
        });

        btLimpiar.setText("LIMPIAR");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        btBuscar.setText("BUSCAR");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Buscar por razon social:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtTelefono))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(20, 20, 20)
                                .addComponent(txtBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(69, 69, 69)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(288, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAgregarProvedor)
                        .addGap(53, 53, 53)
                        .addComponent(btModificarProveedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(btLimpiar)
                        .addGap(88, 88, 88)
                        .addComponent(btBuscar)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgregarProvedor)
                    .addComponent(btModificarProveedor)
                    .addComponent(btLimpiar)
                    .addComponent(btBuscar))
                .addGap(0, 66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAgregarProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarProvedorActionPerformed
        // TODO add your handling code here:
        String razonSocial = txtRazonSocial.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();

        if (razonSocial.matches("[a-zA-Z\\s]+") && direccion.matches("[a-zA-Z\\s\\d]+")) {
            Proveedor proveedor = new Proveedor(razonSocial, direccion, telefono);
            proveedorData.guardarProveedor(proveedor);
        } else {
            JOptionPane.showMessageDialog(null, "La razón social y la dirección deben contener solo una palabra o letras");
            txtRazonSocial.setText("");
            txtDireccion.setText("");
        }

    }//GEN-LAST:event_btAgregarProvedorActionPerformed

    private void btModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarProveedorActionPerformed
        // TODO add your handling code here:
        if (txtBuscar.getText() != null) {
            String razonSocial = txtRazonSocial.getText();
            String direccion = txtDireccion.getText();
            String telefono = txtTelefono.getText();

            if (razonSocial.matches("[a-zA-Z\\s]+") && direccion.matches("[a-zA-Z\\s\\d]+")) {
                Proveedor proveedor = new Proveedor(razonSocial, direccion, telefono);
                proveedorData.modificarProveedor(proveedor);
            } else {
                JOptionPane.showMessageDialog(null, "La razón social y la dirección deben contener solo palabras o letras");
                txtRazonSocial.setText("");
                txtDireccion.setText("");
            }
        }
    }//GEN-LAST:event_btModificarProveedorActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
        txtRazonSocial.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtBuscar.setText("");
        JOptionPane.showMessageDialog(null, "Limpio!!");
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
        String rSocial = txtBuscar.getText();
        if (rSocial.matches("[a-zA-Z\\s]+")) {
            Proveedor provedor = proveedorData.buscarProveedor(rSocial);
            if (provedor != null) {
                txtRazonSocial.setText(provedor.getRazonSocial());
                txtDireccion.setText(provedor.getDomicilio());
                txtTelefono.setText(provedor.getTelefono());
            }

        } else {
            JOptionPane.showMessageDialog(null, "La razón social en buscar debe contener solo una palabra o letras");
            txtBuscar.setText("");
        }
    }//GEN-LAST:event_btBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarProvedor;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btModificarProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
