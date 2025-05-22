/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author user
 */
public class Cliente {
    private int dni_c;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String direccio;
    private String fecha_nacimiento;
    private int dni_e; 
    private int id_membresia;



    public Cliente() {
        this.dni_c = 0;
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.email = "";
        this.direccio = "";
        this.fecha_nacimiento ="";
        this.dni_e = 0;
        this.id_membresia = 0;
    }

    public int getDni_c() {
        return dni_c;
    }

    public void setDni_c(int dni_c) {
        this.dni_c = dni_c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getDni_e() {
        return dni_e;
    }

    public void setDni_e(int dni_e) {
        this.dni_e = dni_e;
    }
       public int getId_membresia() {
        return id_membresia;
    }

    public void setId_membresia(int id_membresia) {
        this.id_membresia = id_membresia;
    }

}

   
