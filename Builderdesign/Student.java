package Builderdesign;

import java.util.List;

public class Student {
    int rollno;
    String name;
    String fathername;
    String mothername;
    int age;
    List<String> subjects;
    
    public Student(StudentBuilder studentBuilder){
        this.rollno = studentBuilder.rollno;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.fathername = studentBuilder.fathername;
        this.mothername = studentBuilder.mothername;
        this.subjects = studentBuilder.subjects;
    }

    public String toString(){
        return this.rollno+" "+this.age+" "+this.name+" ";
    }


}
