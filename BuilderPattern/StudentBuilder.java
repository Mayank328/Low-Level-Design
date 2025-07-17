package BuilderPattern;

import java.util.List;

public abstract class StudentBuilder {

    int rollNumber;
    int age;
    String name;
    String fathername;
    String mothername;
    List<String> subjects;

    public StudentBuilder setRollNumber (int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
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

    public Student build() {
        return new Student(this);
    }

}