/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


public class VentaV {
    private int id_venta;
    private String fecha_de_compra;
    private Double monto;
    private Double precio_final;
    private int dni_c;
    private int id_metodo;
    private int id_membresia;
    private String fecha_pago;

    public VentaV() {
        this.id_venta = 0;
        this.fecha_de_compra = "";
        this.monto = 0.0;
        this.precio_final = 0.0;
        this.dni_c = 0;
        this.id_metodo = 0;
        this.id_membresia = 0;
        this.fecha_pago = "";
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getFecha_de_compra() {
        return fecha_de_compra;
    }

    public void setFecha_de_compra(String fecha_de_compra) {
        this.fecha_de_compra = fecha_de_compra;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(Double precio_final) {
        this.precio_final = precio_final;
    }

    public int getDni_c() {
        return dni_c;
    }

    public void setDni_c(int dni_c) {
        this.dni_c = dni_c;
    }

    public int getId_metodo() {
        return id_metodo;
    }

    public void setId_metodo(int id_metodo) {
        this.id_metodo = id_metodo;
    }

    public int getId_membresia() {
        return id_membresia;
    }

    public void setId_membresia(int id_membresia) {
        this.id_membresia = id_membresia;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }
    
}
