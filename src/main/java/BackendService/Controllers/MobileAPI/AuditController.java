package BackendService.Controllers.MobileAPI;

import BackendService.Controllers.ObjectsJSON.ClassesRequestJSON.AuditJSON;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditController {

    @RequestMapping("/audit")
    public ResponseEntity<String> WriteAuditTrail(@RequestBody AuditJSON logEntry) {
        System.out.println("log: " + logEntry.getLog_entry());
        String res;
        if (logEntry.getLog_entry() == null) {
            res = "Error";
        }
        else {
            res = "OK";
        }

        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
