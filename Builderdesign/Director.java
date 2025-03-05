package Builderdesign;

public class Director {
    private StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student create(){
        if (studentBuilder instanceof EngineerStuBuilder) {
            return createEngineerStudent();
        }else{
            return createPUCStudent();
        }
    }

    private Student createEngineerStudent(){
        return studentBuilder.setRollno(1)
                    .setAge(20).setName("abc")
                    .setFathername("mbs").setMothername("lkb")
                    .setSUbjects()
                    .build();
        
    }

    private Student createPUCStudent(){
        return studentBuilder.setRollno(3)
                    .setAge(17).setName("mnb")
                    .setFathername("sdf").setMothername("bvc")
                    .setSubjects()
                    .build();
        
    }



}
