package he2b.g48982.web5g.annualprogram.Model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

@SpringBootTest
class UnitTest {

    @Autowired
    private BeanValidationUtil<Unit> validator;
    @Test
    public void  titleIsValid(){
         Unit unit = Unit.builder().id("INT1").title("base de données")
                .semester(5)
                .ects(10)
                .build();
        validator.assertIsValid(unit);
    }
    @Test
    public void semesterValueGreaterThanMax(){
        Unit unit = Unit.builder().id("INT1").title("base de données")
                .semester(8)
                .ects(10)
                .build();
        validator.assertHasError(unit,"semester", Max.class);
    }

    @Test
    public void semesterValueLowerThanMin(){
        Unit unit = Unit.builder().id("INT1").title("base de données")
                .semester(0)
                .ects(10)
                .build();
        validator.assertHasError(unit,"semester", Min.class);
    }

    @Test
    public void ectsValueNegative(){
        Unit unit = Unit.builder().id("INT1").title("base de données")
                .semester(2)
                .ects(0)
                .build();
        validator.assertHasError(unit,"ects", Positive.class);
    }



}