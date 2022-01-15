package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {

    protected Connection connection;

    public DBContext(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/workflowbox?user=root&password=123456");
            System.setProperty("com.mysql.jdbc.Driver","");
        } catch (ClassNotFoundException | SQLException | 
                IllegalAccessException | InstantiationException ex) {
            System.out.println(ex);
        }
    }
}
