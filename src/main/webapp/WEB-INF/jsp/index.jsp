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
		<a href="${pageContext.servletContext.contextPath}/Acceuil"><img src="" alt="logo ENI-Enchères"><h1>Eni-Enchères</h1></a>
			<c:if test="${id == null}">
				<p><a href="${pageContext.servletContext.contextPath}/Inscription">S'inscrire</a> - <a href="${pageContext.servletContext.contextPath}/Connexion"> Se connecter</a></p>
				<h2>Filtres:</h2>
				</header>
				<form action="${pageContext.servletContext.contextPath}/Acceuil" method=post>
			</c:if>
			<c:if test="${id != null}">
				<ul>
					<li><a href="${pageContext.servletContext.contextPath}/VendreArticle">Vendre un article</a></li>
					<li><a href="${pageContext.servletContext.contextPath}/Profil">Mon profil</a></li>
					<li><a href="${pageContext.servletContext.contextPath}/Accueil?logout=1">Deconnexion</a></li>
				</ul>
				<h2>Filtres:</h2>
				</header>
				<form action="${pageContext.servletContext.contextPath}/Acceuil" method=post>
					<ul>
						<li><input type="radio" id="idAchats" name="achatVente" value="achats" onchange="coche()" checked><label for="idAchats">Achats</label>
							<ul>
								<li><input type="checkbox" class="checkAchat" id="idEncheresOuvertes" name="etat1" ><label for="idEncheresOuvertes" >enchères ouvertes</label></li>
								<li><input type="checkbox" class="checkAchat" id="idEncheresEnCours" name="etat2" ><label for="idEncheresEnCours">mes enchères en cours</label></li>
								<li><input type="checkbox" class="checkAchat" id="idEncheresRemportees" name="etat3" ><label for="idEncheresRemportees">mes enchères remportées</label></li>
							</ul>
						</li>
						<li><input type="radio" id="idVentes" name="achatVente" value="ventes"><label for="idVentes">Mes Ventes</label>
							<ul>
								<li><input type="checkbox" class="checkVente" id="idVentesEnCours" name="etat1" disabled><label for="idVentesEnCours">mes ventes en cours</label></li>
								<li><input type="checkbox" class="checkVente" id="idVentesNonDebutees" name="etat2" disabled><label for="idVentesNonDebutees">ventes non debutées</label></li>
								<li><input type="checkbox" class="checkVente" id="idVentesTerminees" name="etat3" disabled><label for="idVentesTerminees">ventes terminée</label></li>
							</ul>
						</li>
					</ul>
				</form>
			</c:if>
	<label for="idCategorie">Catégorie : </label>
        <select name="categorie" id="idCategorie" >
        	<option value="0">Toutes</option>
        	<c:forEach var="c" items="${categories}"><option value="${c.getNo_categorie()}">${c.getLibelle()}</option></c:forEach>
        </select><br>
        
        <input type="search" id="identifiant" name="identifiant" size="30" placeholder="le nom de l'article"/><br>
        
        <input type="submit" value="Rechercher"/><br>
  </form>	
	<c:forEach var="a" items="${articles}">
		<div>
			<img src="" alt="image de l'article">
			<div>
				<h3>${a.getNom_article()}</h3>
				<p>Prix : ${a.getPrix_vente()} points</p>
				<p>Fin de l'enchère : ${a.getDate_fin_encheres()} </p>
				<p>Retrait : ${a.getVendeur().getRue()} ${a.getVendeur().getCode_postal()} ${a.getVendeur().getVille()}</p>
				<p>Vendeur : ${a.getVendeur().getPseudo()} </p>
			</div>
		</div>
	</c:forEach>
	
	<script type="text/javascript">
		function coche(){
			var radioA = document.getElementById("idAchats");
			var radioV = document.getElementById("idVentes");
			
			var checkA1 = document.getElementById("idEncheresOuvertes");
			var checkA2 = document.getElementById("idEncheresEnCours");
			var checkA3 = document.getElementById("idEncheresRemportees");
			var checkV1 = document.getElementById("idVentesEnCours");
			var checkV2 = document.getElementById("idVentesNonDebutees");
			var checkV3 = document.getElementById("idVentesTerminees");
			
			if(radioA.checked){
				checkA1.removeAttribute('disabled');
				checkA2.removeAttribute('disabled');
				checkA3.removeAttribute('disabled');
				checkV1.setAttribute('disabled', '');
				checkV2.setAttribute('disabled', '');
				checkV3.setAttribute('disabled', '');
			}else{
				checkA1.setAttribute('disabled', '');
				checkA2.setAttribute('disabled', '');
				checkA3.setAttribute('disabled', '');
				checkV1.removeAttribute('disabled');
				checkV2.removeAttribute('disabled');
				checkV3.removeAttribute('disabled');
			}					
		}
	</script>
	<footer>
		<a href="https://www.flaticon.com/fr/icones-gratuites/encheres" title="enchères icônes">Enchères icônes créées par Smashicons - Flaticon</a>
	</footer>	
</body>
</html>