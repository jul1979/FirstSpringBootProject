package g48982.webg5.pae.business;

import g48982.webg5.pae.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
public class CustomRepository {

  @Autowired
  // @PersistenceContext
  private EntityManager entityManager;

  @Transactional
  public Course update(Course course) {

    return entityManager.merge(course);
  }

}
