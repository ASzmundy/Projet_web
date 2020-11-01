$("#btn").click(function(){
	var mail = document.getElementById("mail").value;
	sessionStorage.setItem("mail_user", mail);
	window.location.href = "profilAlternant.html";
});

$("#btnins").click(function(){
window.location.href = "inscriptionAlternant.html"
})