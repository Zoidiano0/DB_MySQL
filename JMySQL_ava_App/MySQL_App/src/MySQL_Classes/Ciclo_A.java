/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL_Classes;

import java.sql.Date;

/**
 *
* @author Santiago Estevez
 */
public class Ciclo_A {
    
    
    public String Codigo_Ciclo;
    public String Nombre;
    public Date Init;
    public Date End;
    public String Modalidad;

    public String getCodigo_Ciclo() {
        return Codigo_Ciclo;
    }

    public void setCodigo_Ciclo(String Codigo_Ciclo) {
        this.Codigo_Ciclo = Codigo_Ciclo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getInit() {
        return Init;
    }

    public void setInit(Date Init) {
        this.Init = Init;
    }

    public Date getEnd() {
        return End;
    }

    public void setEnd(Date End) {
        this.End = End;
    }

    public String getModalidad() {
        return Modalidad;
    }

    public void setModalidad(String Modalidad) {
        this.Modalidad = Modalidad;
    }
    
    
    
}
