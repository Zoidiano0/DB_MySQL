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
public class Matricula {

    public String getCodigo_Mat() {
        return Codigo_Mat;
    }

    public void setCodigo_Mat(String Codigo_Mat) {
        this.Codigo_Mat = Codigo_Mat;
    }

    public String getPeriodo_Ac() {
        return Periodo_Ac;
    }

    public void setPeriodo_Ac(String Periodo_Ac) {
        this.Periodo_Ac = Periodo_Ac;
    }

    public String getEst_Mat_ID() {
        return Est_Mat_ID;
    }

    public void setEst_Mat_ID(String Est_Mat_ID) {
        this.Est_Mat_ID = Est_Mat_ID;
    }
    
    public String Codigo_Mat;
    public String Periodo_Ac;
    public String Est_Mat_ID;
    
}
