<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Mega Sena - Lista de apostas</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<div class="page-header">
			<h1>Mega Sena <small>Lista de Apostas</small></h1>
		</div>
		
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>#</th>
							<th>Apostador</th>
							<th>Valor</th>
							<th>Data</th>
							<th>Números</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach var="aposta" items="${cadastro.apostas}">
						<tr>
							<td><a href="detalhar-aposta?id=${aposta.codigo}">${aposta.codigo}</a></td>
							<td>${aposta.apostador}</td>
							<td><fmt:formatNumber value="${aposta.valor}" type="currency"/></td>
							<td><fmt:formatDate value="${aposta.data.time}" type="date" dateStyle="medium" /></td>
							<td>${aposta.numeros}
						</tr>
					</c:forEach>
					</tbody>
				</table>
			
	</div>
</body>
</html>