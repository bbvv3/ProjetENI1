<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connexion</title>

<!-- Bootstrap CSS -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    
    <link href="css/connexion.css" rel="stylesheet">
</head>
<body class="container-fluid col-xs-8 col-xs-offset-2 bordure">

		<!--  <div>
            <span class="col-xs-12 visible-xs alert alert-danger">Extra small</span>
            <span class="col-sm-12 visible-sm alert alert-info">Small</span>
            <span class="col-md-12 visible-md alert alert-success">Medium</span>
            <span class="col-lg-12 visible-lg alert alert-warning">large</span>
        </div>
        <hr/> -->

	<header id="logolien" class="col-xs-12">
		<a href="${pageContext.servletContext.contextPath}/Accueil" class="col-xs-6">
			<img src="img/logo.png" alt="logo ENI-Enchères" class="col-xs-12">
		</a>
	</header>
	<div class="col-xs-12">
		<p class="col-xs-10 col-xs-offsset-1 col-lg-2"> ${erreur} </p>
	</div>

	<section class="col-xs-12  bordure">		
		<form action="${pageContext.servletContext.contextPath}/Connexion" method="post">
			<div id="divId" class="col-xs-12 bordure">
				<label for="identifiant" class="col-xs-4 bordure">Identifiant :</label>
				<input type="text" id="identifiant" name="pseudo" size="30" class="col-xs-8" required/>
				<!-- name = parametre envoyé a la servlet -->	
			</div>
			<div id="divMdp" class="col-xs-12 bordure">	
				<label for="mot_de_passe" class="col-xs-4 bordure">Mot de passe :</label>
				<input type="password" id="mot_de_passe" name="mot_de_passe" size="20" class="col-xs-8" required/><br>
			</div>		
			
			<div id="divGestion" class="col-xs-12 bordure espacement" >
				<div id="divConnexion" class="col-xs-5">
					<input id="btnConnexion" class="col-xs-12" type="submit" value="Connexion"/>		
				</div>
				<div id="gestionMdp" class="col-xs-6 bordure">
					<input type="checkbox" id="se_souvenir" name="se_souvenir">
					<label for="se_souvenir">Se souvenir de moi</label><br>		
					<a href="">Mot de passe oublié</a><br>
				</div>
			</div>		
			<a id="lienInscription" class="col-xs-12 bordure espacement" href="${pageContext.servletContext.contextPath}/Inscription"><button id="btnInscription" class="col-xs-12 bordure">Créer un compte</button></a>
		</form>
	</section>
</body>
</html>