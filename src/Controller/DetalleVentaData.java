/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.DetalleVenta;
import Entity.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ariana
 */
public class DetalleVentaData {
    private Connection connection;

    public DetalleVentaData() {
        connection = Conexion.getConnection();
    }
    
    public void guardarDetalleVenta(DetalleVenta detalleVenta){
    String sql = "INSERT INTO detalleVenta (cantidad, precioVenta, idVenta, idProducto) VALUES (?, ?, ?, ?)";
    try{
        PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, detalleVenta.getCantidad());
        ps.setDouble(2, detalleVenta.getPrecioVenta());
        ps.setInt(3, detalleVenta.getIdVenta().getIdVenta());
        ps.setInt(4, detalleVenta.getIdProducto().getIdProducto());
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            //Esto va en la vista, debe ir un cartelito que diga "si se creo la detalleventa"
            detalleVenta.setIdDetalleVenta(rs.getInt(1));
        }else{
            //Esto va en la vista, debe ir un cartelito de "no se creo la detalleventa"
        }
        ps.close();
        
        
    }catch(SQLException ex){
      //En la vista va un cartelito que diga "no se puedo ejecutar la consulta"
    }
   
}
    
    
}
