package BackendService.Controllers;

import BackendService.Controllers.ObjectsJSON.ClassesRequestJSON.CredentialsJSON;
import BackendService.Controllers.ObjectsJSON.ClassesResponseJSON.UserSessionToken;
import jdk.internal.jline.internal.Log;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;

// TODO: Find secure random generator
import java.util.Random;

@Controller
public class LoginController {

    @RequestMapping("/login")
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
            token.setSession_token(GenerateUserToken());
            token.setRole_id("some_role");

            // TODO: Delete this
            System.out.println("Generated token: " + token.getSession_token());
        }

        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    private String GenerateUserToken() {
        Random rd = new Random();
        byte[] randomBytes = new byte[32];
        // TODO: Use secure random generator
        rd.nextBytes(randomBytes);

        return FromBytesToHexString(randomBytes);
    }

    private static String FromBytesToHexString(byte[] bytesArray) {
        String buff = "";
        for (byte b : bytesArray)
            buff += String.format("%02X", b);

        return buff;
    }

}