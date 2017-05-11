/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.sql.*;
import java.sql.PreparedStatement;
import database.DBconnect;

public class guide_availability {
    
    
     Connection conn = null;
    PreparedStatement pst = null; 
    ResultSet RT=null;
    /**
     *
     * @param start_date
     * @param end_date
     * @return
     */
    public void check_availability(String start_date,String end_date)
        {
        try{
            
            
            conn = DBconnect.connect();
            
        String st_date = start_date;
        String e_date = end_date;
        
          String j="select guide_name \n" +
"	from guide g,tour t\n" +
"	where guide_name not in(select guide_name \n" +
"				from guide g,tour t\n" +
"				where g.guide_employee_id=t.guide_employee_id and t.start_date=st_date and\n" +
"	t.end_date= e_date)";
        
           pst = conn.prepareStatement(j);
           
           
            RT =pst.executeQuery(j);
          
          
        }
        
        catch (Exception e){
        
        
        
        
        
        }
        
        
        }
    
}
