package BackendService.Controllers.BrowserGUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserCreationController {

    @RequestMapping("/user_creation_req/browser")
    public String CreateUserReq() {

        return "userCreation";
    }

    @RequestMapping("/user_creation/browser")
    public String CreateUser (@RequestParam(name="email") String email) {
        System.out.println("user creation email: " + email);

        return "management";
    }
}
