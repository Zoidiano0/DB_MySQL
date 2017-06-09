/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL_Classes;

/**
 *
* @author Santiago Estevez
 */
public class Materia {
    
    public String Codigo;
    public String Nombre;
    public int N_Mat;
    public int Nivel_Mat;
    public String Est_Cedula;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getN_Mat() {
        return N_Mat;
    }

    public void setN_Mat(int N_Mat) {
        this.N_Mat = N_Mat;
    }

    public int getNivel_Mat() {
        return Nivel_Mat;
    }

    public void setNivel_Mat(int Nivel_Mat) {
        this.Nivel_Mat = Nivel_Mat;
    }

    public String getEst_Cedula() {
        return Est_Cedula;
    }

    public void setEst_Cedula(String Est_Cedula) {
        this.Est_Cedula = Est_Cedula;
    }
    
    
    
}
