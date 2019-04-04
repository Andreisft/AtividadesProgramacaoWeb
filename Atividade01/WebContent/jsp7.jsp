<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atividade 7</title>
</head>
<body>
	<!-- Crie uma página JSP que leia o raio de um círculo
 e imprima o valor do raio, da área e do perímetro em outra página.
 Obs.: Use o redirecionamento de páginas para exibir esses valores. -->
	<form action="jsp7_Page2.jsp" method="get">
		<input type="text" name="raio" placeholder="Informe o raio"/>
		<button type="submit">calcular</button>
	</form>
		
</body>
</html>