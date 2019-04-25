<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Formulário de Categoria</title>
		<link rel="stylesheet" href="main.css" crossorigin="anonymous">
</head>
<body>
	<form method="post" action="CategoriaController">
		<div class="container">
			<div class="container_categoria">
				<div class="input_categoria">
					<label>
						Nome da Categoria:</br>
						<input name="nome" type="text" />
					</label>
					<div class="btn">
						<button type="submit">Enviar</button>
					</div>	
				</div>		
			</div>
		</div>
	</form>
</body>
</html>