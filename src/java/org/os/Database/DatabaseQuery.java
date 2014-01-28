/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.os.Database;

/**
 *
 * @author trainee1
 */
public class DatabaseQuery {

    public static final String select="select username,password from customer_info where username=? and password=?";
   // public static final String insert="insert into customer_info values(?,?,?,?,?,?,?)";
    public static final String getdetails="select * from productdetails where product_id=?";

}
