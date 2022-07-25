<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modifications</title>
</head>
<body>
	
	<header>
		<h1>Eni-Enchères</h1>
	</header>
	
	
	
	<form action="${pageContext.servletContext.contextPath}/Modifier" method="post">
			<div>
				<label for="id_pseudo">Pseudo : </label><input type="text" id="id_pseudo" name="pseudo"/>
			</div>
			<div>
				<label for="id_nom">Nom : </label><input type="text" id="id_nom" name="nom" />
			</div>
			<div>
				<label for="id_prenom">Prenom : </label><input type="text" id="id_prenom" name="prenom"/>
			</div>
			<div>
				<label for="id_mail">Email : </label><input type="email" id="id_mail" name="mail" />
			</div>
			<div>
				<label for="id_tel">Téléphone : </label><input type="tel" id="id_tel" name="tel" />
			</div>
			<div>
				<label for="id_rue">Rue : </label><input type="text" id="id_rue" name="rue"/>
			</div>
			<div>
				<label for="id_codePostal">Code postal : </label><input type="text" id="id_codePostal" name="codePostal"/>
			</div>
			<div>
				<label for="id_ville">Ville : </label><input type="text" id="id_ville" name="ville"/>
			</div>
			
			<div>
				<input type="submit" value="Modifier"/>
			</div>
		
	</form>
	


</html>