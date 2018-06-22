/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author consultadd
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test_postgresql {
    
    
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "12345";
 
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
   
       
        
    
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test_postgresql app = new Test_postgresql();
        app.connect();
    }

    
}
