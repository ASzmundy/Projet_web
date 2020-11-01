$("#btn").click(function(){
	var name = document.getElementById("name").value;
  	var firstname = document.getElementById("firstname").value;
  	var birthday = document.getElementById("birthday").value;
  	var phonenum = document.getElementById("phonenum").value;
  	var address = document.getElementById("address").value;
	var mail = document.getElementById("mail").value;
	var locationname = document.getElementById("locationname").value;
	var locationcp = document.getElementById("locationcp").value;
	var studiesLvl = document.getElementById("studiesLvl").value;
 	var diplomasstring = document.getElementById("diplomasstring").value;
  	var languagename = document.getElementById("languagename").value;
	var experiencestring = document.getElementById("experiencestring").value;
	var projet_pro = document.getElementById("projet_pro").value;

	var apprentice = new Object();
	apprentice.name = name;
	apprentice.firstname = firstname;
	apprentice.birthday = birthday;
	apprentice.mail = mail;
	apprentice.phonenum = phonenum;

	var location = new Object();
	location.nom = locationname;
	location.cp = parseInt(locationcp);
	location.up = null

	apprentice.location = location;	
	apprentice.studieslvl = studiesLvl;
	apprentice.diplomas = diplomasstring.split(";");
	apprentice.permisb = permisb;
	apprentice.vehicule = vehicule;
	apprentice.address = address;

	var language = new Object();
  	language.name = languagename;
  	language.level = "C2";
 	var languages = [language];

	apprentice.languages = languages;
	apprentice.experience = experiencestring.split(";");
	apprentice.projet_pro = projet_pro;

	if ($('#permisb').is(":checked")) {
		apprentice.permisb = true;
	}else apprentice.permisb = false;
	if ($('vehicule').is(":checked")) {
		apprentice.vehicule = true;
	} else apprentice.vehicule = false;

	var apprenticeJSON=JSON.stringify(apprentice);

	$.ajax(
            {
            type: "POST",
            url:'http://localhost:8080/rest/apprentices',
            dataType:'json',
            contentType: 'application/json',
            async:true,
            data:apprenticeJSON,
            statusCode:{
                201:function(){
                    sessionStorage.setItem('mail_user', mail);
                    console.log("test");
                    window.location.replace("profilAlternant.html");
                },
                409:function(){
                    alert.text('Le mail est déjà pris');
                }
            }
			})
});
