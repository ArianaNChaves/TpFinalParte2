/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Controller.CompraData;
import Controller.Conexion;
import Controller.DetalleCompraData;
import Controller.ProductoData;
import Controller.ProveedorData;
import Entity.Compra;
import Entity.DetalleCompra;
import Entity.Producto;
import Entity.Proveedor;
import java.sql.Connection;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class VistaCompraData extends javax.swing.JInternalFrame {

    private Connection conexion;
    private ProductoData productoData;
    private ProveedorData proveedorData;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Proveedor> listaProveedores;
    private CompraData compraData;
    private DetalleCompraData detalleCompraData;

    public VistaCompraData() {
        initComponents();
        conexion = Conexion.getConnection();
        productoData = new ProductoData();
        listaProductos = (ArrayList) productoData.mandarProducto();
        proveedorData = new ProveedorData();
        listaProveedores = (ArrayList) proveedorData.mandarProveedor();
        compraData = new CompraData();
        detalleCompraData = new DetalleCompraData();
        cargarProductocb();
        cargarProveedorcv();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantidadProducto = new javax.swing.JTextField();
        btSolicitar = new javax.swing.JButton();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        cbProveedor = new javax.swing.JComboBox<>();
        cbProducto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel1.setText("SOLICITAR PRODUCTOS");

        jLabel2.setText("Producto Solicitado:");

        jLabel3.setText("Cantidad:");

        jLabel4.setText("Fecha en la que se solicito:");

        btSolicitar.setText("SOLICITAR");
        btSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSolicitarActionPerformed(evt);
            }
        });

        jdFecha.setDateFormatString("yyyy/MM/dd");

        jLabel5.setText("Proveedor:");

        cbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedorActionPerformed(evt);
            }
        });

        jLabel6.setText("Precio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCantidadProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(cbProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecio)
                            .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btSolicitar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btSolicitar)
                .addGap(0, 84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSolicitarActionPerformed
        // TODO add your handling code here:
        Producto p = (Producto) cbProducto.getSelectedItem();
        Proveedor pro = (Proveedor) cbProveedor.getSelectedItem();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = f.format(jdFecha.getDate()) + "";
        Compra compraRealizada = new Compra(pro, Date.valueOf(fecha));

        int idp = p.getIdProducto();

        int cant = Integer.parseInt(txtCantidadProducto.getText());
        double precio = Double.parseDouble(txtPrecio.getText());
        int idc = compraRealizada.getIdCompra();

        int stockActual = p.getStock();
        int stockActualizado = stockActual + cant;

        p.setStock(stockActualizado);
        productoData.actualizarProducto(p);

        Compra compraGuardada = compraData.guardarCompra(compraRealizada);
        DetalleCompra detaCompra = new DetalleCompra(cant, precio, compraGuardada, productoData.buscarProducto(idp));
        System.out.println(detaCompra);
        detalleCompraData.guardarDetalleCompra(detaCompra);


    }//GEN-LAST:event_btSolicitarActionPerformed

    private void cbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSolicitar;
    private javax.swing.JComboBox<Producto> cbProducto;
    private javax.swing.JComboBox<Proveedor> cbProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    public void cargarProductocb() {
        for (Producto item : listaProductos) {
            cbProducto.addItem(item);
        }
    }

    public void cargarProveedorcv() {
        for (Proveedor item : listaProveedores) {
            cbProveedor.addItem(item);
        }
    }

}
