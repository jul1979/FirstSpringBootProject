package he2b.g48982.web5g.annualprogram.services;

import com.google.common.collect.Lists;
import he2b.g48982.web5g.annualprogram.Model.Student;
import he2b.g48982.web5g.annualprogram.dto.StudentDto;
import he2b.g48982.web5g.annualprogram.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public List<Student> allStudents() {
        Iterable<Student> iterable = studentRepository.findAll();
        return Lists.newArrayList(iterable);
    }
    private  List<Student> findStudentsByNameStartingWith(String name){
        return studentRepository.findByNameStartingWith(name);
    }

    public List<Student> filter(String number, String name, String section, String bloc) {
        List<Student> studentsSorted = Lists.newArrayList(studentRepository.findAll());
        Predicate<Student> studentsection = s -> s.getSection().name().equals(section);
        final int blocAsInt = Integer.parseInt(bloc);
        Predicate<Student> studentbloc = s -> s.getBloc().equals(blocAsInt);
        if (name!=null && !name.isEmpty()) {
            studentsSorted=findStudentsByNameStartingWith(name);
        }
            if (number!=null && !number.isEmpty()) {
                studentsSorted = studentsSorted
                        .stream()
                        .filter(s -> s.getNumber() == Integer.parseInt(number))
                        .collect(Collectors.toList());
            }
            if ( !section.equalsIgnoreCase("tous")) {
                studentsSorted = studentsSorted
                        .stream()
                        .filter(studentsection)
                        .collect(Collectors.toList());
            }
            if (blocAsInt!=0){
                studentsSorted = studentsSorted
                        .stream()
                        .filter(studentbloc)
                        .collect(Collectors.toList());
            }
            return studentsSorted;
    }
   public Student findById(Integer number){
        return studentRepository.findById(number).get();
    }

    public List<StudentDto> studentDetail(Integer studentID){
       return studentRepository.studentDetail(studentID);
    }


}
