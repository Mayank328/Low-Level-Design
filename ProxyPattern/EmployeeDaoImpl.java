package ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao {
    
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        // Implementation for creating an employee
        System.out.println("Employee created for client: " + client);
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        // Implementation for deleting an employee
        System.out.println("deleted row employee with ID " + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        // Implementation for retrieving an employee
        System.out.println("fetching data from the DB");
        return new EmployeeDo();
    }
}