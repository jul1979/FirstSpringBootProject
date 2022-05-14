package he2b.g48982.web5g.annualprogram.Model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@SpringBootTest
class StudentTest {

    @Autowired
    private BeanValidationUtil<Student> validator;


    @Test
    public void  titleIsValid(){
         Student student = Student.builder().number(48982)
                .name("jules").bloc(2)
                .section(Section.GESTION)
                .build();
        validator.assertIsValid(student);
    }
    @Test
    public void sectionValueGreaterThanMax(){
        Student student = Student.builder().number(48982)
                .name("jules").bloc(5)
                .section(Section.GESTION)
                .build();
        validator.assertHasError(student,"bloc", Max.class);

    }

    @Test
    public void sectionValueLessThanMin(){
        Student student = Student.builder().number(48982)
                .name("jules").bloc(0)
                .section(Section.GESTION)
                .build();
        validator.assertHasError(student,"bloc", Min.class);

    }





}