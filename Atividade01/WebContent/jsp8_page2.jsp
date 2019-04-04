<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atividade 8 - Página 2</title>
</head>
<body>
		<%
		String dataNasc = request.getParameter("dataNasc");
		if(dataNasc != null) {			
			Calendar calendar = Calendar.getInstance();
			Integer dataAtual = calendar.get(Calendar.YEAR);
			Integer idade = dataAtual - Integer.parseInt(dataNasc);
			out.print(idade + " anos de vida");
		}
	%>
</body>
</html>