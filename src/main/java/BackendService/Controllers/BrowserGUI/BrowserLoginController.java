package BackendService.Controllers.BrowserGUI;

import BackendService.Services.KeyManagementServices;
import BackendService.Services.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BrowserLoginController {

    LoginService loginService;
    KeyManagementServices keyManagementService;

    public BrowserLoginController(LoginService loginService, KeyManagementServices keyManagementService) {
        this.loginService = loginService;
        this.keyManagementService = keyManagementService;
    }

    @RequestMapping (method = RequestMethod.POST, value = "/login/browser")
    public String BrowserLogin (@RequestParam(name="login") String login, @RequestParam(name="password_hash") String passwordHash) {
        System.out.println("Check " + login + " " + passwordHash);
        String roleName = loginService.GetUserRoleByLoginAndPassHash(login, passwordHash);

        if (roleName.equals("NULL")) {
            return "home";
        }
        // TODO: Need to implement cookie

        System.out.println("Right password. Granted role: " + roleName);
        return "management";
    }


    // TODO: Maybe need to segregate key management and user management
    @RequestMapping (method = RequestMethod.POST, value = "/login/browser/key_management")
    public String KeyManagementBrowserLogin (@RequestParam(name="passwordHash1") String passHash1, @RequestParam(name="passwordHash2") String passHash2) {
        System.out.println("hash1: " + passHash1 + " hash2: " + passHash2);

        if (loginService.IsValidKeyManagerCredentials(passHash1, passHash2)){
            return "keyManagement";
        }

        // TODO: Check password in database
        // TODO: Create session
        return "keyManagementLogin";
    }

    @RequestMapping ("/check")
    public void Check() {
        keyManagementService.GenerateKeyTMK();
    }
}
