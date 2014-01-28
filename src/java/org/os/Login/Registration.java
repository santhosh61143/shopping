/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.os.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.os.DAO.CustomerDAO;
import org.os.Database.DBUtil;
import org.os.Database.DatabaseQuery;
import org.os.LoginFormBean.RegistrationFormBean;

/**
 *
 * @author rajeshs
 */
public class Registration extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static  String SUCCESS = "fail";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        try {
          

           Connection connection = DBUtil.oracleConnection();
            RegistrationFormBean rfbean =(RegistrationFormBean)form;
            
            PreparedStatement preparedStatement = connection.prepareStatement("insert into customer_info values(?,?,?,?,?,?,?)");
         preparedStatement.setString(1, rfbean.getUsername());
            preparedStatement.setString(2, rfbean.getPassword());
             preparedStatement.setString(3, rfbean.getName());
            preparedStatement.setString(4, rfbean.getMailid());
             preparedStatement.setString(5, rfbean.getGender());
            preparedStatement.setString(6, rfbean.getAddress());
            preparedStatement.setLong(7, rfbean.getContactno());
           ResultSet resultSet = preparedStatement.executeQuery();
          
            /* System.out.println("before***************************");
            System.out.println("rfffffffffff*****"+rfbean.getUsername());
             int i=CustomerDAO.register(rfbean);
             System.out.println("valueee**********"+i);*/

            if (resultSet.next()) {
                SUCCESS = "success";
            } 
            
        } 
        catch (Exception ex) {
            System.out.println("No database found"); 
        
    }
        
        return mapping.findForward(SUCCESS);
}
}
