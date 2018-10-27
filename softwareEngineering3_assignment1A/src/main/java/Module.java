import org.joda.time.DateTime;

public class Module {
    
    String name;
    String ID;
    Student[] students = new Student[100];
    Course[] courses   = new Course[10];
    
    public Module(String n, String id){
        this.name = n;
        this.ID   = id;
    }
    
    public Module(String n, String id, Student[] s){
        this.name = n;
        this.ID   = id;
        this.students = s;
    }
    
    public Module(String n, String id, Student[] s, Course[] c){
        this.name = n;
        this.ID   = id;
        this.students = s;
        this.courses  = c;
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
    
    public Student[] getStudents(){
        return this.students;
    }
    
    public void addStudent(Student s){
        for(int i=0; i<this.students.length; i++){
            if(this.students[i] == null){
                this.students[i] = s;
            }
        }
    }
    
     public Course[] getCourses(){
        return this.courses;
    }
    
    public void addCourse(Course c){
        for(int j=0; j<this.courses.length; j++){
            if(this.courses[j] == null){
                this.courses[j] = c;
            }
        }
    }
    
}
