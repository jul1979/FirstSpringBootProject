package g48982.webg5.pae.business;

import g48982.webg5.pae.model.Course;
import g48982.webg5.pae.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDB extends JpaRepository<Course, String> {

  @Query(value = "select student.matricule,student.nom,student.genre,student.section from student_course join student on student.matricule =student_course.student_id where course_id=?1", nativeQuery = true)
  List<Student> findEnrolledStudents(String sigle);

  /*
   * @Query("select NEW com.mypackage.CustomerAmountResult(
   * o.customer.surname, sum(o.amount))
   * from Order as o
   * group by o.customer.surname")
   * List<CustomerAmountResult> findCustomersBySumOfAmount();
   */

  // Course update(String id, Student student);

  // affiche la liste des cours qui ont un nombre de crédits supérieur à une
  // valeur donnée.



  List<Course> findCourseByCreditsGreaterThan(int credits);

  List<Course> findCourseByTitleContaining(String name);

  //@Query("select c from Course c where c.id=:sigle")
  Course findCoursesById(String id);

/*  @Query(nativeQuery = true)
 List<StudentPojo> findStudentPojoById_Named(String sigle);*/


}
