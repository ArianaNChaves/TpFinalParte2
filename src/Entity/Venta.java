/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author Ariana
 */
public class Venta {

    private int idVenta;
    private Date fecha;
    private Cliente idCliente;

    public Venta() {
    }

    public Venta(int idVenta, Date fecha, Cliente idCliente) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.idCliente = idCliente;
    }

    public Venta(Date fecha, Cliente idCliente) {
        this.fecha = fecha;
        this.idCliente = idCliente;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

}
