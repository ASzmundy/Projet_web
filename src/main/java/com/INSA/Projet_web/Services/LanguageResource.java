package com.INSA.Projet_web.Services;

import com.INSA.Projet_web.Base.Intermediary.Language;
import com.INSA.Projet_web.Repos.LanguageRepo;
import org.springframework.stereotype.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Service
@Path("/languages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class LanguageResource {
    private LanguageRepo repo;
    @POST
    public void uploadlanguage(Language lang){
        repo.save(lang);
    }

    @GET
    @Path("/{ID_lang}")
    public Language downloadCriteriaRec(@PathParam("ID_lang") Long id_lang){
        if(repo.existsById(id_lang)) return repo.findById(id_lang).get();
        else return null;
    }
}
