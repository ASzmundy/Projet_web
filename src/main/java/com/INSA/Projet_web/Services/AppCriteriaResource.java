package com.INSA.Projet_web.Services;

import com.INSA.Projet_web.Base.Criterias.CriteriaApp;
import com.INSA.Projet_web.Repos.CriteriaAppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Service
@Path("/appcriterias")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AppCriteriaResource {
    @Autowired
   private CriteriaAppRepo repo;
    @Autowired
    private ApprenticeResource ressourceapp;

    @POST
    public void uploadappcriteria(CriteriaApp criteria_app, Long id_app){
        ressourceapp.downloadapprentice(id_app)
        criteria_app.setApprentice();

        repo.save(criteria_app);
    }

    @GET
    @Path("/{ID_CrApp}")
    public CriteriaApp downloadCriteriaApp(@PathParam("ID_CrApp") Long id_crapp){
        if(repo.existsById(id_crapp)) return repo.findById(id_crapp).get();
        else return null;
    }

    public void deleteCriteriaApp(Long id_crapp){
        CriteriaApp crapp=repo.findCriteriaAppByCrappid(id_crapp);
        repo.delete(crapp);
    }

}
