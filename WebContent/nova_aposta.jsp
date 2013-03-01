<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Mega Sena - Cadastrar Aposta</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<div class="page-header">
			<h1>Mega Sena <small>Cadastrar Aposta</small></h1>
		</div>
		<div class="well span4">
			<form class="form-horizontal" method="POST" action="adicionar-aposta">
				<fieldset>
					<legend>Nova aposta</legend>
					<div class="control-group">
						<label class="control-label" for="apostador">Apostador</label>
						<div class="controls">
							<input id="apostador" name="apostador" type="text" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="valor">Valor</label>
						<div class="controls">
							<div class="input-prepend">
								<span class="add-on">R$</span>
								<input id="valor" name="valor" type="number" step="0.1" />
							</div>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="apostador">Tipo de aposta</label>
						<div class="controls">
							<select name="tipo" id="tipo">
								<option value="normal">Normal</option>
								<option value="surpresinha">Surpresinha</option>
								<option value="menosfrequentes">Números menos frequentes</option>
								<option value="imparesfrequentes">Números ímpares mais frequentes</option>
								<option value="paresfrequentes">Números pares mais frequentes</option>
								<option value="frequentesacumulados">Números mais frequentes em sorteios acumulados</option>
								<option value="menosfrequentesnaoacumulados">Números menos frequentes em sorteios não acumulados</option>
							</select>
						</div>
					</div>					
				</fieldset>
				<div class="control-group">
					<div class="controls">
						<button class="btn btn-primary" type="submit">Cadastrar</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>