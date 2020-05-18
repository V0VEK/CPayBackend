package BackendService.Controllers.MobileAPI;

import BackendService.CommonParameters.CommonParameters;
import BackendService.Controllers.ObjectsJSON.ClassesRequestJSON.CreateUserJSON;
import BackendService.Controllers.ObjectsJSON.ClassesResponseJSON.StatusResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInController {
    CommonParameters status;

    public SignInController() {
        status = new CommonParameters();
    }

    // Create user
    @RequestMapping("create_user/mobile")
    public ResponseEntity<StatusResponse> CreateUser (@RequestBody CreateUserJSON createUserReq) {
        // TODO: Check confirmation code
        // TODO: Save user credentials to database
        StatusResponse response = new StatusResponse();
        response.setStatus(status.STATUS_OK);

        // TODO: Write log in database
        System.out.println("User " + createUserReq.getLogin() + " was created");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
