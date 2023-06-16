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
    private int idVenta;
    private int idProducto;

    public DetalleVenta() {
    }

    public DetalleVenta(int idDetalleVenta, int cantidad, double PrecioVenta, int idVenta, int idProducto) {
        this.idDetalleVenta = idDetalleVenta;
        this.cantidad = cantidad;
        this.PrecioVenta = PrecioVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
    }

    public DetalleVenta(int cantidad, double PrecioVenta, int idVenta, int idProducto) {
        this.cantidad = cantidad;
        this.PrecioVenta = PrecioVenta;
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
        return PrecioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.PrecioVenta = precioVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "DetalleVenta{"+" cantidad=" + cantidad + ", precioVenta=" + PrecioVenta + ", idVenta=" + idVenta + ", idProducto=" + idProducto + '}';
    }
    
    
    
}
