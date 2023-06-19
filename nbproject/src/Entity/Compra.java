/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author Ariana
 */
public class Compra {
    private int idCompra;
    private Proveedor idProveedor;
    private Date fecha;

    public Compra() {
    }

    public Compra(int idCompra, Proveedor idProveedor, Date fecha) {
        this.idCompra = idCompra;
        this.idProveedor = idProveedor;
        this.fecha = fecha;
    }

    public Compra(Proveedor idProveedor, Date fecha) {
        this.idProveedor = idProveedor;
        this.fecha = fecha;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return idProveedor + ", fecha=" + fecha ;
    }
    
    
    
}
