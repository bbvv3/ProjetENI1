<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connexion</title>

<!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container-fluid col-sm-10 col-sm-offset-1">

	<header>
		<a href="${pageContext.servletContext.contextPath}/Accueil"><img src="" alt="logo ENI-Enchères"><h1>Eni-Enchères</h1></a>
	</header>
	
	<div >
		<p class="col-xs- col-lg-2 alert alert-danger"> ${erreur} </p>
	</div>

	<section class="col-xs-12">		
		<form action="${pageContext.servletContext.contextPath}/Connexion" method="post">
			<div>
				<label for="identifiant" class="col-xs-3">Identifiant :</label>
				<input type="text" id="identifiant" name="pseudo" size="30" required/>
				<!-- name = parametre envoyé a la servlet -->	
			</div>
			<div class="col-xs-12">	
				<label for="mot_de_passe">Mot de passe :</label>
				<input type="password" id="mot_de_passe" name="mot_de_passe" size="20" required/><br>
			</div>		
			<div>
				<input class="col-xs-6" type="submit" value="Connexion"/>		
				<div>
					<input type="checkbox" id="se_souvenir" name="se_souvenir">
					<label for="se_souvenir">Se souvenir de moi</label><br>		
					<a href="">Mot de passe oublié</a><br>
				</div>
			</div>		
			<a class="col-xs-12" href="${pageContext.servletContext.contextPath}/Inscription"><button>Créer un compte</button></a>
		</form>
	</section>
	<footer>
		<a href="https://www.flaticon.com/fr/icones-gratuites/encheres" title="enchères icônes">Enchères icônes créées par Smashicons - Flaticon</a>
	</footer>
</body>
</html>