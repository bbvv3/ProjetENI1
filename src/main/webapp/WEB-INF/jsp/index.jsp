<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des enchères</title>
</head>
<body>
		
	<header>
		<h1>Eni-Enchères</h1>
		<!--<c:if test="${connect}">
			<p><a href="">S'inscrire</a> - <a href=""> Se connecter</a></p>
		</c:if>-->
		
	</header>
	
	
	
	<h2>Filtres:</h2>
	
	<form action="<%request.getContextPath();%>/Acceuil" method=post>
	
	<label for="categorie">Catégorie : </label>
        <select name="article" id="categorie" >
          	<option value="informatique">Informatique</option>
            <option value="ameublement">Ameublement</option>
            <option value="vetement">Vêtement</option>
            <option value="sport_loisir">Sport et Loisirs</option>
        </select><br>
        
        <input type="search" id="identifiant" name="identifiant" size="30" placeholder="le nom de l'article"/><br>
        
        <input type="submit" value="Rechercher"/><br>
        
     
  
  </form>	
	
	
	
		
		
</body>
</html>