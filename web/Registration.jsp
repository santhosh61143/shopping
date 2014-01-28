<%-- 
    Document   : Registration
    Created on : Jan 23, 2014, 5:49:48 PM
    Author     : rajeshs
--%>

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
                    <img src="images/logo1.jpg" alt="no image">
                    </img>
                </div>
                <div class="clear"></div>
            </div>

            <div class="clear">

            </div>
            <div class="menu">
                <ul>
                    <li><a href="">home</a></li>
                    <li><a href="">contact</a></li>
                </ul>
            </div>

            <div class="clear">

            </div>
        </div>
        <div class="reg">
            <center>
                <form method="post" action="Registration.do">
                    <span class="reg1">Name:</span><input type="text" name="name"><br/>
                    UserName:<input type="text" name="username"><br/>
                    Password:<input type="password" name="password"><br/>
                    Address<input type="text" name="address"><br/>
                    Gender: <input type="radio" value="male" name="gender">male
                    <input type="radio" value="female" name="gender">female<br/>
                    Email Id:<input type="text" name="mailid"><br/>
                    Phone number:<input type="text" name="contactno"><br/>
                    
                    <input type="reset" value="reset">
                    <input type="submit" value="submit">
                   
                </form>
                 </center>
        </div>
    </body>
</html>
