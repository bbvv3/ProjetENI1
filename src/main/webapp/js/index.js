(function chargement(){
	
	let rd_achat = document.getElementById("idAchats");
	
	rd_achat.addEventListener("change",coche)
})();

function coche(event){
	let ck_achat = document.getElementsByClassName("checkAchat");
	let ck_vente = document.getElementsByClassName("checkVente");
	
	let achatCoche = event.currentTarget.checked;
	
	for (let i = 0; i < ck_achat.length; i++) {
  		ck_achat[i].disabled = !achatCoche;
  		ck_vente[i].disabled = achatCoche;
	}
}
