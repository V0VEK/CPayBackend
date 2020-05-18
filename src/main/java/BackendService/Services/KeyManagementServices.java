package BackendService.Services;

import BackendService.CommonParameters.CommonParameters;
import BackendService.CommonParameters.CommonServices;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class KeyManagementServices {
    CommonServices commonServices;

    public KeyManagementServices(CommonServices commonServices) {
        this.commonServices = commonServices;
    }

    public void GenerateKeyTMK() {
        byte[] key = commonServices.GenerateRandomBytes(CommonParameters.KEY_LENGTH);
        System.out.println("key: " + commonServices.FromBytesToHexString(key));

        byte[] keyComponent1 = commonServices.GenerateRandomBytes(CommonParameters.KEY_LENGTH);
        System.out.println("key component 1: " + commonServices.FromBytesToHexString(keyComponent1));

        byte[] keyComponent2 = new byte[CommonParameters.KEY_LENGTH];

        int i = 0;
        for (byte b : keyComponent1) {
            keyComponent2[i] = (byte) (b ^ key[i]);
            i++;
        }
        System.out.println("key component 2: " + commonServices.FromBytesToHexString(keyComponent2));

        // TODO: delete this
        byte[] check = new byte[CommonParameters.KEY_LENGTH];
        i = 0;
        for (byte b : keyComponent1) {
            check[i] = (byte) (b ^ keyComponent2[i]);
            i++;
        }
        System.out.println("Check: " + commonServices.FromBytesToHexString(check));
    }
}
