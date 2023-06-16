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
    private int idCompra;
    private int idProducto;

    public DetalleCompra() {
    }

    public DetalleCompra(int idDetalle, int cantidad, double precioCosto, int idCompra, int idProducto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
    }

    public DetalleCompra(int cantidad, double precioCosto, int idCompra, int idProducto) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
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

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return cantidad + ", idProducto=" + idProducto;
    }
    
    
    
}
