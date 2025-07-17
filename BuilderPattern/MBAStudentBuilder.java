package BuilderPattern;

import java.util.List;
import java.util.ArrayList;

public class MBAStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Marketing");
        subjects.add("Finance");
        subjects.add("Human Resources");
        this.subjects = subjects;
        return this;
    }
}