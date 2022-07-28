<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nouvelle vente</title>
</head>
<body>
	<header>
	<h1>Eni-Enchères</h1>
	</header>
	
	<h1>Nouvelle vente</h1>
	
	<form action="${pageContext.servletContext.contextPath}/NouvelleVente" method="post">
		<div>
		<label for="id_article">Article :</label>
		<input type="text" id="id_article" name="article" size="30" value="${article.getNom_article()}" pattern="^[a-z0-9_-]{5,10}$"/>
		</div>
		
		<div>
		<label for="idCategorie">Catégorie : </label>
        <select name="categorie" id="idCategorie" >
        <c:forEach var="c" items="${categories}">
        <option value="${c.getNo_categorie()}">${c.getLibelle()}</option>
        </c:forEach>
        </select>
		</div>
		
		<div>
		<label for="id_description">Description :</label>
		<textarea id="id_description" name="description" >
		300 caractères maximum
		</textarea>
		</div>
	
		<div>
		<label for="id_photo">Photo de l'article :</label>
		<input type="file" id="id_photo" name="photo"/>
		</div>

		<div>
		 <label for="id_prix_initial">Prix initial :</label>
        <input type="number" name="prix_initial" id="id_prix_initial"  min="1" max="" step="1">
		</div>
		
		<div>
		<label for="id_deb_enchere">Début de l'enchère :</label>
		<input type="date" id="id_deb_enchere" name="deb_enchere" min="" max="">
		</div>
		
		<div>
		<label for="id_fin_enchere">Fin de l'enchère :</label>
		<input type="date" id="id_fin_enchere" name="fin_enchere"   min="" max="">
		</div>
		
	</form>
		<div>
			<p>Retrait :  ${utilisateur.getRue()}
						  ${utilisateur.getVille()}
						  ${utilisateur.getCode_postal()}
			</p>
		</div>
		
		<div>
		<input type="submit" value="Enregistrer"/>
		<input type="reset" value="Annuler"/>
		</div>
	
	
	

</body>
</html>