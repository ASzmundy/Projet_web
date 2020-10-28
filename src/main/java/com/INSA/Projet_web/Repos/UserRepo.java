package com.INSA.Projet_web.Repos;

import com.INSA.Projet_web.Base.Users.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    /*List<User> findUserByName(String name);
    List<User> findUserByFirstname(String firstname);
    List<User> findUserByBirthday(Date birthday);*/
}
