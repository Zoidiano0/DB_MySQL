/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysql_app;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Santiago Estevez
 */
public class asign {
    
    public static void main (String[] args){
  
        DateFormat formato = new SimpleDateFormat("yyy/MM/DD HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            java.util.Date tt = new java.util.Date();
            String fecha = formato.format(tt);
            System.out.println(fecha);
       /* Connection_MySQL cnr = new Connection_MySQL();
        Connection cn = cnr.get_Connection();
        Statement st;
        Statement st2;
        ResultSet rs;
        ResultSet rs2;
        int cont =1;
        
         try {
            
             st = (com.mysql.jdbc.Statement) cn.createStatement();
            String s = "select Codigo from materias";
            rs = st.executeQuery(s);
             while(rs.next()){
                 if(cont>10){
                     cont=1;
                 }
            String t = "INSERT INTO docente_has_materias (Docente_Ci,Materias_Código) values (?,?);";
            
            PreparedStatement pst = cn.prepareStatement(t,com.mysql.jdbc.Statement.RETURN_GENERATED_KEYS);
           pst.setString(1, String.valueOf(cont));
           pst.setString(2,rs.getString(1));
          
           int ra = pst.executeUpdate();
            System.out.println(t);
            
            System.out.println(cont);
            
                 cont++;
             }
        } catch (Exception e) {
        }
        */
    }
}
