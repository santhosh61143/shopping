/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.os.DAO;


import org.hibernate.Hibernate;
import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
import org.os.LoginFormBean.RegistrationFormBean;
/**
 *
 * @author rajeshs
 */
public class CustomerDAO {
    
    public static int register(RegistrationFormBean rfbean){  
 int i=0; 
 
        System.out.println("rfbean**************"+rfbean.getUsername());
 Session session = new Configuration().configure().buildSessionFactory().openSession();
        System.out.println("111111111111***************");
          
  Transaction t=session.beginTransaction();  
  t.begin();  
               System.out.println("2222222222222222222*************");   
  i=(Integer)session.save(rfbean); 
        System.out.println("value of i in dao ************"+ i);
                  
  t.commit();  
  session.close();  
    
  return i; 
    }
    
}
