package com.JavaLearner.Hub.Controller;


import com.JavaLearner.Hub.model.User;
import com.JavaLearner.Hub.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public AuthController(UserRepository userRepository,
                          BCryptPasswordEncoder passwordEncoder) {

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/register")
    public String registerPage(Model model) {

        model.addAttribute("user", new User());

        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {

        user.setPassword(
                passwordEncoder.encode(user.getPassword())
        );

        userRepository.save(user);

        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}