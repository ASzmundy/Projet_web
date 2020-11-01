package com.INSA.Projet_web.Repos;

import com.INSA.Projet_web.Base.Users.Company;
import com.INSA.Projet_web.Base.Users.Recruiter;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecruiterRepo extends CrudRepository<Recruiter, Long> {
    Recruiter findRecruiterByid(Long id_user);
    List<Recruiter> findRecruitersByFirstname(String firstname);
    List<Recruiter> findRecruitersByName(String name);
    List<Recruiter> findRecruiterByCompany(Company company);
    @Query("SELECT a.id FROM Recruiter a WHERE a.mail = :mail")
    List<Long>findIdByMail(@Param("mail") String mail);
}
