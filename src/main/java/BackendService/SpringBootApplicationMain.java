package BackendService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Entry point
@SpringBootApplication
public class SpringBootApplicationMain {
    public static void main (String [] args) {
        SpringApplication.run(SpringBootApplicationMain.class, args);
    }
}