package heb.esi.webg548982.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class welcomeController {

    @GetMapping("/")
    public String welcome(){
        return "welcome";
    }
}
