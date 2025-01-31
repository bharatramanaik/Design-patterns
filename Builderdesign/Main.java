package Builderdesign;

public class Main {
    public static void main(String[] args) {

        Director director = new Director(new EngineerStuBuilder());
        Student student = director.create();
        System.out.println(student.toString());
        
    
    }
}
