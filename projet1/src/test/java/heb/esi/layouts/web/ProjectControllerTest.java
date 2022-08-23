package heb.esi.layouts.web;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ProjectControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
 public void testWelcomePage() throws Exception {
         mockMvc.perform( get("/scrum/projects")) // L’url à tester
         .andExpect(status().isOk()) // La page est retournée
         .andExpect(view().name("projects")) // Générée à partir du template welcome
         // Elle contient le texte attendu
         .andExpect(content().string(Matchers.containsString("Actif")));
         }

}