/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.os.LoginFormBean;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author rajeshs
 */
public class ShoeFormBean extends org.apache.struts.action.ActionForm {
    
    private String[] casual;

    public String[] getCasual() {
        return casual;
    }

    public void setCasual(String[] casual) {
        this.casual = casual;
    }
   

  /*  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getName() == null || getName().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }*/
}
