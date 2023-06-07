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

/**
 *
 * @author Ariana
 */
public class ProveedorData {
    Connection connection;

    public ProveedorData() {
        connection = Conexion.getConnection();
    }
    
    public void guardarProveedor(Proveedor proveedor){
    String sql = "INSERT INTO proveedor (razonSocial, domicilio, telefono) VALUES (?, ?, ?)";
    try{
        PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, proveedor.getRazonSocial());
        ps.setString(2, proveedor.getDomicilio());
        ps.setString(3, proveedor.getTelefono());
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            //Esto va en la vista, debe ir un cartelito que diga "si se creo el proveedor"
            proveedor.setIdProveedor(rs.getInt(1));
        }else{
            //Esto va en la vista, debe ir un cartelito de "no se creo el proveedor"
        }
        ps.close();
        
        
    }catch(SQLException ex){
      //En la vista va un cartelito que diga "no se puedo ejecutar la consulta"
    }
   
}
    
}
