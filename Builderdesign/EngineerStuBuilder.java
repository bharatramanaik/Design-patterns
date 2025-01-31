package Builderdesign;

import java.util.ArrayList;
import java.util.List;

public class EngineerStuBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("DSA");
        subjects.add("java");
        subjects.add("CC");
        this.subjects = subjects;
        return this;
    }
    
}
