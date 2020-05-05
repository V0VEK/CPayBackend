package BackendService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Entry point
@SpringBootApplication(scanBasePackages = "BackendService.CommonParameters, BackendService.Controllers.MobileAPI, BackendService, BackendService.Services, BackendService.Controllers.BrowserGUI")
public class SpringBootApplicationMain {
    public static void main (String [] args) {
        SpringApplication.run(SpringBootApplicationMain.class, args);
    }
}