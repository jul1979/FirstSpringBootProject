package heb.esi.layouts.web;

import heb.esi.layouts.business.ProjectService;
import heb.esi.layouts.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class RestController {
    @Autowired
    private ProjectService projectService;
    /*@GetMapping("/project/{name}")
    public ResponseEntity<?> allProjectsStartingWith(@PathVariable(name = "name") String name) {
       try {
        return new ResponseEntity<>(projectService.infoProjetRest(name), HttpStatus.OK);
        }catch (ApiRequestException ex){
            return new ResponseEntity<>("no project starting with that name found: " + name, HttpStatus.NOT_FOUND);
        }*/

        @GetMapping("/project/{name}")
        public java.util.List<heb.esi.layouts.dto.InfoDto> allProjectsStartingWith(@PathVariable(name = "name") String name) {
                return projectService.infoProjetRest(name);

    }
    @GetMapping("/project/hello/{name}")
    public Project projectByName(@PathVariable(name = "name")String name)
    {
            return projectService.findProjectByName(name);

    }



}
