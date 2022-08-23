package heb.esi.layouts.db;

import heb.esi.layouts.model.Story;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StoryRepository extends CrudRepository<Story,Integer> {
}
