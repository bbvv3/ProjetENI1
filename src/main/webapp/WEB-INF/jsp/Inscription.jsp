<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
 <meta name="author" content="">
 <!-- Bootstrap core CSS -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    
     <link href="css/inscription.css" rel="stylesheet">
</head>
<body class="container-fluid col-xs-8 col-xs-offset-2 bordure">

	<header id="logolien" class="col-xs-12 ">
		<a href="${pageContext.servletContext.contextPath}/Accueil" class="col-xs-6 col-md-3">
			<img src="img/logo.png" alt="logo ENI-Enchères" class="col-xs-12">
		</a>
	</header>
	<h2 id="titre">Créer un compte</h2>
	<c:if test="${erreur != null}">
		<div>
			<p class="col-xs-10 col-xs-offset-1 col-md-9 col-md-offset alert alert-danger"> ${erreur} </p>
		</div>
	</c:if>
	<form action="${pageContext.servletContext.contextPath}/Inscription" method="post" class="col-xs-12 bordure">
		<div class="col-xs-12 col-md-6 bordure insertion">
			<label for="id_pseudo" class="col-xs-5 bordure">Pseudo* : </label><input class="col-xs-7 col-md-5 bordure" type="text" id="id_pseudo" name="pseudo" pattern="^[a-z0-9_-]{5,10}$" required/>
		</div>
		<div class="col-xs-12 col-md-6 bordure insertion">
			<label for="id_nom" class="col-xs-5 bordure">Nom* : </label><input class="col-xs-7 col-md-5 bordure" type="text" id="id_nom" name="nom" size="30" required/>
		</div>
		<div class="col-xs-12 col-md-6 bordure insertion">
			<label for="id_prenom" class="col-xs-5 bordure">Prenom* : </label><input class="col-xs-7 col-md-5 bordure" type="text" id="id_prenom" name="prenom" size="30" required/>
		</div>
		<div class="col-xs-12 col-md-6 bordure insertion">
			<label for="id_mail" class="col-xs-5 bordure">Email* : </label><input class="col-xs-7 col-md-5 bordure" type="email" id="id_mail" name="mail" pattern="[^@ \t\r\n]+@[^@ \t\r\n]+\.[^@ \t\r\n]+" required/>
		</div>
		<div class="col-xs-12 col-md-6 bordure insertion">
			<label for="id_tel" class="col-xs-5 bordure">Téléphone : </label><input class="col-xs-7 col-md-5 bordure" type="tel" id="id_tel" name="tel" pattern="^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$" />
		</div>
		<div class="col-xs-12 col-md-6 bordure insertion">
			<label for="id_rue" class="col-xs-5 bordure">Rue* : </label><input class="col-xs-7 col-md-5 bordure" type="text" id="id_rue" name="rue" size="40" required/>
		</div>
		<div class="col-xs-12 col-md-6 bordure insertion">
			<label for="id_codePostal" class="col-xs-5 bordure">Code postal* : </label><input class="col-xs-7 col-md-5 bordure" type="text" id="id_codePostal" name="codePostal" size="5" required/>
		</div>
		<div class="col-xs-12 col-md-6 bordure insertion">
			<label for="id_ville" class="col-xs-5 bordure">Ville* : </label><input class="col-xs-7 col-md-5 bordure" class="col-xs-8 bordure" type="text" id="id_ville" name="ville" size="50" required/>
		</div>
		<div class="col-xs-12 col-md-6 bordure insertion">
			<label for="id_mdp" class="col-xs-5 bordure">Mot de passe* : </label><input class="col-xs-7 col-md-5 bordure" type="password" id="id_mdp" name="mdp" pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,20}$" required/>
		</div>
		<div class="col-xs-12 col-md-6 bordure insertion">
			<label for="id_mdp2" class="col-xs-5 bordure">Confirmation* : </label><input class="col-xs-7 col-md-5 bordure" type="password" id="id_mdp2" name="mdp2" pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,20}$" required/>
		</div>
		<div id="divBtns" class="col-xs-12 col-md-12 bordure">
			<input class="col-xs-5 col-md-3" type="submit" value="Créer"/>
			<input class="col-xs-5 col-md-3" type="reset" value="Annuler"/>
		</div>
	</form>
</body>
</html>