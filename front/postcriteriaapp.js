$("#btn").click(function(){
	var mail=sessionStorage.getItem('mail_user');
	var urlget='http://localhost:8080/rest/apprentices/'+mail;
	$.get(urlget,id);
	var criteria=new Object();
	urlget='http://localhost:8080/rest/apprentices/'+id;
	$.get(urlget,apprentice);
	criteria.apprentice= apprentice;
	var locationstring = document.getElementbyId("locationname")
	criteria.locations=locationstring.split(";");
	var domainstring = document.getElementbyId("domaine");
	criteria.domains=domainstring.split(";");
	criteria.duration_min=document.getElementbyId("dureemin");
	criteria.duration_max=document.getElementbyId("dureemax");

	criteriaJSON=JSON.stringify(criteria);

	$.ajax(
            {
            type: "POST",
            url:'http://localhost:8080/rest/appcriterias',
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