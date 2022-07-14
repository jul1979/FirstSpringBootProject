package heb.esi.webg6cine48982.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome(Model model, Principal principal) {
        model.addAttribute("principal", principal.getName());
        return "welcome";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }




}
