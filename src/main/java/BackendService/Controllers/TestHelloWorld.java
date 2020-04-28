package BackendService.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestHelloWorld {

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        System.out.println("Test logging!");
        return "Hello World!";
    }

}