package heb.esi.layouts.db;

import heb.esi.layouts.model.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class ProjectRepositoryTest {
    @Autowired
    private ProjectRepository projectRepository;


    @Test
    public void findByName() {
        Project monProjet = Project.builder().name("Othello").active(true).build();
        projectRepository.save(monProjet);
        Project found = projectRepository.findByName("Othello");
        assertEquals(monProjet, found);
    }


}