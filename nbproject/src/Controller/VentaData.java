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
import java.sql.Date;
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
public class VentaData {
    private Connection connection;
    private ClienteData clienteData;

    public VentaData() {
        connection = Conexion.getConnection();
        clienteData = new ClienteData();
    }
    
    public void guardarVenta(Venta venta){
    String sql = "INSERT INTO venta (fecha, idCliente) VALUES (?,?);";
    try{
        PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setDate(1, venta.getFecha());
        ps.setInt(2, venta.getIdCliente().getIdCliente());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            //Esto va en la vista, debe ir un cartelito que diga "si se creo la venta"
            venta.setIdVenta(rs.getInt(1));
        }else{
            //Esto va en la vista, debe ir un cartelito de "no se creo la venta"
        }
        ps.close();
        
        
    }catch(SQLException ex){
      //En la vista va un cartelito que diga "no se puedo ejecutar la consulta"
    }
   
}
    public List<Venta> consultarVentas() {

        List<Venta> ventas = new ArrayList<>();
        try {
            String sql = "SELECT fecha, idCliente FROM venta WHERE 1;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Venta venta = new Venta();

                venta.setFecha(rs.getDate("fecha"));
                venta.setIdCliente(clienteData.buscarCliente(rs.getInt("idCliente")));
                ventas.add(venta);
            }
            ps.close();

        } catch (SQLException ex) {
            // mensajito de error en vista
        }
        return ventas;
    }
    public Venta buscarVenta(int id){
        Venta venta = new Venta();
        String sql = "SELECT * FROM venta WHERE idVenta = ?";
        PreparedStatement ps = null;
        try{
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                venta.setFecha(rs.getDate("fecha"));
                venta.setIdCliente(clienteData.buscarCliente(rs.getInt("idCliente")));
                
                
            }else{
                //en vistas, cartelito que diga "no se pudo buscar la venta" o "no existe la venta"
            }
            ps.close();
            
        }catch(SQLException ex){
            //cartelito "error en buscar venta"
        }
        return venta ;
    }
}
