package BackendService.CommonParameters;

// TODO: Find secure random generator
import java.util.Random;

public class CommonServices {

    public String GenerateUserToken() {
        Random rd = new Random();
        byte[] randomBytes = new byte[32];
        // TODO: Use secure random generator
        rd.nextBytes(randomBytes);

        return FromBytesToHexString(randomBytes);
    }

    public String FromBytesToHexString(byte[] bytesArray) {
        String buff = "";
        for (byte b : bytesArray)
            buff += String.format("%02X", b);

        return buff;
    }
}
