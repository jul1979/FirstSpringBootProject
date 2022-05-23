package heb.esi.webg5g12345.business;


import com.google.common.collect.Lists;
import heb.esi.webg5g12345.dto.DepotDto;
import heb.esi.webg5g12345.dto.RepositoryDto;
import heb.esi.webg5g12345.model.Commit;
import heb.esi.webg5g12345.model.Repository;
import heb.esi.webg5g12345.repository.CommitRepository;
import heb.esi.webg5g12345.repository.DepotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DepotService {

    @Autowired
    private DepotRepository depotRepository;

    @Autowired
    private CommitRepository commitRepository;

   public List<Repository> allRepo(){
        return  Lists.newArrayList(depotRepository.findAll());
    }

    //public DepotDto RepoDetail(Integer id){
    public RepositoryDto RepoDetail(Integer id){
        DepotDto depotDto = depotRepository.repoDetail(id);
        List<Commit> commits = depotRepository.repoCommits(id);
        //return depotRepository.repoDetail(id);
        return new RepositoryDto(depotDto,commits) ;
    }


    public void saveEntity(Commit commit, Integer id) {
       Repository repository = depotRepository.findById(id).get();
       commit.setDate(LocalDate.now());
       commit.setRepository(repository);
       commitRepository.save(commit);
       repository.getCommits().add(commit);
        //System.out.println(repository);
       //commitRepository.save(commit);
       depotRepository.save(repository);

   }
}
