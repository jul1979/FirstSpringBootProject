package heb.esi.webg548982.web;

import heb.esi.webg548982.business.StudentService;
import heb.esi.webg548982.business.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private TaskService taskService;

    @GetMapping("/all")
    public String students(Model model){
        model.addAttribute("students",studentService.studentList());
        return "tableau";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam(name="name") String name, Model model){
        model.addAttribute("tasks",taskService.tasks());
        model.addAttribute("studentTasks",studentService.studentListBYId(name));
        return "detail";
    }



}
