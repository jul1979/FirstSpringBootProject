package heb.esi.layouts.business;

import heb.esi.layouts.db.ProjectRepository;
import heb.esi.layouts.model.Project;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProjectServiceTest {

    @MockBean
    private ProjectRepository projectRepository;

    @Autowired
    private ProjectService projectService;


    @Test
    public void getUserByName() {
        String name = "MCD";
        Project project = Project.builder().name(name).build();
        Mockito.when(projectRepository.findByName(name)).thenReturn(project);
        Project found = projectService.findProjectByName(name);
        assertEquals(found.getName(), name);
    }


}