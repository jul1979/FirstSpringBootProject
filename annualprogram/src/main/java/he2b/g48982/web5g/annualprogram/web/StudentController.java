package he2b.g48982.web5g.annualprogram.web;


import he2b.g48982.web5g.annualprogram.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String students(Model model){
        model.addAttribute("students",studentService.allStudents());
        return "students";
    }
}
