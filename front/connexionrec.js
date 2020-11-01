$("#btn").click(function(){
	var mail = document.getElementById("mail").value;
	sessionStorage.setItem("mail_user",mail);
	window.location.href = "profilRecruteur.html";
});

$("#btnins").click(function(){
	window.location.href = "inscriptionRecruteur.html";
})