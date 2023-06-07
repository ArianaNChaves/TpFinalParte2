/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Ariana
 */
public class DetalleVenta {
    private int idDetalleVenta;
    private int cantidad;
    private double precioVenta;
    private Venta idVenta;
    private Producto idProducto;

    public DetalleVenta() {
    }

    public DetalleVenta(int idDetalleVenta, int cantidad, double precioVenta, Venta idVenta, Producto idProducto) {
        this.idDetalleVenta = idDetalleVenta;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
    }

    public DetalleVenta(int cantidad, double precioVenta, Venta idVenta, Producto idProducto) {
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Venta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }
    
    
    
}
