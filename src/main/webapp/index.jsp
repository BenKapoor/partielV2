<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
  <%@include file="../css/style.css" %>
</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>AUTHENTIFICATION</title>
</head>
<body>
	<h1>AUTHENTIFICATION</h1>

	<!-- On int�gre un formulaire � la page HTML -->
	<form id="test" action="authentification" method="post">
		<div class="login">
			<p for="mail">Mail :</p> <input type="text" id="mail"
				name="mail" required>

			<p for="nom">Nom :</p> <input type="text" id="nom"
				name="nom" required>
			<!--  <p for="prenom">MDP :</p> <input type="password"  id="Password" name="mdpuser" required/>-->

		<input type="submit" value="Envoyer">
		</div>
	</form>
</body>
</html>