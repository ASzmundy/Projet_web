package com.INSA.Projet_web.Services;

import com.INSA.Projet_web.Base.Users.Apprentice;
import com.INSA.Projet_web.Repos.ApprenticeRepo;
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
@Path("/apprentices")
public class ApprenticeResource {
    @Autowired
    private ApprenticeRepo repo;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response uploadapprentice(Apprentice apprentice){
        repo.save(apprentice);
        return Response.ok().build();
    }

    @GET
    @Path("/{ID_app}")
    @Produces(MediaType.APPLICATION_JSON)
    public Apprentice downloadapprentice(@PathParam("ID_app") Long id_app){
            return repo.findApprenticeByid(id_app);
    }

    public Response deleteapprentice(Apprentice apprentice){
        repo.delete(apprentice);
        return Response.ok().build();
    }
}
