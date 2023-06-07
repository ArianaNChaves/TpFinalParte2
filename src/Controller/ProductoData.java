/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Cliente;
import Entity.Producto;
import Entity.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariana
 */
public class ProductoData {
    private Connection connection;

    public ProductoData() {
        connection = Conexion.getConnection();
    }
    public void guardarProducto(Producto producto){
    String sql = "INSERT INTO producto (descripcion, precioActual, stock, estado) VALUES (?, ?, ?, ?)";
    try{
        PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, producto.getDescripcion());
        ps.setDouble(2, producto.getPrecioActual());
        ps.setInt(3, producto.getStock());
        ps.setInt(4, producto.getEstado());
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            //Esto va en la vista, debe ir un cartelito que diga "si se creo el producto"
            producto.setIdProducto(rs.getInt(1));
        }else{
            //Esto va en la vista, debe ir un cartelito de "no se creo el producto"
        }
        ps.close();
        
        
    }catch(SQLException ex){
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
                producto.setEstado(rs.getInt("estado"));
                productos.add(producto);
            }
            ps.close();

        } catch (SQLException ex) {
            // mensajito de error en vista
        }
        return productos;
    }
    public Producto buscarProducto(int id){
        Producto producto = new Producto();
        String sql = "SELECT * FROM producto WHERE idProducto = ?";
        PreparedStatement ps = null;
        try{
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getInt("estado"));
                
                
            }else{
                //en vistas, cartelito que diga "no se pudo buscar el producto" o "no existe el producto"
            }
            ps.close();
            
        }catch(SQLException ex){
            //cartelito "error en buscar producto"
        }
        return producto ;
    }
    
}
