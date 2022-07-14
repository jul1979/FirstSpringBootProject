package heb.esi.webg6cine48982.db;

import heb.esi.webg6cine48982.dto.ReviewDto;
import heb.esi.webg6cine48982.model.Critic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CriticRepository extends CrudRepository<Critic,String> {

    @Query("select NEW heb.esi.webg6cine48982.dto.ReviewDto(m.title,r.rate,m.id) from Critic c left join c.reviews r join r.movie m where c.name=?1")
    List<ReviewDto> reviewData(String name);

   /* @Query("select  NEW webg5.g48982.spotify.dto.ArtistDto (a.login,a.name,count (s.id)) from Artist a left join a.tracks s group by a.name")
    List<ArtistDto> artistsInfo();*/




}
