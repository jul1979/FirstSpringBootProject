package heb.esi.layouts.db;

import heb.esi.layouts.model.Sprint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SprintRepository extends CrudRepository<Sprint,Integer> {
}
