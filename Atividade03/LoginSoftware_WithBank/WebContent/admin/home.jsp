<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<jsp:useBean id="user" class="br.ucsal.bes.model.User" scope="session" />
</head>
<body>
	<h1>
		Bem vindo,
		<c:out value="${user.name}" />
	</h1>
</body>
</html>