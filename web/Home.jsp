<%-- 
    Document   : Home
    Created on : Jan 23, 2014, 4:12:45 PM
    Author     : rajeshs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
        <%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
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
		 </ul>
		 </div>
		 
		 <div class="clear">
	
</div>
</div>
  
  <center>
  <div class="login">
	<form method="post" action="LoginAction.do">
	<h3>Login Form</h3>
	Username<br/>
	<input type="text" placeholder="enter username" name="username"><br/>
Password<br/>
<input type="password" placeholder="enter password"  name="password"><br/>
<input type="submit" value="sign in"><br/><br/>


	</form>
     New User: <span><a href="Registration.jsp">Register here</a></span>
  </div>
  </center>


    </body>
</html>
