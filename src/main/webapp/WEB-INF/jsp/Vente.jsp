<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vente</title>
</head>
<body>
		<header>
		<h1>Eni-Enchères</h1>
		</header>

		<h1>Détail vente</h1>
		
		<p>
		Description :
		</p>
		<p>
		Catégorie :
		</p>
		<p>
		Meilleure offrer :
		</p>
		<p>
		Mise à prix :
		</p>
		<p>
		Fin de l'enchère :
		</p>
		<p>
		Retrait :
		</p>
		<p>
		Vendeur :
		</p>
		
		<form method="post" action="">
		 <label for="id_proposition">Ma Proposition</label><br>
        <input type="number" name="proposition" id="id_proposition" min="" max="" step="1">
       	<input type="submit" value="Enchérir"/>
        </form> 
        
         <a href="${pageContext.servletContext.contextPath }/Accueil"><button>Back</button></a>
            
      
        
       














</body>
</html>