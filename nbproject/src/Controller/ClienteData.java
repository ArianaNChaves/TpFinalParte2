/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariana
 */
public class ClienteData {

    private Connection connection;

    public ClienteData() {
        connection = Conexion.getConnection();
    }

    public void guardarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (apellido, nombre, domicilio, telefono) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                //Esto va en la vista, debe ir un cartelito que diga "si se creo el cliente"
                cliente.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente añadido con exito.");

            } else {
                //Esto va en la vista, debe ir un cartelito de "no se creo el cliente"
                JOptionPane.showMessageDialog(null, "El alumno no fue añadido.");

            }
            ps.close();

        } catch (SQLException ex) {
            //En la vista va un cartelito que diga "no se puedo ejecutar la consulta"
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente" + ex);

        }

    }

    public void modificarCliente(Cliente cliente) {

        String sql = "UPDATE cliente SET apellido = ?, nombre = ?, domicilio = ?, telefono = ? WHERE  idCliente = ?";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.setInt(5, cliente.getIdCliente());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se modifico el cliente");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no existe.");
            }

        } catch (SQLException ex) {
            // Cartelito de ERROR
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void eliminarCliente(int id) {

        try {
            String sql = "DELETE FROM cliente WHERE idCliente = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Cliente borrado exitosamente.");

            } else {
                JOptionPane.showMessageDialog(null, "Cliente inexistente.");
            }
            ps.close();
        } catch (SQLException e) {
            // Cartelito de ERROR
        }
    }

    public Cliente buscarCliente(int id) {
        Cliente cliente = new Cliente();
        String sql = "SELECT * FROM cliente WHERE idCliente = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente.setIdCliente(id);
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getString("telefono"));

            } else {
                //en vistas, cartelito que diga "no se pudo buscar el cliente" o "no existe el cliente"
                JOptionPane.showMessageDialog(null, "Cliente no existente.");

            }
            ps.close();

        } catch (SQLException ex) {
            //cartelito "error en buscar cliente"
        }
        return cliente;
    }

    public List<Cliente> mandarCliente() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT apellido, nombre, idCliente FROM cliente;";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setIdCliente(rs.getInt("idCliente"));
                clientes.add(cliente);
            }

            ps.close();

        } catch (SQLException ex) {
        }
        return clientes;

    }

}
