package com.INSA.Projet_web.Repos;

import com.INSA.Projet_web.Base.Users.Apprentice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApprenticeRepo extends CrudRepository<Apprentice, Long> {
    Apprentice findApprenticeByid(Long id_user);
    List<Apprentice> findApprenticesByFirstname(String firstname);
    List<Apprentice> findApprenticesByName(String name);
}
