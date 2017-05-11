/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;


import java.sql.*;
import java.sql.PreparedStatement;
import database.DBconnect;
/**
 *
 * @author hp
 */
public class guide {
    
    Connection conn = null;
    PreparedStatement pst = null; 
    int licende_id;
   
            
        public void Add_guide(           
        int g_licende_id ,
	String g_password ,
	double g_salary,
	String g_name,
	String g_email,
	String g_date_of_birth ,
	String g_access_level)
        
        
        {
            
                     
        //int employee_id=g_id;
	int licende_id=g_licende_id ;
	String password=g_password ;
	double sal=g_salary;
	String name=g_name;
	String email=g_email ;
	String date_of_birth= g_date_of_birth;
	String acc=g_access_level;
        
        
        System.out.print(licende_id);
        
             
        
        try
        {
            
            conn = DBconnect.connect();
            
        String q = "insert into guide(guide_licende_id,guide_password ,salary, guide_name,guide_email,guide_date_of_birth, access_level)values('"+licende_id +"','"+password+"','"+sal+"','"+name+"','"+email+"','"+date_of_birth+"','"+acc+"')";
        pst = conn.prepareStatement(q);
        
        
        pst.execute();
        
        System.out.print(licende_id);
        
        
        
        
        
        
        }
        
        catch(Exception e){
        
        
        
        
        }
         
         
        }

  
       

    
    }
        
 
    

