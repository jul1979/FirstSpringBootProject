package heb.esi.webg548982.business;

import com.google.common.collect.Lists;
import heb.esi.webg548982.Model.Student;
import heb.esi.webg548982.Model.Task;
import heb.esi.webg548982.dto.StudentDto;
import heb.esi.webg548982.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentDto> studentList(){
         ArrayList<StudentDto> studentDtos = new ArrayList<>();
        ArrayList<Student> students = Lists.newArrayList(studentRepository.findAll());
        for (Student student:students
             ) {
            ArrayList<String> strings = new ArrayList<>();
            for (Task task:student.getTasks()){
                strings.add(task.getId());
            }
            studentDtos.add(new StudentDto(student.getName(),strings));
        }
        return studentDtos;
    }
}