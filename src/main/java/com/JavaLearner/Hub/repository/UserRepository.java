package com.JavaLearner.Hub.repository;

import com.JavaLearner.Hub.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository
        extends MongoRepository<User, String> {

    User findByUsername(String username);
}