package com.example.loginformdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

    @GetMapping("/signup")
    public String showRegistrationForm() {
        return "signup";
    }
}
