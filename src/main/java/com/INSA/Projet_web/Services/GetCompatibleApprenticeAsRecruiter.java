/*package com.INSA.Projet_web.Services;

import com.INSA.Projet_web.Base.Criterias.Criteria_App;
import com.INSA.Projet_web.Base.Criterias.Criteria_Rec;
import com.INSA.Projet_web.Base.Intermediary.Enums.StudiesLvl;
import com.INSA.Projet_web.Base.Intermediary.Language;
import com.INSA.Projet_web.Base.Intermediary.Location;
import com.INSA.Projet_web.Base.Users.Apprentice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.sql.Date;
import java.util.List;

@Path("getAppentice")
public class GetCompatibleApprenticeAsRecruiter {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Apprentice getApp(@QueryParam("criterias_rec") Criteria_Rec criteria_rec,
                             @QueryParam("name") String name,
                             @QueryParam("firstname") String firstname,
                             @QueryParam("birthday") Date birthday,
                             @QueryParam("mail") String mail,
                             @QueryParam("phonenum") String phonenum,
                             @QueryParam("location") Location location,
                             @QueryParam("studiesLvl") StudiesLvl studiesLvl,
                             @QueryParam("diplomas") List<String> diplomas,
                             @QueryParam("cv") File cv,
                             @QueryParam("permisb") boolean permisb,
                             @QueryParam("vehicule") boolean vehicule,
                             @QueryParam("address") String address,
                             @QueryParam("languages") List<Language> languages,
                             @QueryParam("experience") List<String> experience,
                             @QueryParam("projet_pro") String projet_pro,
                             @QueryParam("criteria") Criteria_App criteria) {
        return new Apprentice(name, firstname, birthday, mail, phonenum, location, studiesLvl, diplomas, cv, permisb, vehicule, address, languages, experience, projet_pro, criteria);
    }
}
*/