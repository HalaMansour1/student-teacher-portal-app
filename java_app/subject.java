
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halamansour
 */
public class subject {
    
    private int id;
    private String subjectn;
    private String subjectc;
    
    
      public subject(String subjectname, String subjectcode , int idnumber) {
        
        this.subjectc = subjectcode; 
        this.subjectn = subjectname;
        this.id = idnumber;
  
    }
      
      
      public String getSubjectname() 
   {
       return subjectn ; 
   }
    public String getSubjectcode() 
   {
       return subjectc ; 
   } 
   public int getSubjectid() {
       return id;
   }
   
   

    
    
}
