/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpt150030.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hardik
 */
public class DatabaseConnection {

    //new cide for postgresql connection
    
//    private final String url = "jdbc:postgresql://localhost:5432/postgres";
//    private final String user = "postgres";
//    private final String password = "12345";
//    
    //end new code
    
    
    
    
    public Connection connect = null;
    private Statement statement = null;
    public PreparedStatement preparedStatement = null;
    public ResultSet resultSet = null;
    
    
    
    

    public DatabaseConnection() {
    }

    public void openConnection() throws SQLException, ClassNotFoundException {
       
        
        //mysql connection code
        
        Class.forName("com.mysql.jdbc.Driver");
              connect = DriverManager
                .getConnection("jdbc:mysql://localhost/lms?"
                        + "user=root&password=hardik460");
        

        //end mysql code
        
        
         //new cide for postgresql connection

//        Class.forName("org.postgresql.Driver");
//        connect = DriverManager.getConnection(url, user, password);        

         //end new code
        
        
    }

    public void closeConnection() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception exp) {

        }
    }
}
