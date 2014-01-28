<%-- 
    Document   : basket
    Created on : Jan 27, 2014, 2:55:58 PM
    Author     : rajeshs
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="org.os.Database.DBSant"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style type="text/css"><%@include file="/css/style.css" %></style>
        <title>JSP Page</title>
    </head>
    <body>
      
         
       
        
      
          <div class="header">
    <div class="logo_head">
      <div class="logo">
	     <img src="images/logo1.jpg" alt="no image"/>
		 
		 </div>
		 <div class="clear"></div>
		 </div>
	
<div class="clear">
	
</div>
	 <div class="menu">
		 <ul>
		 <li><a href="Home.jsp">home</a></li>
		 <li><a href="contact.jsp">contact</a></li>
                 <li><a href="Logout.do">Logout</a></li>

		 </ul>
		 </div>
		 
		 <div class="clear">
	
</div>
</div>
         
          <%
         Connection connection = DBSant.oracleConnection();
            System.out.println("connection object*************" + connection);
             HttpSession ss = request.getSession();
            PreparedStatement pstmt = connection.prepareStatement("select * from basket where username=?");
            pstmt.setString(1, ss.getAttribute("uname").toString());
             ResultSet rs = pstmt.executeQuery();
          while(rs.next()){
              
               
        %>
             <div class="basket">
           
                 <span> <img src= <%=rs.getString(6)%> /> </span>
                <span id="pid"> <%=rs.getString(2)%></span>
                <span> <%=rs.getString(3)%></span>
                <span>  <%=rs.getString(4)%></span>
                <input type="button"  value="delete"/><br/>
                
		 
		 
        </div>  
               
        
                
          <% } %>  
          
    </body>
</html>
