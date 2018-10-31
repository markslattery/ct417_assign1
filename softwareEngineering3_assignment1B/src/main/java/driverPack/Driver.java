/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverPack;
import org.joda.time.DateTime;
import com.nuigalway.markslattery.softwareengineering3_assignment1a.*;

/**
 *
 * @author Owner
 */
public class Driver {
    
    public static void main(){
        
        DateTime startDate = new DateTime();
        startDate = startDate.withDate(5, 9, 2018);
        DateTime endDate = new DateTime();
        endDate = endDate.withDate(20, 5, 2019);
        
        DateTime now = new DateTime();
        Student aidan = new Student("Aidan","101","18",now);
        Student brian = new Student("Brian","102","18",now);        
        Student conor = new Student("Conor","103","18",now);       
        Student damien = new Student("Damien","104","18",now);      
        Student ethan = new Student("Ethan","105","18",now);
        
        Module ct417 = new Module("Software Engineering", "CT417");
        Module ee451 = new Module("System on Chip", "CT451");
        
        Course 4thEng = new Course("4th year Elect Eng", startDate, EndDate);
        
        4thEng.addModule(ct417);
    }
    
}
