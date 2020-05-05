package BackendService.Controllers.MobileAPI;

import BackendService.CommonParameters.CommonServices;
import BackendService.Controllers.ObjectsJSON.ClassesRequestJSON.CredentialsJSON;
import BackendService.Controllers.ObjectsJSON.ClassesResponseJSON.UserSessionToken;
import BackendService.CommonParameters.StatusList;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MobAppLoginController {
    StatusList status;
    CommonServices services;

    public MobAppLoginController() {
        this.status = new StatusList();
        this.services = new CommonServices();
    }

    @RequestMapping("/login/mobile")
    public ResponseEntity<UserSessionToken> Authorization(@RequestBody CredentialsJSON credentials) {
        // TODO: Delete this
        System.out.println(credentials.getLogin() + ":" + credentials.getPassword_hash());

        UserSessionToken token = new UserSessionToken();
        if (credentials.getPassword_hash() == null || credentials.getLogin() == null) {
            token.setSession_token("NO CREDENTIALS");
            token.setRole_id("NO_ROLE");
        }
        else {
            // TODO: Check password and login in database
            token.setSession_token(services.GenerateUserToken());
            token.setRole_id("some_role");
            token.setStatus(status.STATUS_OK);

            // TODO: Write log in database
            System.out.println("Generated token: " + token.getSession_token() + " for user " + credentials.getLogin() + " with role " + token.getRole_id());
        }

        // TODO: log authorization attempt

        return new ResponseEntity<>(token, HttpStatus.OK);
    }

}