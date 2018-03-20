<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<h1>Banner</h1>
	<form action="VerifyCredential" method="post">
		<input type="text" placeholder="username" name= "username">
		<input type="password" placeholder="password" name="password">
		<input type="submit" value="Login" />
	</form>
</body>
</html>