<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page errorPage="ErrorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form method="post" action="ServletExercicio9">
		Nome: <input name="name"></input>
		Senha: <input name="password"></input>
		<button type="submit">Send</button>	
	</form>
</body>
</html>