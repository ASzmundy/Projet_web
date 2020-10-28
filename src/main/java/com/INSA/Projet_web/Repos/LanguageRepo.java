package com.INSA.Projet_web.Repos;

import com.INSA.Projet_web.Base.Intermediary.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepo extends CrudRepository<Language,Long> {
}
