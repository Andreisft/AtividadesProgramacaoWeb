<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" media="screen" href="/main.css" />
<meta charset="ISO-8859-1">
<title>ADM</title>
</head>
<body>
	<div class="container">
		<div class="container-register">
			<div class="title">
				<h1>Menu</h1>
			</div>
			<form action="menuAdminServlet" method="post">
				<div class="container-input">
					<input type="button" value="Cadastrar um usu�rio" name="registerUser"/>
				</div>
				<div class="container-input">
					<input type="button" value="Remover um usu�rio" name="removeUser"/>
				</div>
				<div class="container-input">
					<input type="button" value="Atualizar um usu�rio" name="updateUser"/>
				</div>
				<div class="container-input">
					<input type="button" value="Listar os usu�rios" name="selectUser"/>
				</div>
			</form>
		</div>
	</div>
</body>
</html>

<!-- 
Com a tag A
<div class="container-input">
				<a href="">Cadastrar um usu�rio</a>
			</div>
			<div class="container-input">
				<a href="">Remover um usu�rio</a>
			</div>
			<div class="container-input">
				<a href="">Atualizar um usu�rio</a>
			</div>
			<div class="container-input">
				<a href="">Listar os usu�rios</a>
			</div> -->