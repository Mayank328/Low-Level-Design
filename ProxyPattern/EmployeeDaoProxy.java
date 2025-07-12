package ProxyPattern;

public class EmployeeDaoProxy implements EmployeeDao {
    EmployeeDao employeeDaoObj;

    EmployeeDaoProxy(){
        employeeDaoObj = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {

        if(client.equals("ADMIN")){
            employeeDaoObj.create(client, obj);
            return;
        } else {
            throw new Exception("You are not authorized to create an employee");
        }
    }
    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")){
            employeeDaoObj.delete(client, employeeId);
            return;
        } else {
            throw new Exception("You are not authorized to delete an employee");
        }
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeDaoObj.get(client, employeeId);
        }else{
            System.out.println("You are not authorized to get an employee");
            return null;
        }
    }
}