package heb.esi.layouts.web;

import heb.esi.layouts.business.ProjectService;
import heb.esi.layouts.dto.InfoDto;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(value = RestController.class,  excludeAutoConfiguration = {SecurityAutoConfiguration.class})
@ContextConfiguration(classes = RestController.class)
//@WebMvcTest
class RestControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ProjectService projectService;


    @Test
    public void getProjectByName() throws Exception {
        String name = "MCD";
        InfoDto project = InfoDto.builder().name(name).build();
        ArrayList<InfoDto> dtos = new ArrayList<>();
        dtos.add(project);
        Mockito.when(projectService.infoProjetRest(name)).thenReturn(dtos);
       // ResultActions resultActions = mvc.perform(get("/api/project/hello/name").accept(MediaType.APPLICATION_JSON));
        //resultActions.andDo(MockMvcResultHandlers.print());
        mvc.perform(get("/api/project/name"))
                .andExpect(status().isOk())
               // .andExpect(jsonPath("$.name").value(name));
       .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value(name));


    }

}