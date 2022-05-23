package heb.esi.webg5g12345.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class welcomeController {

    @GetMapping("/")
    public String home(){
        return "welcome";
    }



}
