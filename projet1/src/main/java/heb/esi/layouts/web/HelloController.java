package heb.esi.layouts.web;

import heb.esi.layouts.business.PersonService;
import heb.esi.layouts.dto.Name;
import heb.esi.layouts.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private PersonService personService;

   @GetMapping("/")
    public String greeting(Model model){
       model.addAttribute("person", new Person());
        return "greeting";
    }
    @GetMapping("/persons")
    public String persons(Model model, Principal principal){
         String principalName = principal.getName();
        //LayoutsApplication.log.error(principalName);
        model.addAttribute("principalName",principalName);
        model.addAttribute("persons",personService.allPersons());
        return "persons";
    }

    @GetMapping("/names")
    public String lastNames(Model model){
       List<Name> names = personService.lastNames();
        model.addAttribute("names", names);
        return "names";
    }

    @PostMapping("/addPerson")
    public String addPerson(@Valid @ModelAttribute(name = "person") Person person, Errors errors, Model model){
        if (errors.hasErrors())return "greeting";
        personService.save(person);
        model.addAttribute("persons", personService.allPersons());
       return "persons";
    }
    @GetMapping("/login")
    public String login(){
       return "login";
    }

    @GetMapping("/images")
    public String images(){
        return "images";
    }
}
