function coche(radio,checkon,checkoff){
	if(radio.checked == true){
		document.getElementsByClassName(checkon).removeAttribute("disabled");
		document.getElementsByClassName(checkoff).setAttribute("disabled", "disabled");
	}else{
		document.getElementsByClassName(checkon).setAttribute("disabled", "disabled");
		document.getElementsByClassName(checkoff).removeAttribute("disabled");
	}
}