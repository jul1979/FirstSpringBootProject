package g48982.webg5.pae.business;

import g48982.webg5.pae.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDB extends JpaRepository<Student, Long> {

    //nom des étudiants
    @Query("select s.nom from Student s")
    List <Object[]> findAllByNom();

   @Query( value = "SELECT student.nom ,sum(course.credits) FROM STUDENT_COURSE sc join student " +
            "on student.matricule=sc.student_id " +
            "join course on course.id=sc.course_id group by  student.nom",nativeQuery = true)
   List<Object[]> findStudentTotalCredits();

   //requête jpql: noms des étudiants et du nombre total d’ects dans leur programme ;
   @Query(value="select s.nom,sum(crs.credits)from Student s join s.courseSet crs group by s.nom")
   List<Object[]> findStudentTotalCreditsJPQL();

//requête JPQL:des étudiants qui ont plus d’ects dans leur programme qu’une valeur donnée en paramètre

    @Query(value="select s.nom from Student s join s.courseSet crs group by s.nom having sum(crs.credits)>:max")
    List<Object[]> findStudentWithCreditsGreaterThanJPQL(long max);

    //id et nom des étudiants
    @Query("select s.nom,s.matricule from Student s")
    List<Object[]>  findAllByNomAndMatricule();
    //des noms des étudiants et du nombre total d’ects dans leur programme
    //A traduire en jpql

    @Query(value = "select  student.matricule,student.genre,student.nom,student.section from student   join student_course  on student.matricule =student_course.student_id \n" +
            "join course  on course.id=student_course.course_id \n" +
            "group by  student.matricule,student.genre,student.nom,student.section\n" +
            "having sum(credits)>:credits",nativeQuery = true)
    List<Student> findStudentByCredits(Integer credits);

    //List<Student> findStudentByCreditsGreaterThan(Integer credits);

    List<Student> findStudentsByNomStartingWith(String name);

    @Query("select s.matricule,s.section from Student s")
    List<Object[]>getAllStudents();
   // Object[] findWhatever();



    //A traduire en jpql
   /* @Query("select  student.matricule,student.genre,student.nom,student.section from student ,sum(credits) totalcredits  join student_course  on student.matricule =student_course.student_id \n" +
            "join course  on course.id=student_course.course_id \n" +
            "group by  student.matricule,student.genre,student.nom,student.section"
    )
    List<Student> findAllByCredits();*/


}
