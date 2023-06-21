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
    private double PrecioVenta;
    private Venta venta;
    private Producto producto;

    public DetalleVenta() {
    }

    public DetalleVenta(int idDetalleVenta, int cantidad, double PrecioVenta, Venta idVenta, Producto idProducto) {
        this.idDetalleVenta = idDetalleVenta;
        this.cantidad = cantidad;
        this.PrecioVenta = PrecioVenta;
        this.venta = idVenta;
        this.producto = idProducto;
    }

    public DetalleVenta(int cantidad, double PrecioVenta, Venta idVenta, Producto idProducto) {
        this.cantidad = cantidad;
        this.PrecioVenta = PrecioVenta;
        this.venta = idVenta;
        this.producto = idProducto;
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
        return PrecioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.PrecioVenta = precioVenta;
    }

    public Venta getIdVenta() {
        return venta;
    }

    public void setIdVenta(Venta idVenta) {
        this.venta = idVenta;
    }

    public Producto getIdProducto() {
        return producto;
    }

    public void setIdProducto(Producto idProducto) {
        this.producto = idProducto;
    }

    @Override
    public String toString() {
        return "DetalleVenta{"+" cantidad=" + cantidad + ", precioVenta=" + PrecioVenta + ", idVenta=" + venta.getIdVenta() + ", idProducto=" + producto.getDescripcion() + '}';
    }
    
    
    
}
