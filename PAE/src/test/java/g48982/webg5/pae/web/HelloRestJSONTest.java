package g48982.webg5.pae.web;

import g48982.webg5.pae.model.Course;
import g48982.webg5.pae.service.CourseService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(value = HelloRestJSON.class,  excludeAutoConfiguration = {SecurityAutoConfiguration.class})
@ContextConfiguration(classes = HelloRestJSON.class)

public class HelloRestJSONTest {

        @Autowired
        private MockMvc mockMvc;

        @MockBean
        private CourseService courseService;

        /*
         * @BeforeEach
         * void setUp() {
         * 
         * String title="Developpement I";
         * Course cours2 = Course.builder()
         * .id("DEV1")
         * .title(title)
         * .credits(10)
         * .build();
         * //List<Course> mesCours = List.of(cours1, cours2);
         * Mockito.when(courseService.getCourseBySigle("DEV1")).thenReturn(cours2);
         * }
         */

        // This test is failing
        @Test
        public void getCourseById() throws Exception {
                String title = "Developpement I";
                Course cours2 = Course.builder()
                                .id("DEV1")
                                .title(title)
                                .credits(10)
                                .build();
                // List<Course> mesCours = List.of(cours1, cours2);
                Mockito.when(courseService.getCourseBySigle("DEV1")).thenReturn(cours2);

                // String title="Developpement I";
                mockMvc.perform(MockMvcRequestBuilders.get("/api/courses/DEV1"))
                                .andExpect(MockMvcResultMatchers.status().isOk())
                                .andExpect(MockMvcResultMatchers.jsonPath("$.title").value(title));

                /*
                 * .contentType(MediaType.APPLICATION_JSON)
                 * .content("{\n" +
                 * "id: \"DEV1\",\n" +
                 * "title: \"Developpement I\",\n" +
                 * "credits: 10\n" +
                 * "}"))
                 */
        }

}