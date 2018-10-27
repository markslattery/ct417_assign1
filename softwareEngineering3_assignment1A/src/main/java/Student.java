import org.joda.time.DateTime;

public class Student {
    
    String name;    
    String ID;
    String age;
    String Username;
    DateTime DOB = new DateTime();
    Course course;
    Module[] modules = new Module[10];
    
    public Student(String n, String id, String a, DateTime dob){
        this.name = n;
        this.ID   = id;
        this.age     = a;
        this.DOB  = dob;
    }
    
    public Student(String n, String id, String a, DateTime dob, Course c){
        this.name   = n;
        this.ID     = id;
        this.age     = a;
        this.DOB    = dob;
        this.course = c;
    }
     
    public Student(String n, String id, String a, DateTime dob, Course c, Module[] m){
        this.name    = n;
        this.ID      = id;
        this.age     = a;
        this.DOB     = dob;
        this.course  = c;
        this.modules = m;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setID(String newID){
        this.ID = newID;
    }
    
    public String getID(){
        return this.ID;
    }
    
    public void setAge(String newAge){
        this.age = newAge;
    }
    
    public String getAge(){
        return this.age;
    }
    
    public String getUsername(){
        this.Username = this.name + this.age;        
        return this.Username;
    }
    
    public void setDOB(DateTime newDOB){
        this.DOB = newDOB;
    }
    
    public DateTime getDOB(){
        return this.DOB;
    }
    
    public void setCourse(Course newCourse){
        this.course = newCourse;
        newCourse.addStudent(this);
    }
    
    public Course getCourse(){
        return this.course;
    }
    
    public void addModule(Module newModule){
        for(int i = 0; i < this.modules.length; i++){
            if (this.modules[i] == null){
                this.modules[i] = newModule;
            }
        }
    }
    
    public Module[] getModuleList(){
        return this.modules;
    }
    
}
