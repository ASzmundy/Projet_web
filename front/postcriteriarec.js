$("#btn").click(function(){
	var mail=sessionStorage.getItem('mail_user');
	var urlget='http://localhost:8080/rest/recruiters/'+mail;
	$.get(urlget,id);
	var criteria=new Object();
	urlget='http://localhost:8080/rest/recruiters/'+id;
	$.get(urlget,recruiter);
	var studiesLvl = document.getElementbyId("studiesLvl")
	var domain = document.getElementbyId("domaine");
	var language = new Object;
	language.name=document.getElementbyId("languagename");
	language.level=document.getElementbyId("languagelvl");
	criteria.duration_min=document.getElementbyId("dureemin");
	criteria.duration_max=document.getElementbyId("dureemax");
	if ($('#permisb').is(":checked")) {
		criteria.permisb = true;
	}else criteria.permisb = false;
	if ($('vehicule').is(":checked")) {
		criteria.vehicule = true;
	} else criteria.vehicule = false;

	criteriaJSON=JSON.stringify(criteria);

	$.ajax(
            {
            type: "POST",
            url:'http://localhost:8080/rest/reccriterias',
            dataType:'json',
            contentType: 'application/json',
            async:true,
            data:criteriaJSON,
            statusCode:{
                201:function(){
                    window.alert('Envoi réussi');
                }
            }
      })
});