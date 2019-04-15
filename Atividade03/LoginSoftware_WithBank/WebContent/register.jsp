<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar</title>
<link rel="stylesheet" type="text/css" media="screen" href="main.css" />
</head>
<body>
	    <div class="container">
        <div class="container-register">
            <div class="title">
                <h1>Cadastrar</h1>
            </div>
            <form action="InsertServlet" method="post">
                <div class="container-input">
                    Login: <input type="text" name="login" placeholder="Informe o login" />
                </div>
                <div class="container-input">
                    Senha: <input type="text" name="password" placeholder="Informe a senha" />
                </div>
                <div class="container-input">
                    Email: <input type="text" name="email" placeholder="Informe seu email" />
                </div>
                <div class="container-input">
                    Nome: <input type="text" name="name" placeholder="Informe o nome" />
                </div>
                <div class="container-input">
                    <button type="submit" name="send">Enviar</button>
                </div>
            </form>
        </div>
    </div>
</body>
</html>