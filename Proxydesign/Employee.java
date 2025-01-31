package Proxydesign;

public interface Employee {
    void create(String client, String username) throws Exception;
    void delete(String client, String username) throws Exception;
    String getemployees();
}
