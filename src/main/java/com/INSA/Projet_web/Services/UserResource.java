package com.INSA.Projet_web.Services;

import com.INSA.Projet_web.Base.Users.User;
import com.INSA.Projet_web.Repos.UserRepo;
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
@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    @Autowired
    private UserRepo repo;

    @POST
    public void uploadrecruiter(User user){
        repo.save(user);
    }

    @GET
    @Path("/{ID_user}")
    public User downloadrecruiter(@PathParam("ID_user") Long id_user){
        if(repo.existsById(id_user)) {
            return repo.findById(id_user).get();
        }else return null;
    }
}
