package BuilderPattern;

public class Director {
    
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
         if(studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineerStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }

        return null;
    }
    private Student createEngineerStudent() {
        return studentBuilder.setRollNumber(101)
                             .setAge(20)
                             .setName("John Doe")
                             .setFathername("Mr. Doe")
                             .setMothername("Mrs. Doe")
                             .setSubjects()
                             .build();
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNumber(102)
                             .setAge(22)
                             .setName("Jane Smith")
                             .setFathername("Mr. Smith")
                             .setMothername("Mrs. Smith")
                             .setSubjects()
                             .build();
    }

}