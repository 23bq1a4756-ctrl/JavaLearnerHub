package com.JavaLearner.Hub.repository;

import com.JavaLearner.Hub.model.Problem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProblemRepository
        extends MongoRepository<Problem,String> {
}