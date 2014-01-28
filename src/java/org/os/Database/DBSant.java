/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.os.Database;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author rajeshs
 */
public class DBSant {
     public static Connection oracleConnection() {

        Connection connection = null;

        try {
            FileInputStream fIn = new FileInputStream("C:\\Documents and Settings\\rajeshs\\My Documents\\NetBeansProjects\\OnlineShopping\\src\\java\\org\\os\\Database\\OracleProperties.properties");

            Properties prop = new Properties();
            prop.load(fIn);
            System.out.println("file loaded successfully");

            Class.forName(prop.getProperty("driverclass"));
            System.out.println("driver class loaded successfully");
            connection=DriverManager.getConnection(prop.getProperty("url1"),prop.getProperty("user"),prop.getProperty("password"));

            System.out.println("connection establshed");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Class Not found");
        } catch (SQLException ex) {
            System.out.println("No database found");
        }catch(Exception e){
            System.out.println("file not found");
        }

        return connection;
    }
    
}
