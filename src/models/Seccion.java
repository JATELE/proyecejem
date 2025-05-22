/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class Seccion {
    
    private int cod_Seccion;
    private String fecha;
    private String duracion;
    private int dni_E;
    private int dni_C;

    public Seccion() {
        this.cod_Seccion = 0;
        this.fecha = "";
        this.duracion = "";
        this.dni_E = 0;
        this.dni_C = 0;
    }

    public int getCod_Seccion() {
        return cod_Seccion;
    }

    public void setCod_Seccion(int cod_Seccion) {
        this.cod_Seccion = cod_Seccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getDni_E() {
        return dni_E;
    }

    public void setDni_E(int dni_E) {
        this.dni_E = dni_E;
    }

    public int getDni_C() {
        return dni_C;
    }

    public void setDni_C(int dni_C) {
        this.dni_C = dni_C;
    }
    
}
