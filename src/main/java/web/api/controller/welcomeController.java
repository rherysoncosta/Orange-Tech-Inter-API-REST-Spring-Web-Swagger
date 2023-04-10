package web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to my spring boot web API";
    }
}
