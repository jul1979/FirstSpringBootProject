package heb.esi.webg548982.business;

import com.google.common.collect.Lists;
import heb.esi.webg548982.Model.Student;
import heb.esi.webg548982.Model.Task;
import heb.esi.webg548982.dto.StudentDto;
import heb.esi.webg548982.repository.StudentRepository;
import heb.esi.webg548982.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TaskRepository taskRepository;

    public List<StudentDto> studentList(){
         ArrayList<StudentDto> studentDtos = new ArrayList<>();
        ArrayList<Student> students = Lists.newArrayList(studentRepository.findAll());
        for (Student student:students
             ) {
            ArrayList<String> strings = new ArrayList<>();
            for (Task task:student.getTasks()){
                strings.add(task.getId());
            }
            studentDtos.add(new StudentDto(student.getName(),student.getNumber(),strings));
        }
        return studentDtos;
    }

    public StudentDto studentListBYId(String id){
       long idAsLong = Long.parseLong(id);
        return studentList().stream().filter(s-> Objects.equals(s.getId(),idAsLong)).findFirst().get();
    }

    public void updateStudent(Long sNumberAsInt, String taskId) {
     Student studentToUpdate = studentRepository.findById(sNumberAsInt).get();
     Task task = taskRepository.findById(taskId).get();
     studentToUpdate.getTasks().add(task);
     studentRepository.save(studentToUpdate);
    }
}
