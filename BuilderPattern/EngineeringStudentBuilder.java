package BuilderPattern;

import java.util.List;
import java.util.ArrayList;

public class EngineeringStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        this.subjects = new ArrayList<>();
        this.subjects.add("DSA");
        this.subjects.add("OS");
        this.subjects.add("Networks");
        return this;
    }
}