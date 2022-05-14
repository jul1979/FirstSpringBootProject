package g48982.webg5.pae.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityCtrl {

    @GetMapping("/login")
    public String login(){
        return "login";
    }



}
