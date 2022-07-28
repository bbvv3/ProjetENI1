<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modifications</title>
<!-- Bootstrap CSS -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    
    <link href="css/modifier.css" rel="stylesheet">
</head>
<body class="container-fluid col-xs-8 col-xs-offset-2 bordure">
	
	<header id="logolien" class="col-xs-12">
		<a href="${pageContext.servletContext.contextPath}/Accueil" class="col-xs-6">
			<img src="img/logo.png" alt="logo ENI-Enchères" class="col-xs-12">
		</a>
	</header>
	
	<div class="col-xs-12">
		<p class="col-xs-10 col-xs-offsset-1 col-lg-2"> ${erreur} </p>
	</div>
	
	
		<h1 id="titre">Mon Profil</h1>
	
				
	<section class="col-xs-12 marge">		
	<form action="${pageContext.servletContext.contextPath}/Modifier" method="post">
			<div    class="col-xs-12 marge insertion" >
				<label for="id_pseudo" class="col-xs-4 marge">Pseudo : </label>
				<input class="col-xs-8 marge" type="text" id="id_pseudo"  name="pseudo" value="${utilisateur.getPseudo()}" pattern="^[a-z0-9_-]{5,10}$" />
			</div>
			<div  class="col-xs-12 marge insertion" >
				<label for="id_nom" class="col-xs-4 marge">Nom : </label>
				<input class="col-xs-8 marge" type="text" id="id_nom" name="nom" value="${utilisateur.getNom()} "/>
			</div>
			<div  class="col-xs-12 marge insertion">
				<label for="id_prenom" class="col-xs-4 marge">Prenom : </label>
				<input class="col-xs-8 marge" type="text" id="id_prenom" name="prenom" value="${utilisateur.getPrenom()}"/>
			</div>
			<div  class="col-xs-12 marge insertion">
				<label for="id_mail" class="col-xs-4 marge">Email : </label>
				<input class="col-xs-8 marge" type="email" id="id_mail" name="email" value="${utilisateur.getEmail()}" pattern="[^@ \t\r\n]+@[^@ \t\r\n]+\.[^@ \t\r\n]+"/>
			</div>
			<div  class="col-xs-12 marge insertion">
				<label for="id_tel" class="col-xs-4 marge">Téléphone : </label>
				<input class="col-xs-8 marge" type="tel" id="id_tel" name="telephone" value="${utilisateur.getTelephone()}" pattern="^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$"/>
			</div>
			<div  class="col-xs-12 marge insertion">
				<label for="id_rue" class="col-xs-4 marge">Rue : </label>
				<input class="col-xs-8 marge" type="text" id="id_rue" name="rue" value="${utilisateur.getRue()}"/>
			</div>
			<div  class="col-xs-12 marge insertion">
				<label for="id_codePostal" class="col-xs-4 marge">Code postal : </label>
				<input class="col-xs-8 marge" type="text" id="id_codePostal" name="code_postal" value="${utilisateur.getCode_postal()}"/>
			</div>
			<div  class="col-xs-12 marge insertion">
				<label for="id_ville" class="col-xs-4 marge">Ville : </label>
				<input class="col-xs-8 marge" type="text" id="id_ville" name="ville" value="${utilisateur.getVille()}"/>
			</div>
			<div  class="col-xs-12 marge insertion">
				<label for="id_motDePasse" class="col-xs-4 marge">Mot de passe : </label>
				<input class="col-xs-8 marge" type="password" id="id_motDePasse" name="mot_de_passe" value="${utilisateur.getMot_de_passe()}" pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,20}$"/>
			</div >
			<div  class="col-xs-12 marge insertion">
				<label for="id_conf_motDePasse" class="col-xs-4 marge">Confirmation : </label>
				<input class="col-xs-8 marge" type="password" id="id_conf_motDePasse" name="conf_mot_de_passe" value="${utilisateur.getMot_de_passe()}" pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,20}$"/>
			</div>
			<div  class="col-xs-12 insertion">
				<p  class="col-xs-4 marge bold">Crédit : </p>
				<p class="col-xs-8 marge">${utilisateur.getCredit()}</p>
			</div>
			
			<div id="m_ex" class="col-xs-12 marge">
				<input class="col-xs-2 marge" id="btm_enr" type="submit" value="Enregistrer"/>
				<a href="${pageContext.servletContext.contextPath }/Modifier?suppr=1"><button class="col-xs-6 marge"  id="btm_sup">Supprimer mon compte</button></a>
				<a href="${pageContext.servletContext.contextPath }/Profil"><button class="col-xs-2 marge" id="btm_ret">Retour</button></a>
			</div>		
	</form>
	</section>
</html>