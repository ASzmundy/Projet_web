package com.INSA.Projet_web.Services;

import com.INSA.Projet_web.Base.Criterias.CriteriaRec;
import com.INSA.Projet_web.Repos.CriteriaRecRepo;
import org.springframework.stereotype.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Service
@Path("/recruitcriterias")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RecruitCriteriaResource {
    private CriteriaRecRepo repo;
    @POST
    public void uploadrecruitcriteria(CriteriaRec criteria_rec){
        repo.save(criteria_rec);
    }

    @GET
    @Path("/{ID_CRep}")
    public CriteriaRec downloadCriteriaRec(@PathParam("ID_CRep") Long id_crep){
        if(repo.existsById(id_crep)) return repo.findById(id_crep).get();
        else return null;
    }
}
