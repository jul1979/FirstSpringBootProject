package heb.esi.webg5g12345.rest;


import heb.esi.webg5g12345.business.DepotService;
import heb.esi.webg5g12345.dto.RepositoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DepotRestController {

    @Autowired
    private DepotService depotService;

    @GetMapping("/repo/{id}")
    //public ResponseEntity<DepotDto> allStudents (@PathVariable (name="id") Integer id) {
    public ResponseEntity<RepositoryDto> allStudents (@PathVariable (name="id") Integer id) {
        return new ResponseEntity<>(depotService.RepoDetail(id), HttpStatus.OK);
    }







}
