package heb.esi.layouts.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.Positive;

@SpringBootTest
class SprintTest {

    @Autowired
    private BeanValidationUtil<Sprint> validator;


    @Test
    public void testNumberIsValid() {
         Sprint sprint = Sprint.builder()
                .id(1)
                .number(23)
                .days(34)
                .build();
        validator.assertIsValid(sprint);

    }

    @Test
    public void testNumberIsNotValid() {
        Sprint sprint = Sprint.builder()
                .id(1)
                .number(-2)
                .days(34)
                .build();
        validator.assertHasError(sprint,"number", Positive.class);
    }


}