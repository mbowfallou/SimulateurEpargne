<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="domaine.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sortie</title>
</head>
<body>
	<h1>Récapitulatif du Simulateur de prêt</h1>
	<% Pret p = (Pret) request.getAttribute("pret"); %>
	<h2>Données Saisies</h2>
	<div><b>Montant du Prêt : <i><%= p.getMpret() %></i></b></div>
	<div><b>Taux Annuel : <i><%= p.getTia() %></i></b></div>
	<div><b>Nombre d'année : <i><%= p.getNa() %></i></b></div>
	
	<h2>Résultats</h2>
	<div><b>Montant Mensuel à rembourser : <i><%= p.getMmens() %></i></b></div>
	<div><b>Montant Global : <i><%= p.getMglobal() %></i></b></div>
</body>
</html>