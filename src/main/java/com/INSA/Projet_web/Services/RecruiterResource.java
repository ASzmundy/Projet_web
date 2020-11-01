package com.INSA.Projet_web.Services;

import com.INSA.Projet_web.Base.Criterias.CriteriaRec;
import com.INSA.Projet_web.Base.Users.Company;
import com.INSA.Projet_web.Base.Users.Recruiter;
import com.INSA.Projet_web.Repos.CompanyRepo;
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
@Path("/recruiters")
public class RecruiterResource {
   @Autowired
    private RecruiterRepo repo;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response uploadrecruiter(Recruiter recruiter){
        recruiter.setCriteria_rec(new CriteriaRec(recruiter));
        repo.save(recruiter);
        return Response.ok().build();
    }

    @GET
    @Path("/{ID_rec}")
    @Produces(MediaType.APPLICATION_JSON)
    public Recruiter downloadrecruiter(@PathParam("ID_rec") Long id_rec){
            return repo.findById(id_rec).get();
    }

    @GET
    @Path("/mailrec/{mail}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getidfrommail(@PathParam("mail") String mail){
        return repo.findIdByMail(mail).get(0).toString();
    }

    public Response deleterecruiter(Recruiter recruiter){
        repo.delete(recruiter);
        return Response.ok().build();
    }
}
