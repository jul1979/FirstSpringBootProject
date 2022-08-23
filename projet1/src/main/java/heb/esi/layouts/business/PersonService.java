package heb.esi.layouts.business;

import com.google.common.collect.Lists;
import heb.esi.layouts.db.PersonRepository;
import heb.esi.layouts.dto.Name;
import heb.esi.layouts.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    public void save (Person person){
        personRepository.save(person);
    }
    public List<Person> allPersons(){
     return Lists.newArrayList(personRepository.findAll());
    }

    public List<Name> lastNames(){
     return personRepository.findAllByLastName();
    }
}
