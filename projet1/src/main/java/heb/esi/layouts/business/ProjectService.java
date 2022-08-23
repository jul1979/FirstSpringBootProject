package heb.esi.layouts.business;

import heb.esi.layouts.db.ProjectRepository;
import heb.esi.layouts.db.SprintRepository;
import heb.esi.layouts.dto.DetailDto;
import heb.esi.layouts.dto.InfoDto;
import heb.esi.layouts.dto.ProjectDto;
import heb.esi.layouts.model.Project;
import heb.esi.layouts.model.Sprint;
import heb.esi.layouts.model.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private SprintRepository sprintRepository;

    public boolean isActive(String projectName){
         Project project = projectRepository.findById(projectName).get();
         return project.isActive();
    }
    public List<ProjectDto> projects(){
        return projectRepository.findAllProjects();
    }
    public List<DetailDto> detailProject(String projectName){
        return projectRepository.findProjectDetail(projectName);
    }



    public List<InfoDto>infoProjetRest(String projectName)throws NoSuchElementException {
        List<InfoDto> infoDtos = projectRepository.infoProjetRest(projectName);
        if (infoDtos.isEmpty())throw  new NoSuchElementException("no project found!");
        return infoDtos;
    }

    public void save(Story story,String pname) {
        Project project = projectRepository.findById(pname).get();
            int max = project.getSprints().stream().mapToInt(Sprint::getId).max().getAsInt();
            Sprint lastSprint = project.getSprints().stream().filter(sprint -> sprint.getId() == max).findFirst().get();
            story.setSprint(lastSprint);
            lastSprint.getStories().add(story);
            sprintRepository.save(lastSprint);

    }
    public Project findProjectByName(String name)
    {
        return projectRepository.findByName(name);
    }
}
