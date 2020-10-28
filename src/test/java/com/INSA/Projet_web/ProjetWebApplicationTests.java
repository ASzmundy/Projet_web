package com.INSA.Projet_web;

import com.INSA.Projet_web.Base.Criterias.CriteriaApp;
import com.INSA.Projet_web.Base.Intermediary.Enums.Domains;
import com.INSA.Projet_web.Base.Intermediary.Enums.LangueLvl;
import com.INSA.Projet_web.Base.Intermediary.Enums.StudiesLvl;
import com.INSA.Projet_web.Base.Intermediary.Language;
import com.INSA.Projet_web.Base.Intermediary.Location;
import com.INSA.Projet_web.Base.Users.Apprentice;
import com.INSA.Projet_web.Services.AppCriteriaResource;
import com.INSA.Projet_web.Services.ApprenticeResource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ProjetWebApplicationTests {
	@Autowired
	ApprenticeResource appr;
	@Autowired
	AppCriteriaResource appcrr;

	@Test
	void testUpload() {
		Apprentice testapp=new Apprentice(
				"Testman",
				"Kevin",
				LocalDate.parse("1995-02-15"),
				"ktest@outlook.fr",
				"069577033",
				new Location("Paris 1er Arrondissement",75001),
				StudiesLvl.BAC5,
				new ArrayList<String>(),
				true,
				false,
				"105 rue Pompidou",
				new ArrayList<Language>(),
				new ArrayList<String>(),
				"Developpeur"
		);

		testapp.getLanguages().add(new Language("Arabe", LangueLvl.C2));
		testapp.getDiplomas().add("Master sociologie");
		testapp.getExperience().add("Serveur macdo");
		appr.uploadapprentice(testapp);
	}

	@Test
	void testUploadCriteria(){
		Long idapp=(long)18;
		Apprentice testgetapp=appr.downloadapprentice(idapp);
		List<Location> locationscrapp=new ArrayList<>();
		locationscrapp.add(testgetapp.getLocation());
		List<Domains> domainscrapp=new ArrayList<>();
		domainscrapp.add(Domains.INFO);
		CriteriaApp criteria_apptest= new CriteriaApp(testgetapp,locationscrapp,domainscrapp,12,24);
		appcrr.uploadappcriteria(criteria_apptest,testgetapp.getId());
	}

	@Test
	void testDelete(){
		Long idapp=(long)18,idcrapp=(long)21;
		Apprentice testgetapp=appr.downloadapprentice(idapp);
		appr.deleteapprentice(testgetapp);
		appcrr.deleteCriteriaApp(idcrapp);
	}
}
