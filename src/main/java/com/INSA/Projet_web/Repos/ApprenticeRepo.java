package com.INSA.Projet_web.Repos;

import com.INSA.Projet_web.Base.Users.Apprentice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprenticeRepo extends CrudRepository<Apprentice, Long> {
    Apprentice findApprenticeByid(Long id_user);
}
