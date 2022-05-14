package g48982.webg5.pae.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Hello implements CommandLineRunner {

  @Autowired
  private StudentDB studentDB;

  @Override
  public void run(String... args) throws Exception {
    /*
     * long max=15;
     * for (Object[]a:
     * studentDB.findStudentWithCreditsGreaterThanJPQL(max)) {
     * HelloRestJSON.log.info("log:nom"+ a[0].toString());
     * }
     */
  }
}
