package he2b.g48982.web5g.annualprogram.repositories;

import he2b.g48982.web5g.annualprogram.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
}
