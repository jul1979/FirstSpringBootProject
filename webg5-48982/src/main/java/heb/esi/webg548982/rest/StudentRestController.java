package heb.esi.webg548982.rest;


import heb.esi.webg548982.business.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class StudentRestController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/completedTasks")
    public ResponseEntity<?> studentsCompleteTask(){
        try {
             List<Long> studentCompleTasks = studentService.StudentCompleTasks();
            return new ResponseEntity<>(studentCompleTasks, HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>(new Exception("something went wrong in the service layer"), HttpStatus.BAD_REQUEST);
        }
    }
}
