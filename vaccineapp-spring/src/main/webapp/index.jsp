<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Registration Page</title>
	<style type="text/css">
		.header
		{	
			background-color:black; 
			color:red;
			padding: 20px;
			text-align: center;
			font-size: 40px;
		}
		
		.button
		{
		 background-color:green;
        color:white;
        padding: 5px 30px;
        margin: 4px 2px;
		}

		
	</style>
</head>
<body bgcolor="pink">
	<header class="header">Registration Form</header>
	<div align="center">
	<form action="register.do">
	<pre>	
	Username:  <input type="text" name="useName" placeholder="enter userName">

		
	Email:     <input type="email" name="email" placeholder="enter valid email" >

	
	Password:   <input type="password" name="password" minlength="4" maxlength="8" >

	
Confirm Password:   <input type="password" name="confirmPassword" minlength="4" maxlength="8" >


	Phone No:   <input type="number" name="phoneNum" placeholder="enter phonenum">
	

	AadharNum:  <input type="number" name="aadharNum" placeholder="enter aadharnum">
	

         Gender:    <input type="radio" name="gender" value="male"> male <input type="radio"  name="gender" value="female">female <input type="radio" name="gender" value="other">other

        
VaccineType:      <select>
        	<option>CoviShield</option>
        	<option>CoVaxin</option>
        	<option>Sptunilv</option>       	
                 </select>
            

                    <input type="submit" value="submit" class="button">

	</pre>	

	</form>	
	</div>
	<footer class="header"> What's Up</footer>
</body>
</html>