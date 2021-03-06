package he2b.g48982.web5g.annualprogram.web;


import he2b.g48982.web5g.annualprogram.Model.Section;
import he2b.g48982.web5g.annualprogram.Model.Student;
import he2b.g48982.web5g.annualprogram.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String students(Model model){
        model.addAttribute("students",studentService.allStudents());
        model.addAttribute("student",new Student());
        return "students";
    }

    @PostMapping("/filter")
    public String addStory( @ModelAttribute Student student, BindingResult bindingResult,
                            @RequestParam(value="number",required = false)String number,
                           @RequestParam (value="name",required = false)String name,
                           @RequestParam (value="section",required = false)String section,
                           @RequestParam (value="bloc",required = false)String bloc
                            , Model model) {

       /* System.out.println("Filters:");
        System.out.println( "numero: "+ number+ "nom:" + name + "section: "+ section
                + "bloc: "  + bloc);*/

        model.addAttribute("students",studentService.filter(number,name,section,bloc));
        return "students";

    }

    @GetMapping("/detail")
    public String detail(@RequestParam (name="number") String number,Model model){
         int numberAsInt = Integer.parseInt(number);
         model.addAttribute("student",studentService.findById(numberAsInt));
         model.addAttribute("courses",studentService.studentDetail(numberAsInt));
         return "detail";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam (name="number") String number,
                       Model model,@RequestParam (name="section") String section ){
        int numberAsInt = Integer.parseInt(number);
        model.addAttribute("student",studentService.findById(numberAsInt));
        //model.addAttribute("courses",studentService.coursesBySection(numberAsInt));
        model.addAttribute("courses",studentService.coursesBySection(Section.valueOf(section)));
        return "programme";
    }

}
