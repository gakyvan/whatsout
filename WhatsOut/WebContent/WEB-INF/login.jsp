<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="wout" uri="/WEB-INF/taglib/customTag.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
<link rel="stylesheet" href="css/login.css" />
</head>
<body>
	<wout:bannerTag className="blue-rose"/>
	<form action="loggedIn" method="post">
		<input type="text" placeholder="Name" name= "username">
		<input type="password" placeholder="password" name="password">
		<input type="submit" value="Login" />
	</form>
	<wout:footerTag className="footer" />
</body>
</html>