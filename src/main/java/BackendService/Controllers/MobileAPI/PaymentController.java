package BackendService.Controllers.MobileAPI;

import BackendService.Controllers.ObjectsJSON.ClassesRequestJSON.PaymentJSON;
import BackendService.Controllers.ObjectsJSON.ClassesResponseJSON.PaymentResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentController {

    @RequestMapping("/payment")
    public ResponseEntity<PaymentResponse> ProcessPayment(@RequestBody PaymentJSON payment) {
        // TODO: delete this log
        System.out.println("session token: " + payment.getSession_token());
        System.out.println("pan: " + payment.getPan());
        System.out.println("exp_date: " + payment.getExp_date());
        System.out.println("ch_name: " + payment.getCh_name());
        System.out.println("amount: " + payment.getAmount());

        PaymentResponse paymentResponse = new PaymentResponse();
        // TODO: check payment fields
        if (payment.getAmount() == null ||
        payment.getCh_name() == null ||
        payment.getExp_date() == null ||
        payment.getPan() == null ||
        payment.getSession_token() == null) {
            paymentResponse.setPayment_status("Error");
        }
        else {
            // TODO: change status
            paymentResponse.setPayment_status("Success");
        }

        return new ResponseEntity<>(paymentResponse, HttpStatus.OK);
    }
}
