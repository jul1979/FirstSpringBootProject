package g48982.webg5.pae.web;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentControllerTest {

   @Autowired
    private MockMvc mockMvc;

   @Test
   public void testWelcomePage() throws Exception {
       mockMvc.perform(MockMvcRequestBuilders.get("/students"))
               .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(MockMvcResultMatchers.view().name("students"))
               .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Search")));
   }






}