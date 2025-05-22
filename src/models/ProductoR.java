/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class ProductoR {
    private int codigo_producto;
    private String descripcion;
    private double precio;
    private int numero_de_existencia;
    private int  stock_minimo;
    private int id_categoria;
    private String ruc;

    public ProductoR() {
        this.codigo_producto = 0;
        this.descripcion = "";
        this.precio = 0.0;
        this.numero_de_existencia = 0;
        this.stock_minimo = 0;
        this.id_categoria = 0;
        this.ruc = "";
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumero_de_existencia() {
        return numero_de_existencia;
    }

    public void setNumero_de_existencia(int numero_de_existencia) {
        this.numero_de_existencia = numero_de_existencia;
    }

    public int getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(int stock_minimo) {
        this.stock_minimo = stock_minimo;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    
    
    
    
}
