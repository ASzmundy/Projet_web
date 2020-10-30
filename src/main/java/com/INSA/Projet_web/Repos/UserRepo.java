package com.INSA.Projet_web.Repos;

import com.INSA.Projet_web.Base.Users.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Long> {
}
