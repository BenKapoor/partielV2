<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  	<link rel="stylesheet" href="css/style.css">
  	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Profil</title>
</head>
<body>
	<h1>Vous �tes sur votre page de profil</h1>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Gestion Etudiants</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Menu �tudiant
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="#">Lister �tudiants</a>
          <a class="dropdown-item" href="#">Supprimer un �tudiant</a>
          <a class="dropdown-item" href="#">Modifier un �tudiant</a>
          <a class="dropdown-item" href="AddClientServlet?id=${id}">Ajouter un �tudiant</a>
        </div>
      </li>
      <li class="nav-item active" style="padding-right: 10px">
        <a class="nav-link" href="index.jsp">D�connexion <span class="sr-only">(current)</span></a>
      </li>
    </ul>
  </div>
</nav>
	<%-- <h2>
	<a href="AddClientServlet?id=${id}">Ajouter un �tudiant (� venir)</a>
	</h2> --%>
<table class="table table-striped table-dark">
  	<thead>
	    <tr>
			<th scope="col">#</th>
			<th scope="col">Nom</th>
			<th scope="col">Prenom</th>
			<th scope="col">D�tail</th>
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
				<td><a href="/monappli-web/DetailServlet?id=${personne.id}">D�tail (� venir)</a></td>
				<td><a href="/monappli-web/Modification?id=${personne.id}">Modification (� venir)</a></td>
				<td><a href="/monappli-web/Suppression?id=${id}&idClient=${personne.id}">Suppression (� venir)</a></td>
			</tr>
		</c:forEach>
    </tbody>
</table>
		<!--
	<div class="btn-redirection">
    		<input type="submit" class="redirection" onclick="window.location.href = 'index.jsp';" value="Retour au login"/>
    	</div>
       -->
</body>
</html>