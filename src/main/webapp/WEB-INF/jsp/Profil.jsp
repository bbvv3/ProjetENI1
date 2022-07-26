<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profil</title>
</head>
<body>
	<header>
	<h1>Eni-Enchères</h1>
	</header>
	
	
	<div>
		<h2>Mon Profil</h2>
	
			<div>
				<p>
			<!-- attribut récupérer de l'utilsateur avec le setAttribut de la servlet -->
				Pseudo : ${utilisateur.getPseudo()}
				</p>
			</div>
			
			<div>
				<p>
				Nom : ${utilisateur.getNom()}
				</p>
			</div>
			
			<div>
				<p>
				Prenom : ${utilisateur.getPrenom()}
				</p>
			</div>
			<div>
				<p>
				Email : ${utilisateur.getEmail()}
				</p>
			</div>
			
			<div>
				<p>
				Téléphone : ${utilisateur.getTelephone()}
				</p>
			</div>
			
			<div>
				<p>
				Rue : ${utilisateur.getRue()}
				</p>
			</div>
			
			<div>
				<p>
				Code postal : ${utilisateur.getCode_postal()}
				</p> 
			</div>
			
			<div>
				<p>
				Ville : ${utilisateur.getVille()}
			 	</p>
			</div>
			<div>
			<a href="${pageContext.servletContext.contextPath }/Modifier"><button>Modifier</button></a>
			</div>
		
	</div>

</body>
</html>