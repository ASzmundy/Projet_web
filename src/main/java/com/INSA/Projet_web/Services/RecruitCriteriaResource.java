package com.INSA.Projet_web.Services;

import com.INSA.Projet_web.Base.Criterias.CriteriaRec;
import com.INSA.Projet_web.Repos.CriteriaRecRepo;
import com.INSA.Projet_web.Repos.RecruiterRepo;
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
@Path("/reccriterias")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RecruitCriteriaResource {

    @Autowired
    private CriteriaRecRepo repo;
    @Autowired
    private RecruiterRepo recruiterRepo;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response uploadrecruitcriteria(CriteriaRec criteria_rec){
        CriteriaRec crrec= repo.findCriteriaRecByRecruiter(criteria_rec.getRecruiter());
        crrec.setDomains(criteria_rec.getDomains());
        crrec.setDuration_max(criteria_rec.getDuration_max());
        crrec.setDuration_min(criteria_rec.getDuration_min());
        crrec.setLanguages(criteria_rec.getLanguages());
        crrec.setPermisb(criteria_rec.isPermisb());
        crrec.setStudiesLvls(criteria_rec.getStudiesLvls());
        crrec.setVehicule(criteria_rec.isVehicule());
        repo.save(crrec);
        return Response.ok().build();
    }

    @GET
    @Path("/{ID_CRec}")
    public CriteriaRec downloadCriteriaRec(@PathParam("ID_CRec") Long id_crec){
        return repo.findById(id_crec).get();
    }

}
