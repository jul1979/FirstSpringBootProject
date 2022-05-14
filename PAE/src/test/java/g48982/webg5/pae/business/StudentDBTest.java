package g48982.webg5.pae.business;

import g48982.webg5.pae.model.Genre;
import g48982.webg5.pae.model.Section;
import g48982.webg5.pae.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class StudentDBTest {

   @Autowired
   private StudentDB studentDB;


    @BeforeEach
    void setUp() {
        Student testStudent = Student.builder()
                .nom("ruzindana")
                .matricule(49000)
                .genre(Genre.MALE)
                .section(Section.GESTION)
                .build();
        studentDB.save(testStudent);
    }

    @Test
    public void findStudentsByNomStartingWith(){
         List<Student> list = studentDB.findStudentsByNomStartingWith("ruz");
        assertEquals(1, list.size());
        assertEquals("ruzindana",list.get(0).getNom());
    }


}