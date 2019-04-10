<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form method="post" action="LoginServlet">
		Nome: <input type="text" name="name" placeholder="Informe o nome"/> 
		Senha: <input type="password" name="password" placeholder="Informe a senha"/>
		<button type="submit">Entrar</button>
	</form>
	<c:out value="${erro}"/>
</body>
</html>