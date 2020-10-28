package com.INSA.Projet_web.Services;

import com.INSA.Projet_web.Base.Users.Recruiter;
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

@Service
@Path("/recruiters")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RecruiterResource {
   @Autowired
    private RecruiterRepo repo;

    @POST
    public void uploadrecruiter(Recruiter recruiter){
        repo.save(recruiter);
    }

    @GET
    @Path("/{ID_rec}")
    public Recruiter downloadrecruiter(@PathParam("ID_rec") Long id_rec){
        if(repo.existsById(id_rec)) {
            return repo.findById(id_rec).get();
        }else return null;
    }
}
