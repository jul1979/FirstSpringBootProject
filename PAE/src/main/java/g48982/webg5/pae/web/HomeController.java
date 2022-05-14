package g48982.webg5.pae.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String home(Authentication auth, Model model) {
      String user = SecurityContextHolder.getContext().getAuthentication().getName();
    if (user.isEmpty()) {
      user = "";
    }
    model.addAttribute("user",user);
    return "home";
  }

}
