package g48982.webg5.pae.business;

import g48982.webg5.pae.model.Student_Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class StudentCourseInsertRepository {

@PersistenceContext
    private EntityManager entityManager;

@Transactional
    public void insertWithQuery(Student_Course student_course){
    entityManager.createNativeQuery("INSERT INTO STUDENT_COURSE (STUDENT_ID,COURSE_ID)VALUES(?,?)")
            .setParameter(1,student_course.getStudentCourseId().getStudent_id())
            .setParameter(2,student_course.getStudentCourseId().getCourse_id())
            .executeUpdate();
}







}
