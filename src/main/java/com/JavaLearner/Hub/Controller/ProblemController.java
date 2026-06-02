package com.JavaLearner.Hub.Controller;

import com.JavaLearner.Hub.service.ProblemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProblemController {

    private final ProblemService problemService;

    public ProblemController(ProblemService problemService) {
        this.problemService = problemService;
    }

    @GetMapping("/problems")
    public String problems(Model model) {

        model.addAttribute(
                "problems",
                problemService.getAllProblems()
        );

        return "problems";
    }
}