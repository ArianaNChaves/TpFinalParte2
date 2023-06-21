/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Producto;
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
public class ProductoData {

    private Connection connection;

    public ProductoData() {
        connection = Conexion.getConnection();
    }

    public void guardarProducto(Producto producto) {
        String sql = "INSERT INTO producto (descripcion, precioActual, stock, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getDescripcion());
            ps.setDouble(2, producto.getPrecioActual());
            ps.setInt(3, producto.getStock());
            ps.setBoolean(4, producto.getEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto agregado");
            } else {
                JOptionPane.showMessageDialog(null, "El producto NO fue agregado");
            }
            ps.close();

        } catch (SQLException ex) {
            //En la vista va un cartelito que diga "no se puedo ejecutar la consulta"
        }
    }

    public List<Producto> consultarInventario() {

        List<Producto> productos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM producto WHERE estado = 1";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                producto.setDescripcion(rs.getString("descripcion"));

                productos.add(producto);
            }
            ps.close();

        } catch (SQLException ex) {
            // mensajito de error en vista
        }
        return productos;
    }

    public Producto buscarProducto(int id) {
        Producto producto = new Producto();
        String sql = "SELECT * FROM producto WHERE idProducto = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                producto.setDescripcion(rs.getString("descripcion"));

            } else {
                //en vistas, cartelito que diga "no se pudo buscar el producto" o "no existe el producto"
            }
            ps.close();

        } catch (SQLException ex) {
            //cartelito "error en buscar producto"
        }
        return producto;
    }

    public List<Producto> mandarProducto() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT idProducto, stock, descripcion FROM producto;";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setStock(rs.getInt("stock"));
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                productos.add(producto);
            }

            ps.close();

        } catch (SQLException ex) {
        }
        return productos;

    }

    public void actualizarProducto(Producto producto) {
        try {

            String sql = "UPDATE producto SET stock = ? WHERE idProducto = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, producto.getStock());
            ps.setInt(2, producto.getIdProducto());

            ps.executeUpdate();


            ps.close();
        } catch (SQLException e) {

        }
    }

    public double obtenerPrecioProducto(int idProducto) {
        double precio = 0.0;
        try {
            String query = "SELECT precioActual FROM producto WHERE idProducto = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, idProducto);

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                precio = resultSet.getDouble("precioActual");
            }

            resultSet.close();
            ps.close();
        } catch (SQLException e) {

        }
        return precio;
    }

}
