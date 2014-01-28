/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.os.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.spi.DirStateFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.os.Database.DBSant;
import org.os.Database.DBUtil;
import org.os.Database.DatabaseQuery;
import org.os.LoginFormBean.ShoeFormBean;

/**
 *
 * @author rajeshs
 */
public class Basket extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static String result = "fail";

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
            String casual[] = request.getParameterValues("casual");
           

            Connection connection = DBSant.oracleConnection();
            System.out.println("connection object in basket page*************" + connection);
            HttpSession ss = request.getSession();
                
            if (casual.length > 0) {
                for (int i = 0; i < casual.length; i++) {
                    PreparedStatement preparedStatement = connection.prepareStatement(DatabaseQuery.getdetails);

                    preparedStatement.setString(1, casual[i]);
                    ResultSet rs = preparedStatement.executeQuery();
                    if (rs.next()) {
                        PreparedStatement pstmt = connection.prepareStatement("insert into basket values(?,?,?,?,?,?)");
                        pstmt.setString(1, ss.getAttribute("uname").toString());
                        pstmt.setString(2, rs.getString(1));
                        pstmt.setString(3, rs.getString(2));
                        pstmt.setInt(4, rs.getInt(3));
                        pstmt.setString(5, rs.getString(4));
                        pstmt.setString(6, rs.getString(5));
                       
                        ResultSet rs1 = pstmt.executeQuery();
                        if (rs1.next()) {
                            result = "success";
                        }
                        
                        connection.commit();
                    }
                }
            }
          
        

        } catch (Exception ex) {
            System.out.println("No database found");

        }




        return mapping.findForward(result);
    }
}
