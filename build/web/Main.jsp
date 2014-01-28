<%-- 
    Document   : Main
    Created on : Jan 23, 2014, 6:36:30 PM
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
		 <li><a href="">contact</a></li>
                 <li><a href="basket.jsp" >My Basket</a></li>
                 <li><a href="Logout.do">Logout</a></li>

		 </ul>
		 </div>
		 
		 <div class="clear">
	
</div>
</div>
<div  class="shoe">
    <a title="casual shoes" href="Casual.jsp"><img src="images/c1.jpg"></a>
<p>casual shoes</p>
</div>
<div class="shoe">
  <a title="formal shoes" href="Formal.jsp"><img src="images/f1.jpg"></a>
 <p>formal shoes</p>
 </div>
    </body>
</html>
