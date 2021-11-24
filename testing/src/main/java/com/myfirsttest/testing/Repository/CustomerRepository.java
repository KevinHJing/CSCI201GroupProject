package com.myfirsttest.testing.Repository;

import com.myfirsttest.testing.Model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    @Query("{'username': ?0}")
    Optional<Customer> findByUsername(String username);

    @Query("{'password': ?0}")
    Optional<Customer> findByPassword(String password);

}
