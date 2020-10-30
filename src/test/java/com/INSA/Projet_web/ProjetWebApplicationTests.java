package com.INSA.Projet_web;

import com.INSA.Projet_web.Base.Criterias.CriteriaApp;
import com.INSA.Projet_web.Base.Criterias.CriteriaRec;
import com.INSA.Projet_web.Base.Intermediary.Enums.Domains;
import com.INSA.Projet_web.Base.Intermediary.Enums.LangueLvl;
import com.INSA.Projet_web.Base.Intermediary.Enums.StudiesLvl;
import com.INSA.Projet_web.Base.Intermediary.Language;
import com.INSA.Projet_web.Base.Intermediary.Location;
import com.INSA.Projet_web.Base.Users.Apprentice;
import com.INSA.Projet_web.Base.Users.Company;
import com.INSA.Projet_web.Base.Users.Recruiter;
import com.INSA.Projet_web.Services.AppCriteriaResource;
import com.INSA.Projet_web.Services.ApprenticeResource;
import com.INSA.Projet_web.Services.RecruitCriteriaResource;
import com.INSA.Projet_web.Services.RecruiterResource;
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
	@Autowired
	RecruiterResource recr;
	@Autowired
	RecruitCriteriaResource crrecr;

	@Test
	void testUploadapp() {
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
	void testUploadRec(){
		Recruiter testrec=new Recruiter(
				"Patate",
				"John",
				LocalDate.parse("1982-06-14"),
				"PJohn@gmail.com",
				"06587525",
				new Location("Paris 16ème Arrondissement",75016),
				new Company("NordVPN",new ArrayList<Location>(),"325 696 375 00030","325 696 375",new ArrayList<Recruiter>())
		);
		recr.uploadrecruiter(testrec);
	}

	@Test
	void testUploadCriteriaApp(){
		Long idapp=(long)6;
		Apprentice testgetapp=appr.downloadapprentice(idapp);
		List<Location> locationscrapp=new ArrayList<>();
		locationscrapp.add(new Location("Lille",59000));
		List<Domains> domainscrapp=new ArrayList<>();
		domainscrapp.add(Domains.INFO);
		CriteriaApp criteria_apptest= new CriteriaApp(testgetapp,locationscrapp,domainscrapp,12,24);
		appcrr.uploadappcriteria(criteria_apptest);
	}
	@Test
	void testUploadCriteriaRec(){
		Long idrec=(long)1;
		Recruiter testgetrec = recr.downloadrecruiter(idrec);
		List<Domains> domainsscrrec = new ArrayList<>();
		domainsscrrec.add(Domains.INFO);
		List<StudiesLvl> studiesLvlscrrec = new ArrayList<>();
		studiesLvlscrrec.add(StudiesLvl.BAC5);studiesLvlscrrec.add(StudiesLvl.BAC3);
		List<Language> languagescrrec = new ArrayList<>();
		languagescrrec.add(new Language("Anglais",LangueLvl.B2));
		CriteriaRec crrec = new CriteriaRec(testgetrec,domainsscrrec,studiesLvlscrrec,12,36,languagescrrec,false,false);
		crrecr.uploadrecruitcriteria(crrec);
	}

	@Test
	void testDelete(){
		//Long idapp=(long)1;
		Long idrec=(long)1;
		//Apprentice testgetapp=appr.downloadapprentice(idapp);
		Recruiter testgetrec=recr.downloadrecruiter(idrec);
		//appr.deleteapprentice(testgetapp);
		recr.deleterecruiter(testgetrec);
	}
}
