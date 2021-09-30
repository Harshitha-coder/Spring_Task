<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>

</head>
<body>

<h1>Welcome to login page</h1>
<h1 style="color:red">${message}</h1>
   <div align="center">
	<form action="Login.do">
	<pre>
	Email: <input type="text" name="email">	
	
	Password: <input type="password" name="password">
	
	<input type="submit" value="submit">
	</pre>
	</form>
	</div>
</body>
</html>