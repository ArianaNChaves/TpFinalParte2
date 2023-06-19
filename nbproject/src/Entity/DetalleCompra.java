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
public class DetalleCompra {
    private int idDetalle;
    private int cantidad;
    private double precioCosto;
    private Compra compra;
    private Producto producto;

    public DetalleCompra() {
    }

    public DetalleCompra(int idDetalle, int cantidad, double precioCosto, Compra idCompra, Producto idProducto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = idCompra;
        this.producto = idProducto;
    }

    public DetalleCompra(int cantidad, double precioCosto, Compra idCompra, Producto idProducto) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = idCompra;
        this.producto = idProducto;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Compra getIdCompra() {
        return compra;
    }

    public void setIdCompra(Compra idCompra) {
        this.compra = idCompra;
    }

    public Producto getIdProducto() {
        return producto;
    }

    public void setIdProducto(Producto idProducto) {
        this.producto = idProducto;
    }

    @Override
    public String toString() {
        return cantidad + ", idProducto=" + producto.getDescripcion();
    }
    
    
    
}
