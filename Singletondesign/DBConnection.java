package Singletondesign;

public class DBConnection {
    private static DBConnection dbConnection;

    private DBConnection(){

    }

    public static DBConnection getObject(){
        if (dbConnection == null) {
            dbConnection = new DBConnection();
            return dbConnection;
        }else{
            return dbConnection;
        }
    }

    

}
