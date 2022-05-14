package g48982.webg5.pae.model;

import g48982.webg5.pae.BeanValidationUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.NotBlank;

@SpringBootTest
public  class CourseTest {

@Autowired
private BeanValidationUtil<Course> validator;


@Test
public void  titleIsValid(){
     Course course = Course.builder()
            .id("SYS2")
            .title("operating systems")
            .credits(5)
            .build();
     validator.assertIsValid(course);
}
@Test
    public void titleBlankError(){
    Course course = Course.builder()
            .id("SYS2")
            .title("")
            .credits(5)
            .build();
    validator.assertHasError(course,"title", NotBlank.class);
}



 }