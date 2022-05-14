package g48982.webg5.pae.web;

import g48982.webg5.pae.business.CourseDB;
import g48982.webg5.pae.business.StudentCourseInsertRepository;
import g48982.webg5.pae.business.StudentDB;
import g48982.webg5.pae.model.Course;
import g48982.webg5.pae.model.Student;
import g48982.webg5.pae.model.StudentCourseId;
import g48982.webg5.pae.model.Student_Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Controller
public class StudentController {
  @Autowired
  private StudentDB studentDB;

  @Autowired
  private CourseDB courseDB;

  @Autowired
  private StudentCourseInsertRepository studentCourseInsertRepository;

  @GetMapping("/students")
  public String getStudents(Model model) {
    String user = SecurityContextHolder.getContext().getAuthentication().getName();
    if (user.isEmpty()) {
      user = "";
    }
    model.addAttribute("user",user);
    model.addAttribute("student", new Student());
    model.addAttribute("students", studentDB.findAll());
    return "students";
  }

  @PostMapping("/search")
  public  String searchByNane(Model model,@RequestParam(name="nom") String  nom){
    model.addAttribute("student", new Student());
    model.addAttribute("students", studentDB.findStudentsByNomStartingWith(nom));
    return "students";
  }

  //ajoute un cours à la liste des cours d'un étudiant
  @PostMapping(value = "/addCourse/{matricule}/")
  public RedirectView addCourseToStudentList(@Valid @ModelAttribute(name = "newCourse") Course newCourse,
                                       Errors errors, Model model,@PathVariable(name = "matricule") Long matricule){
    String courseId = newCourse.getId();
    if (courseDB.existsById(courseId)) {
      StudentCourseId studentCourseId = new StudentCourseId(matricule, courseId);
      Student_Course student_course = new Student_Course(studentCourseId);
      studentCourseInsertRepository.insertWithQuery(student_course);
    }
    RedirectView rv = new RedirectView();
    //rv.setContextRelative(true);
    rv.setUrl("/students/{matricule}/details");
    return rv;

  }

  @PostMapping("/addStudent")
  public String addStudent(@Valid @ModelAttribute Student student, Errors errors, Model model) {
    if (errors.hasErrors()) {
      model.addAttribute("students", studentDB.findAll());
      return "students";
    }
    studentDB.save(student);
    return "redirect:/students";
  }

  // renvoie la liste des cours auquel un étudiant est inscrit.
  @GetMapping("/students/{studentId}/details")
  public String getAStudentCourses(@PathVariable(name = "studentId") Long studentId, Model model) {
    String user = SecurityContextHolder.getContext().getAuthentication().getName();
    if (user.isEmpty()) {
      user = "";
    }
    model.addAttribute("user",user);
    Course newCourse = new Course();// servira à stocker la valeur  du sigle du cours
    model.addAttribute("newCourse", newCourse);// TODO
    Optional<Student> sOptional = studentDB.findById(studentId);
    if (sOptional.isPresent()) {
      Set<Course> courses = sOptional.get().getCourseSet();
      model.addAttribute("courses", courses);
    } else {
      model.addAttribute("courses", new HashSet<>());
    }
    Student student = studentDB.findById(studentId).get();
    model.addAttribute("student", student);
    return "registrations";
  }

}
