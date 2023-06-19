/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Compra;
import Entity.Producto;
import Entity.Proveedor;
import Entity.Venta;
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
public class CompraData {

    private Connection connection;
    private ProveedorData proveedorData;
    //private ProveedorData proveedorData;
    public CompraData() {
        connection = Conexion.getConnection();
       // proveedorData= new ProveedorData();
    }

    public Compra guardarCompra(Compra compra) {
        String sql = "INSERT INTO compra (fecha, idProveedor) VALUES (?, ?);";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, compra.getFecha());
            ps.setInt(2, compra.getIdProveedor().getIdProveedor());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                //Esto va en la vista, debe ir un cartelito que diga "si se creo la compra"
                compra.setIdCompra(rs.getInt(1));
            } else {
                //Esto va en la vista, debe ir un cartelito de "no se creo la compra"
            }
            ps.close();

        } catch (SQLException ex) {
            //En la vista va un cartelito que diga "no se puedo ejecutar la consulta"
            JOptionPane.showMessageDialog(null, ex);
        }
        return compra;
    }
    public Compra buscarCompra(int id) {
        Compra compra = new Compra();
        String sql = "SELECT * FROM compra WHERE idCompra = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setIdProveedor(proveedorData.buscarProveedorPorId(rs.getInt("idProveedor")));
                compra.setFecha(rs.getDate("fecha"));
                

            } else {
                //en vistas, cartelito que diga "no se pudo buscar el producto" o "no existe el producto"
            }
            ps.close();

        } catch (SQLException ex) {
            //cartelito "error en buscar producto"
        }
        return compra;
    }

}
