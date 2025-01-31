package Proxydesign;

public class Main {
    public static void main(String[] args) {
        Employee employee = new EmpProxy(new EmployeeImpl());
        try {
            employee.create("Admin", "kdjf");
            System.out.println( employee.getemployees());
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }   
}
