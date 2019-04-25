<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Detalhe de Evento</title>

    <!-- Bootstrap core CSS -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="form-validation.css" rel="stylesheet">
  </head>
  <body class="bg-light">
    <div class="container">
  <div class="py-5 text-center">
    <h2>Detalhe de Evento </h2>
  </div>

  <div class="row">
    <div class="col-md-12 order-md-1">
        <div class="row">
          <div class="col-md-12 mb-3">
				${evento.nome}
          </div>
        </div>

        <div class="mb-3">
				${evento.descricao}
			
        </div>
        
        <div class="mb-3">
				${evento.categoria.nome}
			
        </div>

         <div class="mb-3">
                ${evento.hora}
          </div>
           <div class=" mb-3">
            <fmt:parseDate value="${evento.data}" pattern="yyyy-MM-dd" var="parsedDate" type="date" />
			<fmt:formatDate value="${parsedDate}" var="stdDatum" type="date" pattern="dd/MM/yyyy" />
			${stdDatum}
          </div>

      
    </div>
  </div>
  
  <c:import url="inscricaoForm.jsp"></c:import>
  <c:import url="inscricaoDetalhe.jsp"></c:import>

  <footer class="my-5 pt-5 text-muted text-center text-small">
    <p class="mb-1">EventUCSAL</p>

  </footer>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>

