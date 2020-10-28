package com.INSA.Projet_web.Repos;

import com.INSA.Projet_web.Base.Criterias.CriteriaApp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriteriaAppRepo extends CrudRepository<CriteriaApp, Long> {
    CriteriaApp findCriteriaAppByCrappid(Long id_crapp);
}
