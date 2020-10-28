package com.INSA.Projet_web.Repos;

//import com.INSA.Projet_web.Base.Criterias.Criteria_App;
import com.INSA.Projet_web.Base.Criterias.CriteriaRec;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriteriaRecRepo extends CrudRepository<CriteriaRec, Long> {
/*@Query("SELECT app " +
        "FROM APPRENTICE app, CRITERIA_APP " +
        "WHERE CRITERIA_APP.apprenti=app " +
        "AND elements(:criteria_rec.domains) IN elements(app.criteria.domains) " +
        "AND elements(:criteria_rec.studieslvl) IN app.studiesLvl) " +
        "AND :criteria_rec.duration_min <= app.criteria.duration_max" +
        "OR :criteria_rec.duration_max >= app.criteria.duration_min " +
        "AND elements(:criteria_rec.languages) IN elements(app.languages) " +
        "AND :criteria_rec.permisb = app.permisb " +
        "AND :criteria_rec.vehicule = app.vehicule")
   List<Criteria_App> findCompatibleCriteria_App (@Param("criteria_rec") Criteria_Rec criteria_rec);*/
}
