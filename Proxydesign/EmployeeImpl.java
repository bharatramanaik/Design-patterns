package Proxydesign;

public class EmployeeImpl implements Employee {

    @Override
    public void create(String client, String username) {
        System.out.println("employee created");
    }

    @Override
    public void delete(String client, String username) {
        System.out.println("employee deleted");
    }

    @Override
    public String getemployees() {
        return "sdkjfsdkfn";
    }
    
}
