package ProxyPattern;

public class Main {

    public static void main(String[] args) {
        try {
            EmployeeDao empTableObj = new EmployeeDaoProxy();
            empTableObj.create("ADMIN", new EmployeeDo());
            EmployeeDo empinfo = empTableObj.get("RANDOM", 11); // This will throw an exception
            System.out.println(empinfo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}