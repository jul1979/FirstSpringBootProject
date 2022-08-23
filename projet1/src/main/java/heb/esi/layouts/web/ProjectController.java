package heb.esi.layouts.web;

import heb.esi.layouts.business.ProjectService;
import heb.esi.layouts.dto.DetailDto;
import heb.esi.layouts.model.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/scrum")
@Controller
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/projects")
    public String allProjects(Model model){
        model.addAttribute("projects",projectService.projects());
        return "projects";
    }
    @GetMapping("/detail/{id}")
    public String showProjectDetail(@PathVariable("id") String name,Model model) {
         List<DetailDto> infos = projectService.detailProject(name);
         model.addAttribute("infos",infos);
         model.addAttribute("pname",name);
         return "detail";
    }

    @GetMapping("/form/{id}")
    public String addStory( @PathVariable("id") String pname,Model model){
         Story story = new Story();
         model.addAttribute("story",story);
         model.addAttribute("pname",pname);
         return "form";
    }
    @PostMapping("/form")
    public String processform(
                             @Valid @ModelAttribute(name = "story")Story story,
                              Errors errors,
                             @RequestParam("name") String pname,
                              Model model){
        if (errors.hasErrors()){
            return "form";
        }
        if (projectService.isActive(pname)) {
            projectService.save(story, pname);
            model.addAttribute("message","true");
        }else{
            model.addAttribute("message","false");
        }
        return showProjectDetail(pname,model);
    }

}
