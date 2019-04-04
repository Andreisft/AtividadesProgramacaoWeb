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
	<!-- Crie uma página JSP jsp3 que imprima na tela do navegador os dados a seguir: 
O contexto sob o qual a página está sendo executada. 
O endereço IP da máquina do cliente que fez a requisição. 
O nome do host que recebe a requisição.
O método da requisição (POST ou GET).
O protocolo usado na requisição. 
Os nomes e os valores dos parâmetros contidos na requisição. -->

	<%
		//O contexto sob o qual a página está sendo executada. 
		out.print("O contexto sob o qual a página está sendo executada= " + request.getContextPath());
	%></br>
	<%
		//O endereço IP da máquina do cliente que fez a requisição.
		out.print("O endereço IP da máquina do cliente que fez a requisição= " + request.getRemoteAddr());
	%></br>
	<%
		//O nome do host que recebe a requisição.
		out.print("O nome do host que recebe a requisição= " + request.getRemoteHost());
	%></br>
	<%
		//O método da requisição (POST ou GET).
		out.print("O método da requisição (POST ou GET)= " + request.getMethod());
	%></br>
	<%
		//O protocolo usado na requisição.
		out.print("O protocolo usado na requisição= " + request.getProtocol());
	%></br>
	<%
		out.print("Forma que eu fiz:");
	%></br>
	<%
		//Os nomes e os valores dos parâmetros contidos na requisição.
		out.print("Nomes dos parâmetros contidos na requisição= " + request.getAttributeNames());
	%></br>
	<%
		out.print("Valores dos parâmetros contidos na requisição= " + request.getParameterMap());
	%></br>
	<%
		out.print("Forma ensinada pelo professor:");
	%></br>
	<%
		//Os nomes e os valores dos parâmetros contidos na requisição.
		Map map = request.getParameterMap();
		out.print("Nomes dos parâmetros contidos na requisição= ");
		for(Object name : map.keySet()) {
			out.print(name);
		}
	%></br>
	<%
		out.print("Valores dos parâmetros contidos na requisição= ");
		for(Object name : map.keySet()){
			out.print(map.get(name));
		}
	%>
</body>
</html>