/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Cliente;
import Entity.Proveedor;
import java.sql.Connection;
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
public class ProveedorData {

    Connection connection;

    public ProveedorData() {
        connection = Conexion.getConnection();
    }

    public void guardarProveedor(Proveedor proveedor) {
        String sql = "INSERT INTO proveedor (razonSocial, domicilio, telefono) VALUES (?, ?, ?);";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                //Esto va en la vista, debe ir un cartelito que diga "si se creo el proveedor"
                proveedor.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agrego con exito el proveedor.");
            } else {
                //Esto va en la vista, debe ir un cartelito de "no se creo el proveedor"
                JOptionPane.showMessageDialog(null, "No se agrego al proveedor.");
            }
            ps.close();

        } catch (SQLException ex) {
            //En la vista va un cartelito que diga "no se puedo ejecutar la consulta"
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void modificarProveedor(Proveedor proveedor) {
        String sql = "UPDATE proveedor SET razonSocial=?,domicilio=?,telefono=? WHERE razonSocial = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setString(4, proveedor.getRazonSocial());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se modifico el Proveedor");
            } else {
                JOptionPane.showMessageDialog(null, "Proveedor no existe.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public Proveedor buscarProveedor(String razonSocial) {
        Proveedor provedor = new Proveedor();
        String sql = "SELECT * FROM proveedor WHERE razonSocial = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, razonSocial);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                provedor.setRazonSocial(rs.getString("razonSocial"));
                provedor.setDomicilio(rs.getString("domicilio"));
                provedor.setTelefono(rs.getString("telefono"));
            } else {

                JOptionPane.showMessageDialog(null, "Proveedor no existente.");

            }
            ps.close();
        } catch (SQLException ex) {

        }
        return provedor;
    }
    public Proveedor buscarProveedorPorId(int id) {
        Proveedor proveedor = new Proveedor();
        String sql = "SELECT * FROM proveedor WHERE idProveedor = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setIdProveedor(id);
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
            } else {

                JOptionPane.showMessageDialog(null, "Proveedor no existente.");

            }
            ps.close();
        } catch (SQLException ex) {

        }
        return proveedor;
    }
    
        public List<Proveedor> mandarProveedor() {
        List<Proveedor> proveedores = new ArrayList<>();
        String sql = "SELECT idProveedor, razonSocial, telefono FROM proveedor;";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedores.add(proveedor);
            }
        } catch (SQLException ex) {

        }
        return proveedores;
    }
    
}
