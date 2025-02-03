package Singletondesign;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getObject();
        System.out.println(dbConnection.hashCode());
        System.out.println(dbConnection.hashCode());
        System.out.println(dbConnection.hashCode());

    }
}
