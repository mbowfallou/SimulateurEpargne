<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Entrée</title>
</head>
<body>
<h1>Simulateur de prêt</h1>
	<form action="Controleur" method="POST">
		<label>Montant du prêt : </label>
		<input type="text" name="pret" value=""> <br>
		
		<label>Taux d'Intérêt Annuel </label>
		<input type="text" name="taux" value=""> <br>
		
		<label>Nombre d'année </label>
		<input type="text" name="na" value=""> <br>
		<input type="hidden" name="forme" value="forme1">
		
		<div><input type="submit" value="Calculer"></div>
	</form>
</body>
</html>