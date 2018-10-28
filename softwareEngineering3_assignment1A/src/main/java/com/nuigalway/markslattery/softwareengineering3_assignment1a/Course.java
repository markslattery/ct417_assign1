package com.nuigalway.markslattery.softwareengineering3_assignment1a;

import org.joda.time.DateTime;

public class Course {
    
    String name;
    DateTime startDate;
    DateTime endDate;
    Module[] modules = new Module[10];
    Student[] students = new Student[100];
    
    public Course(String n, DateTime sd, DateTime ed){
        this.name = n;
        this.startDate = sd;
        this.endDate = ed;
    }
    
    public Course(String n, DateTime sd, DateTime ed, Module[] m){
        this.name = n;
        this.startDate = sd;
        this.endDate = ed;
        this.modules = m;
    }
    
    public Course(String n, DateTime sd, DateTime ed, Module[] m, Student[] s){
        this.name = n;
        this.startDate = sd;
        this.endDate = ed;
        this.modules = m;
        this.students = s;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setStartDate(DateTime newSD){
        this.startDate = newSD;
    }
    
    public DateTime getStartDate(){
        return this.startDate;
    }
    
    public void setEndDate(DateTime newED){
        this.endDate = newED;
    }
    
    public DateTime getEndDate(){
        return this.endDate;
    }
    
    public void addModule(Module m){
        for(int i = 0; i < this.modules.length; i++){
            if (this.modules[i] == null){
                this.modules[i] = m;
                i = this.modules.length;
            }
        }
    }
    
    public Module[] getModuleList(){
        return this.modules;
    }
    
    public void addStudent(Student s){
        for(int j = 0; j < this.students.length; j++){
            if (this.students[j] == null){
                this.students[j] = s;
                j = this.students.length;
            }
        }
    }
    
    public Student[] getStudentList(){
        return this.students;
    }
    
}
