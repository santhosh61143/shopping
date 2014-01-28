/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.os.Login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.os.LoginFormBean.LoginFormBean;
import org.os.Valiidate.UserValidate;

/**
 *
 * @author rajeshs
 */
public class LoginAction extends org.apache.struts.action.Action {


    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        System.out.println("Action class execute method**********");

        LoginFormBean lbean = (LoginFormBean)form;
        HttpSession ss = request.getSession();
        ss.setAttribute("uname",lbean.getUsername());

        

        UserValidate validate = new UserValidate();
     String navigate=   validate.validateUser(lbean.getUsername(), lbean.getPassword());
        System.out.println("result is **********"+navigate);
        return mapping.findForward(navigate);
    }
}
