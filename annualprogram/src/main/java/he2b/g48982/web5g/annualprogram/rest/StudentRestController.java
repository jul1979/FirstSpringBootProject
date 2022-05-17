    package he2b.g48982.web5g.annualprogram.rest;


import he2b.g48982.web5g.annualprogram.Model.Student;
import he2b.g48982.web5g.annualprogram.dto.StudentDto;
import he2b.g48982.web5g.annualprogram.exceptions.ResourceNotFoundException;
import he2b.g48982.web5g.annualprogram.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api")
    @CrossOrigin(origins = "*")
    public class StudentRestController {

        private final Logger logger = LoggerFactory.getLogger(this.getClass());

        @Autowired
        private StudentService studentService;

        @GetMapping("/allstudents")
        public ResponseEntity<List<Student>> allStudents () {
            return new ResponseEntity<>(studentService.allStudents(), HttpStatus.OK);
        }

        @GetMapping(value = "/student/{studentId}")
        public ResponseEntity< ?> findStudentById(@PathVariable Integer studentId) {
            try {
                List<StudentDto> studentDtos = studentService.studentDetail(studentId);
                return new ResponseEntity<>(studentDtos, HttpStatus.OK);  // return 200, with json body
            } catch (ResourceNotFoundException ex) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // return 404, with null body
            }
        }
        @GetMapping("/studentFilter")
        public ResponseEntity<List<Student>> filterStudents(
                                @RequestParam(value="number",required = false)String number,
                                @RequestParam (value="name",required = false)String name,
                                @RequestParam (value="section",required = false, defaultValue = "TOUS")String section,
                                @RequestParam (value="bloc",required = false,defaultValue = "0")String bloc
               ) {
            try {
               List<Student> studentList = studentService.filter(number, name, section, bloc);
               return new ResponseEntity<>(studentList,HttpStatus.OK);

            }catch (ResourceNotFoundException ex){
                logger.error(ex.getMessage());
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        }




        }
