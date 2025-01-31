package Builderdesign;

import java.util.List;

public abstract class StudentBuilder {
    int rollno;
    String name;
    String fathername;
    String mothername;
    int age;
    List<String> subjects;


    public StudentBuilder setRollno(int rollno) {
        this.rollno = rollno;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFathername(String fathername) {
        this.fathername = fathername;
        return this;
    }

    public StudentBuilder setMothername(String mothername) {
        this.mothername = mothername;
        return this;
    }

    abstract public StudentBuilder setSubjects();

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Student build(){
        return new Student(this);
    }


}
