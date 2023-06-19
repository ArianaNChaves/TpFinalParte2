/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.DetalleCompra;
import Entity.DetalleVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariana
 */
public class DetalleCompraData {
    private Connection connection;

    public DetalleCompraData() {
        connection = Conexion.getConnection();
    }
    
    public void guardarDetalleCompra(DetalleCompra detalleCompra){
    String sql = "INSERT INTO detalleCompra (cantidad, precioCosto, idCompra, idProducto) VALUES (?, ?, ?, ?);";
    try{
        PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, detalleCompra.getCantidad());
        ps.setDouble(2, detalleCompra.getPrecioCosto());
        ps.setInt(3, detalleCompra.getIdCompra().getIdCompra());
        ps.setInt(4, detalleCompra.getIdProducto().getIdProducto());
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            //Esto va en la vista, debe ir un cartelito que diga "si se creo la detallecompra"
            detalleCompra.setIdDetalle(rs.getInt(1));
        }else{
            //Esto va en la vista, debe ir un cartelito de "no se creo la detallecompra"
        }
        ps.close();
        
        
    }catch(SQLException ex){
      //En la vista va un cartelito que diga "no se puedo ejecutar la consulta"
                 JOptionPane.showMessageDialog(null, ex);
    }
   
}
    
    
    
}
