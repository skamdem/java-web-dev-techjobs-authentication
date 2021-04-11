package org.launchcode.javawebdevtechjobsauthentication.data;

import org.launchcode.javawebdevtechjobsauthentication.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kamdem
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
