package Builderdesign;

import java.util.ArrayList;
import java.util.List;

public class PUCStuBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Checmistry");
        subjects.add("Physics");
        this.subjects = subjects;
        return this;
    }
    
}
