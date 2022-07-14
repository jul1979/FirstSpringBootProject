package heb.esi.webg6cine48982.business;

import heb.esi.webg6cine48982.db.CriticRepository;
import heb.esi.webg6cine48982.dto.ReviewDto;
import heb.esi.webg6cine48982.model.Critic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CriticService {

    @Autowired
    private CriticRepository criticRepository;

    public  List<ReviewDto> ReviewByCritic(String name) throws IllegalArgumentException{
        final Optional<Critic> criticById = criticRepository.findById(name);
        if(criticById.isEmpty())throw  new IllegalArgumentException("critic is unknown");
        return criticRepository.reviewData(name);
    }
    public Critic findCriticByName(String name){
        return criticRepository.findById(name).get();
    }

    public void update(Critic currentCritic) {
        criticRepository.save(currentCritic);
    }
}
