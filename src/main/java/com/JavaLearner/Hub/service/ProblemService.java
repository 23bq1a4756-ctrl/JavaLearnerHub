package com.JavaLearner.Hub.service;

import com.JavaLearner.Hub.model.Problem;
import com.JavaLearner.Hub.repository.ProblemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemService {

    private final ProblemRepository repository;

    public ProblemService(ProblemRepository repository) {
        this.repository = repository;
    }

    public List<Problem> getAllProblems() {
        List<Problem> problems = repository.findAll();

        System.out.println("Problems Found: " + problems.size());

        return problems;
    }
}