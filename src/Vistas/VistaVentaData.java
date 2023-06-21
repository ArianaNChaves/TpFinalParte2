/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Controller.ClienteData;
import Controller.Conexion;
import Controller.DetalleVentaData;
import Controller.ProductoData;
import Controller.VentaData;
import Entity.Cliente;
import Entity.DetalleVenta;
import Entity.Producto;
import Entity.Venta;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dateTime;
import java.sql.Connection;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VistaVentaData extends javax.swing.JInternalFrame {

    private ArrayList<Producto> listaProductos;
    private ArrayList<Cliente> listaClientes;
    private DetalleVentaData detalleVentaData;
    private Connection conexion;
    private VentaData ventaData;
    private List<Venta> listaVenta;
    private ClienteData clienteData;
    private ProductoData productoData;
    private DefaultTableModel model;

    public VistaVentaData() {
        initComponents();
        conexion = Conexion.getConnection();
        ventaData = new VentaData();
        listaVenta = (List) ventaData.consultarVentas();
        clienteData = new ClienteData();
        listaClientes = (ArrayList) clienteData.mandarCliente();
        productoData = new ProductoData();
        listaProductos = (ArrayList) productoData.mandarProducto();

        detalleVentaData = new DetalleVentaData();
        model = new DefaultTableModel();
        cargarClientecb();
        cargarProductocb();
        armarCabeceraTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btRegistrarVenta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnConsultarVentas = new javax.swing.JButton();
        jdFechaVenta = new com.toedter.calendar.JDateChooser();
        btLimpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCantidadProd = new javax.swing.JTextField();
        txtPrecioventaProd = new javax.swing.JTextField();
        cbCliente = new javax.swing.JComboBox<>();
        cbProducVendido = new javax.swing.JComboBox<>();

        jLabel6.setText("jLabel6");

        jPasswordField1.setText("jPasswordField1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel1.setText("REALIZAR VENTAS");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setText("Producto a vender:");

        jLabel3.setText("Cliente:");

        jLabel4.setText("Fecha:");

        btRegistrarVenta.setText("REGISTRAR");
        btRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarVentaActionPerformed(evt);
            }
        });

        jLabel5.setText("______________________________________________________________________________________________________________");

        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel7.setText("CONSULTAR VENTAS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnConsultarVentas.setText("CONSULTAR");
        btnConsultarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVentasActionPerformed(evt);
            }
        });

        jdFechaVenta.setDateFormatString("yyyy/MM/dd");

        btLimpiar.setText("LIMPIAR");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        jLabel8.setText("Cantidad:");

        jLabel9.setText("Precio de venta: ");

        cbCliente.setToolTipText("");

        cbProducVendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProducVendidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbProducVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(278, 278, 278)
                                        .addComponent(btRegistrarVenta))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(btLimpiar)
                                    .addComponent(jLabel9))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidadProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioventaProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(166, 166, 166))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(315, 315, 315))
            .addGroup(layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(btnConsultarVentas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txtCantidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProducVendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jdFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPrecioventaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRegistrarVenta)
                    .addComponent(btLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarVentas)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVentasActionPerformed
        // TODO add your handling code here:
        consultarVentas();
    }//GEN-LAST:event_btnConsultarVentasActionPerformed

    private void btRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarVentaActionPerformed
        try {
            Producto p = (Producto) cbProducVendido.getSelectedItem();
            Cliente c = (Cliente) cbCliente.getSelectedItem();
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = f.format(jdFechaVenta.getDate()) + "";

            int idp = p.getIdProducto();

            String cantidadText = txtCantidadProd.getText();

            if (cantidadText.matches("\\d+")) {
                int cant = Integer.parseInt(cantidadText);

                if (cant > 0) {
                    double precioUnitario = productoData.obtenerPrecioProducto(idp);
                    System.out.println(precioUnitario);
                    double subtotal = cant * precioUnitario;

                    int stockActual = p.getStock();

                    if (cant > stockActual) {
                        JOptionPane.showMessageDialog(null, "Stock insuficiente.");
                    } else {
                        int stockActualizado = stockActual - cant;

                        p.setStock(stockActualizado);
                        productoData.actualizarProducto(p);

                        Venta ventaRealizada = new Venta(Date.valueOf(fecha), c);
                        ventaData.guardarVenta(ventaRealizada);
                        //int idv = ventaRealizada.getIdVenta();
                        DetalleVenta detaventa = new DetalleVenta(cant, subtotal, ventaRealizada, productoData.buscarProducto(idp));
                        System.out.println(detaventa);
                        detalleVentaData.guardarDetalleVenta(detaventa);
                        txtPrecioventaProd.setText(detaventa.getPrecioVenta() + "");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido para la cantidad.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Faltan completar campos.");
        }

    }//GEN-LAST:event_btRegistrarVentaActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
        txtCantidadProd.setText("");
        txtPrecioventaProd.setText("");
        jdFechaVenta.setCalendar(null);
        JOptionPane.showMessageDialog(null, "Limpio!!");

    }//GEN-LAST:event_btLimpiarActionPerformed

    private void cbProducVendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProducVendidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProducVendidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btRegistrarVenta;
    private javax.swing.JButton btnConsultarVentas;
    private javax.swing.JComboBox<Cliente> cbCliente;
    private javax.swing.JComboBox<Producto> cbProducVendido;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdFechaVenta;
    private javax.swing.JTextField txtCantidadProd;
    private javax.swing.JTextField txtPrecioventaProd;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraTabla() {
        ArrayList<Object> fCabecera = new ArrayList<>();
        fCabecera.add("Fecha");
        fCabecera.add("Cliente");
        for (Object it : fCabecera) {
            model.addColumn(it);
        }
        jTable1.setModel(model);
    }

    private void consultarVentas() {
        //this.borrarFilasTabla();
        listaVenta = (List<Venta>) ventaData.consultarVentas();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        if (!listaVenta.isEmpty()) {
            for (Venta vt : listaVenta) {

                model.addRow(new Object[]{vt.getFecha(), vt.getIdCliente()});

            }
        }

    }

    private void cargarProductocb() {
        for (Producto item : listaProductos) {
            cbProducVendido.addItem(item);
        }
    }

    private void cargarClientecb() {
        for (Cliente item : listaClientes) {
            cbCliente.addItem(item);
        }
    }
}
