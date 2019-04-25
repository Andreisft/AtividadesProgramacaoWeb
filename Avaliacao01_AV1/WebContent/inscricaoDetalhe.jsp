<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<div>
		<h2>Inscritos</h2>
		<table class="table" >
			<tr>
				<th> Nome </th>
				<th> Cpf </th>
				<th> Email</th>
			</tr>
		
			<c:forEach var="e" items="${inscricoes}">
				<tr>
					 <td> ${e.nome} </td>
					 <td> ${e.cpf} </td>
					 <td> ${e.email} </td>
				<tr>
			</c:forEach>
		</table>
	</div>