package g48982.webg5.pae;

import g48982.webg5.pae.business.CourseDB;
import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class PaeApplication implements CommandLineRunner {

	private static final Logger log= LoggerFactory.getLogger(PaeApplication.class);

	@Autowired
	CourseDB courseDB;

	public static void main(String[] args) {
		SpringApplication.run(PaeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//log.info("Hello");
		//log.info("liste des cours " + courseDB.findCourseByTitleContaining("ductions").toString());
	}

}
