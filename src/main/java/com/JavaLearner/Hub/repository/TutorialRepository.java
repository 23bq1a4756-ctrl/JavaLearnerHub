package com.JavaLearner.Hub.repository;

import com.JavaLearner.Hub.model.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TutorialRepository
        extends MongoRepository<Tutorial, String> {
}