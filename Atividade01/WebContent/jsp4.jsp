<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>	
<%@ page import="java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atividade 4</title>
</head>
<body>
	<!-- Crie uma página JSP jsp4 que use a classe 
Calendar e mostre na tela do navegador a data atual. -->
	<%
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Calendar calendar = Calendar.getInstance();
		out.print(df.format(calendar.getTime()));
	%>
</body>
</html>