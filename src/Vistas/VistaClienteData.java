
package Vistas;

import Controller.ClienteData;
import Controller.Conexion;
import Entity.Cliente;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class VistaClienteData extends javax.swing.JInternalFrame {

    ClienteData clienteData;
    private Connection conexion;

    public VistaClienteData() {
        initComponents();
        conexion = Conexion.getConnection();

        clienteData = new ClienteData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        btAgregarCliente = new javax.swing.JButton();
        btModificarCliente = new javax.swing.JButton();
        btBorrarCliente = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        btBuscarCliente = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel1.setText("CLIENTES");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Direccion:");

        jLabel4.setText("Telefono:");

        txtDireccCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccClienteActionPerformed(evt);
            }
        });

        btAgregarCliente.setText("AGREGAR");
        btAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarClienteActionPerformed(evt);
            }
        });

        btModificarCliente.setText("MODIFICAR");
        btModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarClienteActionPerformed(evt);
            }
        });

        btBorrarCliente.setText("BORRAR");
        btBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarClienteActionPerformed(evt);
            }
        });

        btLimpiar.setText("LIMPIAR");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido:");

        jLabel7.setText("idCliente:");

        btBuscarCliente.setText("BUSCAR");
        btBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(103, 103, 103)
                .addComponent(jLabel6)
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btAgregarCliente)
                .addGap(27, 27, 27)
                .addComponent(btModificarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btBorrarCliente)
                .addGap(30, 30, 30)
                .addComponent(btLimpiar)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2)))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtDireccCliente)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(txtApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btBuscarCliente)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarCliente))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgregarCliente)
                    .addComponent(btModificarCliente)
                    .addComponent(btBorrarCliente)
                    .addComponent(btLimpiar))
                .addGap(0, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccClienteActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccCliente.setText("");
        txtTelefonoCliente.setText("");
        txtIdCliente.setText("");
        JOptionPane.showMessageDialog(null, "Limpio!!");

    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarClienteActionPerformed
        // TODO add your handling code here:
        String ape = txtApellido.getText();
        String nom = txtNombre.getText();
        String domicilio = txtDireccCliente.getText();
        String telefono = txtTelefonoCliente.getText() + "";

        if (ape.matches("[a-zA-Z\\s]+") && nom.matches("[a-zA-Z\\s]+") && domicilio.matches("[a-zA-Z\\s\\d]+") && telefono.matches("\\d+")) {
            Cliente cliente = new Cliente(ape, nom, domicilio, telefono);
            clienteData.guardarCliente(cliente);
            txtIdCliente.setText(cliente.getIdCliente() + "");
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese valores válidos para los campos de apellido, nombre, domicilio y teléfono.");
        }

    }//GEN-LAST:event_btAgregarClienteActionPerformed

    private void btModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarClienteActionPerformed
        // TODO add your handling code here:
        if (txtIdCliente.getText() != null) {
            String idText = txtIdCliente.getText();
            String nom = txtNombre.getText();
            String ape = txtApellido.getText();
            String dom = txtDireccCliente.getText();
            String tel = txtTelefonoCliente.getText() + "";

            if (idText.matches("\\d+")) {
                int id = Integer.parseInt(idText);

                if (nom.matches("[a-zA-Z\\s]+") && ape.matches("[a-zA-Z\\s]+") && dom.matches("[a-zA-Z\\s\\d]+") && tel.matches("\\d+")) {
                    Cliente cliente = new Cliente(id, ape, nom, dom, tel);
                    clienteData.modificarCliente(cliente);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese valores válidos para los campos de nombre, apellido, dirección y teléfono.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido para el ID del cliente.");
            }
        }

    }//GEN-LAST:event_btModificarClienteActionPerformed

    private void btBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarClienteActionPerformed
        int id = Integer.parseInt(txtIdCliente.getText());
        clienteData.eliminarCliente(id);
    }//GEN-LAST:event_btBorrarClienteActionPerformed

    private void btBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarClienteActionPerformed
        String idText = txtIdCliente.getText();

        if (idText.matches("\\d+")) {
            int id = Integer.parseInt(idText);
            Cliente cliente = clienteData.buscarCliente(id);

            if (cliente != null) {
                txtIdCliente.setText(idText);
                txtNombre.setText(cliente.getNombre());
                txtApellido.setText(cliente.getApellido());
                txtDireccCliente.setText(cliente.getDomicilio());
                txtTelefonoCliente.setText(cliente.getTelefono());
            } else {
                JOptionPane.showMessageDialog(null, "El cliente no existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido para el ID del cliente.");
        }

    }//GEN-LAST:event_btBuscarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarCliente;
    private javax.swing.JButton btBorrarCliente;
    private javax.swing.JButton btBuscarCliente;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btModificarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
