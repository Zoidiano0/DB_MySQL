/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysql_app;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Santiago Estevez
 */
public class Connection_MySQL {
public Connection Mysql_Con;
    public Connection_MySQL() {
      
        
    }
    
    public Connection get_Connection(){
        try {
            Mysql_Con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ciercom_pre_matricula", "Zoidiano0", "Zoidiano0!");
        } catch (Exception e) {
        }
        return Mysql_Con;
    }
    
    
   

}
