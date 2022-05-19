package heb.esi.webg548982.web;

import heb.esi.webg548982.business.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public String students(Model model){
        model.addAttribute("students",studentService.studentList());
        return "tableau";
    }


}
