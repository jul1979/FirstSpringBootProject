package g48982.webg5.pae.business;

import org.springframework.data.jpa.repository.JpaRepository;

import g48982.webg5.pae.model.StudentCourseId;
import g48982.webg5.pae.model.Student_Course;

import javax.persistence.NamedNativeQuery;







public interface StudentCourseRepository extends JpaRepository<Student_Course, StudentCourseId> {

}
