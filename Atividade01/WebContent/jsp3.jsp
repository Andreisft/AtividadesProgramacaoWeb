<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atividade 3</title>
</head>
<body>
	<!-- Crie uma p�gina JSP jsp3 que imprima na tela do navegador os dados a seguir: 
O contexto sob o qual a p�gina est� sendo executada. 
O endere�o IP da m�quina do cliente que fez a requisi��o. 
O nome do host que recebe a requisi��o.
O m�todo da requisi��o (POST ou GET).
O protocolo usado na requisi��o. 
Os nomes e os valores dos par�metros contidos na requisi��o. -->

	<%
		//O contexto sob o qual a p�gina est� sendo executada. 
		out.print("O contexto sob o qual a p�gina est� sendo executada= " + request.getContextPath());
	%></br>
	<%
		//O endere�o IP da m�quina do cliente que fez a requisi��o.
		out.print("O endere�o IP da m�quina do cliente que fez a requisi��o= " + request.getRemoteAddr());
	%></br>
	<%
		//O nome do host que recebe a requisi��o.
		out.print("O nome do host que recebe a requisi��o= " + request.getRemoteHost());
	%></br>
	<%
		//O m�todo da requisi��o (POST ou GET).
		out.print("O m�todo da requisi��o (POST ou GET)= " + request.getMethod());
	%></br>
	<%
		//O protocolo usado na requisi��o.
		out.print("O protocolo usado na requisi��o= " + request.getProtocol());
	%></br>
	<%
		out.print("Forma que eu fiz:");
	%></br>
	<%
		//Os nomes e os valores dos par�metros contidos na requisi��o.
		out.print("Nomes dos par�metros contidos na requisi��o= " + request.getAttributeNames());
	%></br>
	<%
		out.print("Valores dos par�metros contidos na requisi��o= " + request.getParameterMap());
	%></br>
	<%
		out.print("Forma ensinada pelo professor:");
	%></br>
	<%
		//Os nomes e os valores dos par�metros contidos na requisi��o.
		Map map = request.getParameterMap();
		out.print("Nomes dos par�metros contidos na requisi��o= ");
		for(Object name : map.keySet()) {
			out.print(name);
		}
	%></br>
	<%
		out.print("Valores dos par�metros contidos na requisi��o= ");
		for(Object name : map.keySet()){
			out.print(map.get(name));
		}
	%>
</body>
</html>