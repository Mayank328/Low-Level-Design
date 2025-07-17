package BuilderPattern;

public class Client {

    public static void main(String args[]){

        Director directoryObj1 = new Director(new EngineeringStudentBuilder());
        Director directoryObj2 = new Director(new MBAStudentBuilder());

        Student engineeringStudent = directoryObj1.createStudent();
        Student mbaStudent = directoryObj2.createStudent();

        System.out.println(engineeringStudent.toString());
        System.out.println(mbaStudent.toString());
    }
}