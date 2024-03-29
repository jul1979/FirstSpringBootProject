package heb.esi.layouts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LayoutsApplication {
    public static final Logger log= LoggerFactory.getLogger(LayoutsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LayoutsApplication.class, args);
    }

}
