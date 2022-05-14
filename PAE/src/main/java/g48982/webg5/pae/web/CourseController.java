package g48982.webg5.pae.web;

import g48982.webg5.pae.business.*;
import g48982.webg5.pae.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Optional;

@Controller
public class CourseController {

  @Autowired
  private CourseDB courseDB;

  @Autowired
  private StudentDB studentDB;

  @Autowired
  private StudentCourseInsertRepository studentCourseInsertRepository;


  @GetMapping("/courses")
  public String courses(Model model) {
    String user = SecurityContextHolder.getContext().getAuthentication().getName();
    if (user.isEmpty()) {
      user = "";
    }
    model.addAttribute("user",user);
    Course newCourse = new Course();
    model.addAttribute("newCourse", newCourse);
    model.addAttribute("courses", courseDB.findAll());
    return "courses";
  }

  // donne les inscrits à un cours
  @GetMapping("/courses/{id}/details")
  public String coursesDetails(@PathVariable String id, Model model) {

    String user = SecurityContextHolder.getContext().getAuthentication().getName();
    if (user.isEmpty()) {
      user = "";
    }
    model.addAttribute("user",user);
    model.addAttribute("course", courseDB.findById(id).get());
    Matricule matricule = new Matricule();
    model.addAttribute("matricule", matricule);

  Optional<Course> optionalCourse = courseDB.findById(id);

    Iterable<Student> students = optionalCourse.isPresent() ? optionalCourse.get().getStudentSet() : new HashSet<>();
    model.addAttribute("students", students);
    return "detail";
  }

  @PostMapping("/addCourse")
  public String addCourse(@Valid @ModelAttribute(name = "newCourse") Course newCourse, Errors errors, Model model) {
    if (errors.hasErrors()) {
      model.addAttribute("courses", courseDB.findAll());
      return "courses";
    }
    courseDB.save(newCourse);
    return "redirect:/courses";
  }



  // inscrit un étudiant à un cours.
  @PostMapping(value = "/addStudent/{id}/details")
  public RedirectView addStudentToCourse(@PathVariable String id,
      @Valid @ModelAttribute(name = "matricule") Matricule matricule,
      Errors errors, Model model, RedirectAttributes redirectAttributes) {

    Long numero = matricule.getNumero();
    if (studentDB.existsById(numero)) {
      StudentCourseId studentCourseId = new StudentCourseId(numero, id);
      Student_Course student_course = new Student_Course(studentCourseId);
      studentCourseInsertRepository.insertWithQuery(student_course);
    }
    RedirectView rv = new RedirectView();
    //rv.setContextRelative(true);
    rv.setUrl("/courses/{id}/details");
    return rv;
  }

}
