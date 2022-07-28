<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profil</title>
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
	
	
	<div>
		<h1 id="titre">${utilisateur.getPseudo()}</h1>
	
			<div class="col-xs-12 marge insertion" >
				<p class="col-xs-4 marge">
			<!-- attribut récupérer de l'utilsateur avec le setAttribut de la servlet -->
				Pseudo : 
				</p>
				<p class="col-xs-8 marge">
				${utilisateur.getPseudo()}
				</p>
			</div>
			
			<div class="col-xs-12 marge insertion" >
				<p class="col-xs-4 marge">
				Nom : 
				</p>
				<p class="col-xs-8 marge">
				${utilisateur.getNom()}
				</p>
			</div>
			
			<div class="col-xs-12 marge insertion" >
				<p class="col-xs-4 marge">
				Prenom :
				</p>
				<p class="col-xs-8 marge">
				${utilisateur.getPrenom()}
				</p>
			</div>
			
			<div class="col-xs-12 marge insertion" >
				<p class="col-xs-4 marge">
				Email : 
				</p>
				
				<p class="col-xs-8 marge">
				${utilisateur.getEmail()}
				</p>
			</div>
			
			<div class="col-xs-12 marge insertion" >
				<p class="col-xs-4 marge">
				Téléphone : 
				</p>
				<p class="col-xs-8 marge">
				${utilisateur.getTelephone()}
				</p>
			</div>
			
			<div class="col-xs-12 marge insertion" >
				<p class="col-xs-4 marge">
				Rue :
				</p>
				<p class="col-xs-8 marge">
				${utilisateur.getRue()}
				</p>
			</div>
			
			<div class="col-xs-12 marge insertion" >
				<p class="col-xs-4 marge">
				Code postal : 
				</p> 
				<p class="col-xs-8 marge">
				${utilisateur.getCode_postal()}
				</p>
			</div>
			
			<div class="col-xs-12 marge insertion" >
				<p class="col-xs-4 marge">
				Ville :
			 	</p>
			 	<p class="col-xs-8 marge">
				${utilisateur.getVille()}
				</p>
			</div>
			
			<div class="col-xs-12 marge insertion" >
			<a href="${pageContext.servletContext.contextPath }/Modifier"><button id="btn-modif">Modifier</button></a>
			</div>
		
	</div>

</body>
</html>