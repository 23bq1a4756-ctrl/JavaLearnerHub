package com.JavaLearner.Hub.Controller;

import com.JavaLearner.Hub.service.TutorialService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TutorialController {

    private final TutorialService tutorialService;

    public TutorialController(TutorialService tutorialService) {
        this.tutorialService = tutorialService;
    }

    @GetMapping("/tutorials")
    public String tutorials(Model model) {

        model.addAttribute(
                "tutorials",
                tutorialService.getAllTutorials()
        );

        return "tutorials";
    }
}