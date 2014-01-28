<%-- 
    Document   : Casual
    Created on : Jan 27, 2014, 10:57:50 AM
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
        <div  class="header">
	 <div  class="logo_head">
		<div  class="logo">
			<img src="images/logo1.jpg" alt="no logo"  />	
		</div>
		
		<div  class="search">
			<form method="post" action="">
			<input type="text" id="search"  size="40" autocomplete="off" placeholder="enter your search" />
			<input type="submit" />
		</form>
		</div>

	<div class="clear"></div>
	</div>
	<!--end of logo_head-->
	<div  class="menu">
		<ul>
			<li><a href="Home.jsp">Home</a></li>
			<li><a href="">Contact</a></li>
               		<li><a href="Logout.do">Logout</a></li>
    
		</ul>
	</div>
	<div class="clear"></div>
 </div>

	
<form method="post" action="Basket.do">
 <div  class="content_images">

	<div class="img1">
		<img src="images/c1.jpg" alt="no image"  />
		<p>INR 1200</p>
			<span class="check1"><input type="checkbox" name="casual" value="c1" /></span>
			
	</div>
	<div class="img2">
		<img src="images/c2.jpg" alt="no image"  />	
			<p>INR 1400</p>
			<span class="check1"><input type="checkbox" name="casual" value="c2" /></span>
	</div>
	<div class="img3">
		<img src="images/c3.jpg" alt="no image"  />
			<p>INR 1600</p>
			<span class="check1"><input type="checkbox" name="casual" value="c3" /></span>
	</div>
	<div class="img4">
		<img src="images/c4.jpg" alt="no image"  />
			<p>INR 1600</p>
			<span class="check1"><input type="checkbox" name="casual" value="c4" /></span>
	</div>

	<div class="img1">
		<img src="images/c5.jpg" alt="no image"  />
			<p>INR 1800</p>
			<span class="check1"><input type="checkbox" name="casual" value="c5" /></span>
	</div>
	<div class="img2">
		<img src="images/c6.jpg" alt="no image"  />	
			<p>INR 2000</p>
			<span class="check1"><input type="checkbox" name="casual" value="c6" /></span>
	</div>
	<div class="img3">
		<img src="images/c7.jpg" alt="no image"  />
			<p>INR 2100</p>
			<span class="check1"><input type="checkbox" name="casual" value="c7" /></span>
	</div>
	<div class="img4">
		<img src="images/c8.jpg" alt="no image"  />
			<p>INR 2100</p>
			<span class="check1"><input type="checkbox" name="casual" value="c8" /></span>
	</div>

	<div  class="img1">
		<img src="images/c9.jpg" alt="no image"  />
			<p>INR 2700</p>
			<span class="check1"><input type="checkbox" name="casual" value="c9" /></span>
	</div>
	<div class="img2">
		<img src="images/c10.jpg" alt="no image"  />	
			<p>INR 2900</p>
			<span class="check1"><input type="checkbox" name="casual" value="c10" /></span>
	</div>
	<div  class="img3">
		<img src="images/c11.jpg" alt="no image"  />
			<p>INR 3100</p>
			<span class="check1"><input type="checkbox" name="casual" value="c11" /></span>
	</div>
	<div class="img4">
		<img src="images/c12.jpg" alt="no image"  />
			<p>INR 3400</p>
			<span class="check1"><input type="checkbox" name="casual" value="c12" /></span>
	</div>
	
	<input type="submit"  value="Add to Cart"/>
		
 </div>

 
</form>


<footer>
<img src="images/logo1.jpg" alt="no logo"  />	
<span>&copy  All Rights Reserved.</span>
</footer>
    </body>
</html>
