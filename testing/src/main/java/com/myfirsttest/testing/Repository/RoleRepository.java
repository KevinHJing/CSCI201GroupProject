package com.myfirsttest.testing.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.myfirsttest.testing.Model.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

    //Declares Query for getting role data by role name
    Role findByRole(String role);
}

