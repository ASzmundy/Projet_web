$("#btn").click(function(){
	var name = document.getElementById("name").value;
  	var firstname = document.getElementById("firstname").value;
  	var birthday = document.getElementById("birthday").value;
  	var phonenum = document.getElementById("phonenum").value;
  	var mail = document.getElementById("mail").value;
  	var locationname = document.getElementById("locationname").value;
  	var locationcp = document.getElementById("locationcp").value;
  	var companyname = document.getElementById("companyname").value;
  	var siret = document.getElementById("siret").value;
  	var siren = document.getElementById("siren").value;

  	var recruiter = new Object();
  	recruiter.name = name;
  	recruiter.firstname = firstname;
  	recruiter.birthday = birthday;
  	recruiter.mail = mail;
  	recruiter.phonenum = phonenum;

	var company = new Object();
  	company.name = companyname;
  	company.locations = new Array();
  	company.siret = siret;
  	company.siren = siren;

  	var location = new Object();
  	location.nom = locationname;
  	location.cp = parseInt(locationcp);
  	location.up = null

  	recruiter.location = location;
	company.locations.push(location);
	recruiter.company=company;

  recruiterJSON=JSON.stringify(recruiter);

	$.ajax(
            {
            type: "POST",
            url:'http://localhost:8080/rest/recruiters',
            dataType:'json',
            contentType: 'application/json',
            async:true,
            data:recruiterJSON,
            statusCode:{
                201:function(){
                    sessionStorage.setItem('mail_user', mail);
                    console.log("test");
                    window.location.replace("profilRecruteur.html");
                },
                409:function(){
                    alert.text('Le mail est déjà pris');
                }
            }
      })
});