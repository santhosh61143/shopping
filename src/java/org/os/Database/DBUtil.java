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
public class DBUtil {
    public static Connection oracleConnection() {

        Connection connection = null;

        try {
            FileInputStream fIn = new FileInputStream("C:\\Documents and Settings\\rajeshs\\My Documents\\NetBeansProjects\\OnlineShopping\\src\\java\\org\\os\\Database\\OracleProperties.properties");

            Properties prop = new Properties();
            prop.load(fIn);

            Class.forName(prop.getProperty("driverclass"));
            connection=DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("user"),prop.getProperty("password"));

            
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
