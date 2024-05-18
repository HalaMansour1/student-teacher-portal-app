
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halamansour
 */
public class student_answers {
    
    
        
    private String teachn;
    private String subj;
    private String studentn;
    private String ans;
    private int percentage;
    private String comment;
    
      public student_answers(String teacher_name, String subject, String studentname , String answer) {
        
         
        this.teachn = teacher_name; 
        this.subj = subject;
        this.studentn = studentname;
        this.ans = answer;
        this.comment = comment;
        this.percentage = percentage; 
       
    }
      
      
      public String getTeacher_name() 
   {
       return teachn ; 
   }
    public String getsubjectname() 
   {
       return subj ; 
   } 
   public String getstudentname() {
       return studentn ;
   }
    
     public String getAnswer() {
       return ans;
   }
     
      public String getComment() {
       return comment;
   }
      
        public int getPercentage() {
       return percentage;
   }

}
