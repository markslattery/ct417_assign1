/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.DateTime;

/**
 *
 * @author Owner
 */
public class Reg_JUnit {
    
    @Test
    public void studentNameTest1(){
        DateTime aidanDOB = new DateTime();
        Student aidan = new Student("Aidan","101","18", aidanDOB);
        
        assertEquals("Aidan",aidan.getName());
    }
    
    @Test
    public void studentUsernameTest1(){
        DateTime brianDOB = new DateTime();
        Student brian = new Student("Brian","102","35", brianDOB);
        
        assertEquals("Brian35",brian.getUsername());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
