<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
</head>
<body>
	<header>
	<h1>Eni-Enchères</h1>
	</header>
	<div>
		<h2>Créer un compte</h2>
		<form action="" method="post">
			<label for="id_pseudo">Pseudo* : </label><input type="text" id="id_pseudo" name="pseudo" size="10" required/>
			<label for="id_nom">Nom* : </label><input type="text" id="id_nom" name="nom" size="30" required/>
			<label for="id_prenom">Prenom* : </label><input type="text" id="id_prenom" name="prenom" size="30" required/>
			<label for="id_mail">Email* : </label><input type="email" id="id_mail" name="mail" size="50" required/>
			<label for="id_tel">Téléphone* : </label><input type="tel" id="id_tel" name="tel" size="15" required/>
			<label for="id_rue">Rue* : </label><input type="text" id="id_rue" name="rue" size="40" required/>
			<label for="id_codePostal">Code postal* : </label><input type="text" id="id_codePostal" name="codePostal" size="5" required/>
			<label for="id_ville">Ville* : </label><input type="text" id="id_ville" name="ville" size="50" required/>
			<label for="id_mdp">Mot de passe* : </label><input type="password" id="id_mdp" name="mdp" required/>
			<label for="id_mdp2">Confirmation* : </label><input type="password" id="id_mdp2" name="mdp2" required/>
			<input type="submit" value="Créer"/>
			<input type="reset" value="Annuler"/>
		</form>
	</div>
</body>
</html>