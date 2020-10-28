package com.INSA.Projet_web.Repos;

import com.INSA.Projet_web.Base.Users.Recruiter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruiterRepo extends CrudRepository<Recruiter,Long> {

}
