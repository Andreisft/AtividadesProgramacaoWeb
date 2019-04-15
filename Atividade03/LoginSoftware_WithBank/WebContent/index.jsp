<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" media="screen" href="main.css" />
</head>
<body>
	<div class="container">	
		<div class="container-register">
			<form method="post" action="LoginServlet">
				<div class="title">
					<h1>Login</h1>
				</div>
				<div class="container-input">
                    Nome: <input type="text" name="name" placeholder="Informe o nome" />
                </div>
                <div class="container-input">
                    Senha: <input type="text" name="password" placeholder="Informe a senha" />
                </div>
				<div class="container-input">
                    <button type="submit" name="enter">Enviar</button>
                </div>
			</form>
			<c:out value="${erro}"/>
			<a href="register.jsp">Ainda não possui uma conta ? Cadastre-se</a>
		</div>
	</div>
</body>
</html>