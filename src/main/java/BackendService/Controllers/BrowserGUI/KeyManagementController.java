package BackendService.Controllers.BrowserGUI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KeyManagementController {

    // TODO: Maybe add cookie
    @RequestMapping("/key_management_login_redirect")
    public String KeyManagementLoginRedirect() {

        return "keyManagementLogin";
    }

    @RequestMapping("/key_init/browser")
    public String KeyCreation(@RequestParam(name = "email1") String email1, @RequestParam(name = "email2") String email2) {
        // TODO: Check session
        System.out.println("email1: " + email1 + " email2: " + email2);

        return "keyManagement";
    }

    @RequestMapping("/key_init_req/browser")
    public String KeyInitRequest() {
        // TODO: Implement a cookie

        return "keyCreation";
    }
}
