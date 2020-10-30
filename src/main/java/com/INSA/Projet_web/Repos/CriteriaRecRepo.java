package com.INSA.Projet_web.Repos;

//import com.INSA.Projet_web.Base.Criterias.Criteria_App;
import com.INSA.Projet_web.Base.Criterias.CriteriaRec;
import com.INSA.Projet_web.Base.Users.Recruiter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriteriaRecRepo extends CrudRepository<CriteriaRec, Long> {
    CriteriaRec findCriteriaRecByCrrecid(Long crrecid);
    CriteriaRec findCriteriaRecByRecruiter(Recruiter recruiter);
}
