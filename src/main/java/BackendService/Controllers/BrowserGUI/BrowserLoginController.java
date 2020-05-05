package BackendService.Controllers.BrowserGUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BrowserLoginController {

    @RequestMapping (method = RequestMethod.POST, value = "/login/browser")
    public String BrowserLogin (@RequestParam(name="login") String login, @RequestParam(name="password") String password) {
        System.out.println("Check " + login + " " + password);
        // TODO: Need to implement cookie
        return "management";
    }

    @RequestMapping (method = RequestMethod.POST, value = "/login/browser/key_management")
    public String KeyManagementBrowserLogin (@RequestParam(name="passwordHash1") String passHash1, @RequestParam(name="passwordHash2") String passHash2) {
        System.out.println("hash1: " + passHash1 + " hash2: " + passHash2);

        // TODO: Check password in database
        // TODO: Create session
        return "keyManagement";
    }
}
