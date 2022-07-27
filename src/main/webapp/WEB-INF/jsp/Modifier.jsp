<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	
	<div>
		<p> ${erreur } </p>
	</div>
	
	<form action="${pageContext.servletContext.contextPath}/Modifier" method="post">
			<div>
				<label for="id_pseudo">Pseudo : </label><input type="text" id="id_pseudo" name="pseudo" value="${utilisateur.getPseudo()}" pattern="^[a-z0-9_-]{5,10}$" />
			</div>
			<div>
				<label for="id_nom">Nom : </label><input type="text" id="id_nom" name="nom" value="${utilisateur.getNom()} "/>
			</div>
			<div>
				<label for="id_prenom">Prenom : </label><input type="text" id="id_prenom" name="prenom" value="${utilisateur.getPrenom()}"/>
			</div>
			<div>
				<label for="id_mail">Email : </label><input type="email" id="id_mail" name="email" value="${utilisateur.getEmail()}" pattern="[^@ \t\r\n]+@[^@ \t\r\n]+\.[^@ \t\r\n]+"/>
			</div>
			<div>
				<label for="id_tel">Téléphone : </label><input type="tel" id="id_tel" name="tel" value="${utilisateur.getTelephone()}" pattern="^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$"/>
			</div>
			<div>
				<label for="id_rue">Rue : </label><input type="text" id="id_rue" name="rue" value="${utilisateur.getRue()}"/>
			</div>
			<div>
				<label for="id_codePostal">Code postal : </label><input type="text" id="id_codePostal" name="code_postal" value="${utilisateur.getCode_postal()}"/>
			</div>
			<div>
				<label for="id_ville">Ville : </label><input type="text" id="id_ville" name="ville" value="${utilisateur.getVille()}"/>
			</div>
			<div>
				<label for="id_motDePasse">Mot de passe : </label><input type="password" id="id_motDePasse" name="mot_de_passe" value="${utilisateur.getMot_de_passe()}" pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,20}$"/>
			</div>
			<div>
				<label for="id_conf_motDePasse">Confirmation du mot de passe : </label><input type="password" id="id_conf_motDePasse" name="conf_mot_de_passe" value="${utilisateur.getMot_de_passe()}" pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,20}$"/>
			</div>
			
			<div>
				<input type="submit" value="Enregistrer"/>
			</div>	
		
			<a href=""><button>Supprimer mon compte</button></a>
			<a href="${pageContext.servletContext.contextPath }/Profil"><button>Retour</button></a>
	</form>

</html>