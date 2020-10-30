package com.INSA.Projet_web.Services;

import com.INSA.Projet_web.Base.Criterias.CriteriaApp;
import com.INSA.Projet_web.Repos.ApprenticeRepo;
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
import javax.ws.rs.core.Response;

@Service
@Path("/appcriterias")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AppCriteriaResource {
    @Autowired
     private CriteriaAppRepo repo;
    @Autowired
    private ApprenticeRepo apprenticeRepo;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response uploadappcriteria(CriteriaApp criteria_app){
        CriteriaApp crapp= repo.findCriteriaAppByApprentice(criteria_app.getApprentice());
        crapp.setDuration_min(criteria_app.getDuration_min());
        crapp.setDuration_max(criteria_app.getDuration_max());
        crapp.setDomains(criteria_app.getDomains());
        crapp.setLocations(criteria_app.getLocations());
        repo.save(crapp);
        return Response.ok().build();
    }

    @GET
    @Path("/{ID_CrApp}")
    public CriteriaApp downloadCriteriaApp(@PathParam("ID_CrApp") Long id_crapp){
        return repo.findById(id_crapp).get();
    }

}
