package com.myfirsttest.testing.Repository;

import com.myfirsttest.testing.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    @Query
    User findByEmail(String email);
}

/*
@Query("{'username': ?0}")
    Optional<User> findByUsername(String username);

    @Query("{'password': ?0}")
    Optional<User> findByPassword(String password);
 */

