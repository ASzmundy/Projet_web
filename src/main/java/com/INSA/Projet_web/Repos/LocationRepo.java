package com.INSA.Projet_web.Repos;

import com.INSA.Projet_web.Base.Intermediary.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends CrudRepository<Location, Long> {
}
