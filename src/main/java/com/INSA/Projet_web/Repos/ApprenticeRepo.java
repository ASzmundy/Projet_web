package com.INSA.Projet_web.Repos;

import com.INSA.Projet_web.Base.Users.Apprentice;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApprenticeRepo extends CrudRepository<Apprentice, Long> {
    Apprentice findApprenticeByid(Long id_user);
    List<Apprentice> findApprenticesByFirstname(String firstname);
    List<Apprentice> findApprenticesByName(String name);
    @Query("SELECT a.id FROM Apprentice a WHERE a.mail = :mail")
    List<Long> findIdByMail(@Param("mail") String mail);
}
