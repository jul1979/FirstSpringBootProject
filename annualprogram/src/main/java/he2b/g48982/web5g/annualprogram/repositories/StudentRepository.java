package he2b.g48982.web5g.annualprogram.repositories;

import he2b.g48982.web5g.annualprogram.Model.Section;
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

   @Query("select NEW he2b.g48982.web5g.annualprogram.dto.StudentDto( u.id,u.title,u.ects,u.semester,r.mandatory)" +
           " from Registration r join r.annualProgram a join a.student s join r.unit u join u.sectionsSet" +
           " ss where  s.section=?1 ")


    List <StudentDto> studentCourses(Section section);

   /* select distinct p
    from Post p
    left join fetch p.comments
    where p.title = :title*/


    //SELECT a, b FROM Author a JOIN a.books b
    //SELECT * FROM UNIT u join registration r on r.unit_id=u.id;
    //SELECT * FROM UNIT u join registration r on r.unit_id=u.id join UNIT_SECTIONS s on s.unit_id=r.unit_id
    // where sections= 'G'

    /*@Query(value = "SELECT distinct u.id,ects,title,semester ,mandatory FROM UNIT u join unit_sections us on us.unit_id=u.id  left join registration r on r.unit_id=u.id where sections=?1", nativeQuery = true)*/



@Query("select distinct NEW he2b.g48982.web5g.annualprogram.dto.StudentDto( u.id,u.title,u.ects,u.semester,r.mandatory) from " +
        "Registration r join r.unit u join u.sectionsSet ss ")
    List <StudentDto> coursesBySection(Integer studentID);



}
