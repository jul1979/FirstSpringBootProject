package he2b.g48982.web5g.annualprogram.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    ResourceNotFoundException(Integer id){
        super("could not find student " + id);
    }
}
