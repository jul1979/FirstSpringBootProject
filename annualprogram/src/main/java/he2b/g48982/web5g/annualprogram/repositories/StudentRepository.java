package he2b.g48982.web5g.annualprogram.repositories;

import he2b.g48982.web5g.annualprogram.Model.Student;
import he2b.g48982.web5g.annualprogram.dto.StudentDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

    List<Student> findByNameStartingWith(@Param("name") String name);
    List<Student> findByBloc(Integer bloc);

    @Query("select NEW he2b.g48982.web5g.annualprogram.dto.StudentDto( u.id,u.title,u.ects,u.semester,r.mandatory) from Registration r join r.annualProgram a join a.student s join r.unit u where s.number=?1 ")
   List <StudentDto> studentDetail(Integer studentID);



}
