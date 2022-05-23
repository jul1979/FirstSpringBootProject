package heb.esi.webg5g12345.web;

import heb.esi.webg5g12345.business.DepotService;
import heb.esi.webg5g12345.model.Commit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class RepositoryController {

    @Autowired
    private DepotService depotService;

    @GetMapping("/repositories")
    public String repos(Model model){
        model.addAttribute("repos",depotService.allRepo());
        return "repos";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam (name ="id") Integer id, Model model){
        model.addAttribute("depots",depotService.RepoDetail(id));
        model.addAttribute("commit",new Commit());
        return "detail";
    }

    @PostMapping("/addCommit")
    public String addStory(@RequestParam (name = "id") Integer id, @Valid @ModelAttribute(name="commit")  Commit commit, BindingResult bindingResult,
                           Model model,
                           RedirectAttributes redirectAttributes) {
        System.out.println("message :" + commit.getMessage());
        if (bindingResult.hasErrors()) {
            //redirectAttributes.addAttribute("depots",depotService.RepoDetail(id));
            //redirectAttributes.addAttribute("name", projectName);
            //redirectAttributes.addFlashAttribute("fa", faValue);
            //return "welcome";
            return  detail( id, model);
        }
        //return "welcome";
        depotService.saveEntity(commit,id);
        model.addAttribute("depots",depotService.RepoDetail(id));
        //redirectAttributes.addAttribute("id", id);
        //return "redirect:/detail";
        return  detail( id, model);
    }

}




