package com.INSA.Projet_web.Services;

import com.INSA.Projet_web.Base.Users.Company;
import com.INSA.Projet_web.Repos.CompanyRepo;
import org.springframework.stereotype.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Service
@Path("/companies")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CompanyRessource {
    private CompanyRepo repo;
    @POST
    public void uploadcompany(Company company){
        repo.save(company);
    }

    @GET
    @Path("/{ID_company}")
    public Company downloadCriteriaRec(@PathParam("ID_company") Long id_company){
        if(repo.existsById(id_company)) return repo.findById(id_company).get();
        else return null;
    }
}
