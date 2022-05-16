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
        List<Student> studentArrayList = Lists.newArrayList(iterable);
        return studentArrayList;
    }
    private  List<Student> findStudentsByNameStartingWith(String name){
        return studentRepository.findByNameStartingWith(name);
    }

    private List<Student> findByBloc(String bloc){
      return studentRepository.findByBloc(Integer.parseInt(bloc));
    }



    public List<Student> filter(String number, String name, String section, String bloc) {
        List<Student> studentsSorted = Lists.newArrayList(studentRepository.findAll());
        Predicate<Student> startWith = s -> s.getName().startsWith(name.toUpperCase());
        Predicate<Student> studentsection = s -> s.getSection().name().equals(section);
        Predicate<Student> studentbloc = s -> s.getBloc().equals(Integer.parseInt(bloc));
        if (!name.isEmpty()) {
           // studentsSorted=findStudentsByNameStartingWith(name);
             studentsSorted = studentsSorted.stream()
                    .filter(startWith)
                    .collect(Collectors.toList());
        }
            if (!number.isEmpty()) {
                studentsSorted = studentsSorted
                        .stream()
                        .filter(s -> s.getNumber() == Integer.parseInt(number))
                        .collect(Collectors.toList());
            }

            if (!section.isEmpty() && !section.equalsIgnoreCase("tous")) {
                studentsSorted = studentsSorted
                        .stream()
                        .filter(studentsection)
                        .collect(Collectors.toList());
            }

            if (!bloc.isEmpty() && !bloc.equalsIgnoreCase("tous")){
                studentsSorted=findByBloc(bloc);
               /* studentsSorted = studentsSorted
                        .stream()
                        .filter(studentbloc)
                        .collect(Collectors.toList());*/
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
