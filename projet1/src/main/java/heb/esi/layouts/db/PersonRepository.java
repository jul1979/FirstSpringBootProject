package heb.esi.layouts.db;

import heb.esi.layouts.dto.Name;
import heb.esi.layouts.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {

    @Query("select new heb.esi.layouts.dto.Name( p.lastName) from Person p")
    List<Name> findAllByLastName();
}
