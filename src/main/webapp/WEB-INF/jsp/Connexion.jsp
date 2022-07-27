<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connexion</title>
</head>
<body>

	<header>
		<a href="${pageContext.servletContext.contextPath}/Acceuil"><img src="" alt="logo ENI-Enchères"><h1>Eni-Enchères</h1></a>
	</header>
	
	<div>
		<p> ${erreur} </p>
	</div>

			
	<form action="${pageContext.servletContext.contextPath}/Connexion" method="post">
		<label for="identifiant">Identifiant :</label>
		<input type="text" id="identifiant" name="pseudo" size="30" required/><br>
		<!-- name = parametre envoyé a la servlet -->	
			
		<label for="mot_de_passe">Mot de passe :</label>
		<input type="password" id="mot_de_passe" name="mot_de_passe" size="20" required/><br>
				
		<input type="submit" value="Connexion"/>
				
				
		<input type="checkbox" id="se_souvenir" name="se_souvenir">
		<label for="se_souvenir">Se souvenir de moi</label><br>
				
		<a href="">Mot de passe oublié</a><br>
				
		<input type="submit" value="Créer un compte"/>
	</form>
	<footer>
		<a href="https://www.flaticon.com/fr/icones-gratuites/encheres" title="enchères icônes">Enchères icônes créées par Smashicons - Flaticon</a>
	</footer>
</body>
</html>