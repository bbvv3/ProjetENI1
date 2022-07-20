<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
	<header>
		<h1>Eni-Enchères</h1>
		<a href>S'inscrire - Se connecter</a>
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