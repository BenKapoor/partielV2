<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  	<link rel="stylesheet" href="css/style.css">
  	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Profil</title>
</head>
<body>
	<h1>Vous êtes sur votre page de profil</h1>
	<p>Connexion réussie!!!!</p>
	<h2>
	<a href="AddClientServlet?id=${id}">Ajouter un étudiant (à venir)</a>
	</h2>
	<table class="table table-striped table-dark">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nom</th>
      <th scope="col">Prenom</th>
       <th scope="col">Détail</th>
      <th scope="col">Modification</th>
      <th scope="col">Suppression</th>
     
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${listePersonne}" var="personne">
    <tr>
      <th scope="row"><%-- out.println(i); --%></th>
      <td>${personne.nom}</td>
      <td>${personne.prenom}</td>
      <td><a href="/monappli-web/DetailServlet?id=${personne.id}">Détail (à venir)</a></td>
      <td><a href="/monappli-web/Modification?id=${personne.id}">Modification (à venir)</a></td>
      <td><a href="/monappli-web/Suppression?id=${id}&idClient=${personne.id}">Suppression (à venir)</a></td>
    </tr>
    </c:forEach>
    </tbody>
  </table>
		
	<div class="btn-redirection">
     	<input type="submit" class="redirection" onclick="window.location.href = 'index.jsp';" value="Retour au login"/>
     </div>
</body>
</html>