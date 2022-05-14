package g48982.webg5.pae.web;

import g48982.webg5.pae.model.Course;
import g48982.webg5.pae.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloRestJSON {

  // public static final Logger log = LoggerFactory.getLogger("webg5.App");

  @Autowired
  private CourseService courseService;

  // donne un cours en fonction de son id.
  @GetMapping("/courses/{id}")
  public Course getCourseById(@PathVariable(name = "id") String id) {
    // return courseDB.findById(id).get();
    return courseService.getCourseBySigle(id);
  }
}
