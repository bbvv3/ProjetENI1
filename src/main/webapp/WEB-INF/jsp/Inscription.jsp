<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
 <meta name="author" content="">
</head>
<body>
	<header>
	<h1>Eni-Enchères</h1>
	</header>
	<div>
		<h2>Créer un compte</h2>
		<div>
			<p> ${erreur } </p>
		</div>
		<form action="${pageContext.servletContext.contextPath}/Inscription" method="post"><br>
			<label for="id_pseudo">Pseudo* : </label><input type="text" id="id_pseudo" name="pseudo" pattern="^[a-z0-9_-]{5,10}$" required/><br>
			<label for="id_nom">Nom* : </label><input type="text" id="id_nom" name="nom" size="30" required/><br>
			<label for="id_prenom">Prenom* : </label><input type="text" id="id_prenom" name="prenom" size="30" required/><br>
			<label for="id_mail">Email* : </label><input type="email" id="id_mail" name="mail" pattern="[^@ \t\r\n]+@[^@ \t\r\n]+\.[^@ \t\r\n]+" required/><br>
			<label for="id_tel">Téléphone : </label><input type="tel" id="id_tel" name="tel" pattern="^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$" /><br>
			<label for="id_rue">Rue* : </label><input type="text" id="id_rue" name="rue" size="40" required/><br>
			<label for="id_codePostal">Code postal* : </label><input type="text" id="id_codePostal" name="codePostal" size="5" required/><br>
			<label for="id_ville">Ville* : </label><input type="text" id="id_ville" name="ville" size="50" required/><br>
			<label for="id_mdp">Mot de passe* : </label><input type="password" id="id_mdp" name="mdp" pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,20}$" required/><br>
			<label for="id_mdp2">Confirmation* : </label><input type="password" id="id_mdp2" name="mdp2" pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,20}$" required/><br>
			<input type="submit" value="Créer"/>
			<input type="reset" value="Annuler"/>
		</form>
	</div>
</body>
</html>