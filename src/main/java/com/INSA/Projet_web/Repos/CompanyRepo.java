package com.INSA.Projet_web.Repos;

import com.INSA.Projet_web.Base.Users.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends CrudRepository<Company,Long> {
}
