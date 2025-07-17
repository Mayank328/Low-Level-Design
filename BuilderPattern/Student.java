package BuilderPattern;

import java.util.List;

public class Student {

    int rollNumber;
    int age;
    String name;
    String fathername;
    String mothername;
    List<String> subjects;

    public Student(StudentBuilder builder) {
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.name = builder.name;
        this.fathername = builder.fathername;
        this.mothername = builder.mothername;
        this.subjects = builder.subjects;
    }

    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", fathername='" + fathername + '\'' +
                ", mothername='" + mothername + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}