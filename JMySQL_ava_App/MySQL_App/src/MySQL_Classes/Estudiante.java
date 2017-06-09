/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL_Classes;

import java.util.ArrayList;

/**
 *
* @author Santiago Estevez
 */
public class Estudiante {

    public Estudiante() {
    }
    
    public String Cedula;
    public String Cod_Matr;
    ArrayList<String> materias = new ArrayList<String>();
    public String Nombre_1;
    public String nombre_2;
    public String Apellido_1;
    public String Apellido_2;
    public Boolean Status_M;

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCod_Matr() {
        return Cod_Matr;
    }

    public void setCod_Matr(String Cod_Matr) {
        this.Cod_Matr = Cod_Matr;
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }
    
    public String getMateriaAt(int x) {
        return materias.get(x);
    }

    public void setMaterias(String materias) {
        this.materias.add(materias);
    }

    public String getNombre_1() {
        return Nombre_1;
    }

    public void setNombre_1(String Nombre_1) {
        this.Nombre_1 = Nombre_1;
    }

    public String getNombre_2() {
        return nombre_2;
    }

    public void setNombre_2(String nombre_2) {
        this.nombre_2 = nombre_2;
    }

    public String getApellido_1() {
        return Apellido_1;
    }

    public void setApellido_1(String Apellido_1) {
        this.Apellido_1 = Apellido_1;
    }

    public String getApellido_2() {
        return Apellido_2;
    }

    public void setApellido_2(String Apellido_2) {
        this.Apellido_2 = Apellido_2;
    }

    public Boolean getStatus_M() {
        return Status_M;
    }

    public void setStatus_M(Boolean Status_M) {
        this.Status_M = Status_M;
    }

    
    
}
