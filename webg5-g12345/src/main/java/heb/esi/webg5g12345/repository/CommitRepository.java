package heb.esi.webg5g12345.repository;

import heb.esi.webg5g12345.model.Commit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommitRepository extends CrudRepository<Commit,Integer> {
}
