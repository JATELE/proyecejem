/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


public class BoletaM {
    
       int id_boleta;
   String fecha_inicio;
  String  fecha_final; 
  int  id_membresia;
   int dni_c;

    public BoletaM() {
        this.id_boleta = 0;
        this.fecha_inicio = "";
        this.fecha_final = "";
        this.id_membresia = 0;
        this.dni_c = 0;
    }

    public int getId_boleta() {
        return id_boleta;
    }

    public void setId_boleta(int id_boleta) {
        this.id_boleta = id_boleta;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public int getId_membresia() {
        return id_membresia;
    }

    public void setId_membresia(int id_membresia) {
        this.id_membresia = id_membresia;
    }

    public int getDni_c() {
        return dni_c;
    }

    public void setDni_c(int dni_c) {
        this.dni_c = dni_c;
    }
    
}
