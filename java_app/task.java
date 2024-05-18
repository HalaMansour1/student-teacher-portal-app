
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


// this part of the code declares the variables and includes the constructor for the tasks 
public class task {
    private int taskid ;
    private String tasktitle;
    private String task ;
    private String tasksubj;
    private String teacher ; 
    private byte[] taskpicture ;
    
    public task(String taskt, String task, int tid , String task_subject , String teacher , byte[] taskpic ) {
        this.tasktitle = taskt;
        this.task = task ;
        this.taskid = tid;
        this.tasksubj = task_subject ;
        this.teacher = teacher ; 
        this.taskpicture = taskpic ;
    }
    public String getTasktitle() 
   {
       return tasktitle ; 
   }
    public String getTask() 
   {
       return task ; 
   }
    public int getTaskid() {
       return taskid;
   }
    public String getTask_subject() {
       return tasksubj ;
   }
    public String getTeacher() {
       return teacher ;
    }
     public byte[] getTaskpic() {
       return taskpicture;
   }
}
