<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atividade 5</title>
</head>
<body>
	<!-- Escreva uma página JSP jsp5 que 
apresente no HTML a data atual (data completa e horário). -->
	<%
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy / hh:mm");
		Calendar calendar = Calendar.getInstance();
		out.print(df.format(calendar.getTime()));
	%>

</body>
</html>