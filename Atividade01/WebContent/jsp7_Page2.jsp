<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atividade 7 - Página 2</title>
</head>
<body>
	<%
		Double pi = 3.141592;
		String r = request.getParameter("raio");
		Double raio = Double.parseDouble(r);
		out.print("Raio= " + raio + " ");
		Double area = pi * (raio * raio);
		out.print("Valor da área= "+ area + " ");
		Double perimetro = (2 * pi) * raio;
		out.print("Valor do perimetro= " + perimetro);
	%>
</body>
</html>