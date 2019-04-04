<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atividade 6</title>
</head>
<body>
	<!-- Crie uma página JSP jsp6 que
	 converta a temperatura de Celsius (°C) para Fahrenheit (°F). -->
	
	<form action="jsp6.jsp" method=get>
		Celsius <input name="celsius" type="text" placeholder="Informe o raio"/>
		<button type="submit">Calcular</button>
	</form>

	<%
		Double fahrenheit = 0d;
		String c = request.getParameter("celsius");
		if (c != null) {			
			Double celsius = Double.parseDouble(c);	
			fahrenheit = (1.8 * celsius + 32);
		}
	%>
	<p>
		<%=fahrenheit %>F
	</p>

</body>
</html>