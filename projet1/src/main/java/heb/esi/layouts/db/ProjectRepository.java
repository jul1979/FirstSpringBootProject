package heb.esi.layouts.db;

import heb.esi.layouts.dto.DetailDto;
import heb.esi.layouts.dto.InfoDto;
import heb.esi.layouts.dto.ProjectDto;
import heb.esi.layouts.model.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends CrudRepository<Project,String> {

    @Query("select new heb.esi.layouts.dto.ProjectDto( p.name,count(sp),p.active) from Project p left join p.sprints sp group by p.name,p.active")
    List<ProjectDto> findAllProjects();
    @Query("select new heb.esi.layouts.dto.DetailDto(sto.title,sp.id,sto.estimate) from Project p left  join p.sprints sp left join sp.stories sto WHERE p.name = ?1")
    List<DetailDto> findProjectDetail(String name);
    @Query("select new heb.esi.layouts.dto.InfoDto (p.name,count (sp) ,sum(sp.stories.size)) from Project p left join p.sprints sp  where p.name  like ?1% group by p.name")
    List<InfoDto> infoProjetRest(String name);

    Project findByName(String name);
}
