
import Controller.ClienteData;
import Controller.CompraData;
import Controller.DetalleCompraData;
import Controller.DetalleVentaData;
import Controller.ProductoData;
import Controller.ProveedorData;
import Controller.VentaData;
import Entity.Cliente;
import Entity.Compra;
import Entity.DetalleCompra;
import Entity.DetalleVenta;
import Entity.Producto;
import Entity.Proveedor;
import Entity.Venta;
import java.sql.Date;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariana
 */
public class Main {
    public static ClienteData clienteData = new ClienteData();
    public static VentaData ventaData = new VentaData();
    public static DetalleVentaData detalleVentaData = new DetalleVentaData();
    public static ProductoData productoData = new ProductoData();
    public static ProveedorData proveedorData = new ProveedorData();
    public static CompraData compraData = new CompraData();
    public static DetalleCompraData detalleCompraData = new DetalleCompraData();
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        
        Cliente cliente = new Cliente("Chaves","Ariana","noseDondeVivo","123456789");
        clienteData.guardarCliente(cliente);
        System.out.println(clienteData.buscarCliente(1));
        
        Producto producto = new Producto("Shampoo", 50d, 1, true);
        productoData.guardarProducto(producto);
        Venta venta = new Venta(Date.valueOf(date), cliente);
        ventaData.guardarVenta(venta);
        //DetalleVenta detalleVenta = new DetalleVenta(1,50d,venta,producto);
    //    detalleVentaData.guardarDetalleVenta(detalleVenta);
        
        Proveedor proveedor = new Proveedor("razonSocial", "Lavalle 100", "12345678");
        proveedorData.guardarProveedor(proveedor);
        Compra compra = new Compra(proveedor, Date.valueOf(date));
        compraData.guardarCompra(compra);
        //DetalleCompra detalleCompra  DetalleCompra(2, 30d, compra, producto);
       // detalleCompraData.guardarDetall= neweCompra(detalleCompra);
        
        
    }
}
