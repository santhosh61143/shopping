/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.os.Valiidate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.os.Database.DBUtil;
import org.os.Database.DatabaseQuery;

/**
 *
 * @author rajeshs
 */
public class UserValidate {
    
     public String validateUser(String username,String password) {
        System.out.println("Database*********");
        String result = "fail";

        try {

            Connection connection = DBUtil.oracleConnection();
           
            
            PreparedStatement preparedStatement = connection.prepareStatement(DatabaseQuery.select);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                result = "success";
            }
        } catch (SQLException ex) {
            System.out.println("No database found");
        }

        return result;
    }
    
}
