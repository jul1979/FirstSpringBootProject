package heb.esi.webg5g12345.repository;

import heb.esi.webg5g12345.dto.DepotDto;
import heb.esi.webg5g12345.model.Commit;
import heb.esi.webg5g12345.model.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface DepotRepository extends CrudRepository<Repository,Integer> {


   // @Query("select NEW heb.esi.webg5g12345.dto.DepotDto(r.id,r.name,s.name) from Repository r join r.subscriber s join r.commits c where r.id=?1")
    @Query("select NEW heb.esi.webg5g12345.dto.DepotDto(r.id,r.name,r.subscriber.name)from Repository r  where r.id=?1 ")
    DepotDto repoDetail(Integer id);
   /* @Query("select distinct p from Parent p left join fetch p.children")
    List<Parent> findWithQuery(); */

    @Query("select  c from Repository r join r.commits c where r.id=?1")
    List<Commit> repoCommits(Integer id);

   /* Écrivez un service web qui donne le détail d’un dépôt : id, nom, nom de utilisateur et
    liste des commits.*/


}
