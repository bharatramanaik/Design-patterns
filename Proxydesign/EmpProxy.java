package Proxydesign;


public class EmpProxy implements Employee {

    Employee employee;

    public EmpProxy(Employee employee){
        this.employee = employee;
    }

    @Override
    public void create(String client, String username) throws Exception {
        if (client.equals("Admin")) {
            employee.create(client, username);
            return;
        }
        throw new Exception("access denied");
    }

    @Override
    public void delete(String client, String username) throws Exception {
        if (client.equals("Admin")) {
            employee.delete(client, username);
            return;
        }
        throw new Exception("access denied");
    }

    @Override
    public String getemployees() {
        return employee.getemployees();
    }
    
}
