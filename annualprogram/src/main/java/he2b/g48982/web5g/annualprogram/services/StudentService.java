package he2b.g48982.web5g.annualprogram.services;

import com.google.common.collect.Lists;
import he2b.g48982.web5g.annualprogram.Model.Student;
import he2b.g48982.web5g.annualprogram.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

   @Autowired
    private StudentRepository studentRepository;


    public List<Student> allStudents(){
        Iterable<Student> iterable = studentRepository.findAll();
        List<Student> studentArrayList = Lists.newArrayList(iterable);
        return   studentArrayList;
    }
}
