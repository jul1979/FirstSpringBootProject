package g48982.webg5.pae.service;

import g48982.webg5.pae.business.CourseDB;
import g48982.webg5.pae.model.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CourseServiceTest {

    @Autowired
    private  CourseService courseService;

    @MockBean
    private CourseDB courseDB;

    @BeforeEach
    void setUp() {

       Course cours2 = Course.builder()
               .id("DEV1")
               .title("Developpement I")
               .credits(10)
               .build();
       Mockito.when(courseDB.findCoursesById("DEV1")).thenReturn(cours2);
    }

    @Test
    public void testGetCourseBySigle(){
        Course dev1 = courseService.getCourseBySigle("DEV1");
        assertEquals(dev1.getTitle(),"Developpement I");
    }
}