package BackendService.Controllers.MobileAPI;

import BackendService.Controllers.ObjectsJSON.ClassesRequestJSON.KeyInitJSON;
import BackendService.Controllers.ObjectsJSON.ClassesRequestJSON.KeysKCVListJSON;
import BackendService.Controllers.ObjectsJSON.ClassesResponseJSON.ChangeWorkKeysResponse;
import BackendService.Controllers.ObjectsJSON.ClassesResponseJSON.StatusResponse;
import BackendService.StatusList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KeyManagementMobile {
    StatusList status;

    @RequestMapping("/key_init/mobile")
    public ResponseEntity<StatusResponse> KeyInit (@RequestBody KeyInitJSON keyInitReq) {
        StatusResponse response = new StatusResponse();
        // TODO: Check session token

        // TODO: Check key by KCV in database
        response.setStatus(status.STATUS_OK);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping("/key_delete/mobile")
    public ResponseEntity<StatusResponse> KeyDelete (@RequestBody KeysKCVListJSON keysDeleteReq) {
        // TODO: Check session token

        StatusResponse response = new StatusResponse();
        // TODO: Check keys by KCV in database
        response.setStatus(status.STATUS_OK);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping("/key_change/mobile")
    public ResponseEntity<ChangeWorkKeysResponse> ChangeWorkKeys (@RequestBody KeysKCVListJSON keysChangeReq) {
        // TODO: Check session token

        ChangeWorkKeysResponse response = new ChangeWorkKeysResponse();
        //TODO: Check keys by KCV in database
        response.setStatus(status.STATUS_OK);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
