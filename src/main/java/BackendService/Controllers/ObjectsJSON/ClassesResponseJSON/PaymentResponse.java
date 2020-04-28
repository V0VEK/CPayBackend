package BackendService.Controllers.ObjectsJSON.ClassesResponseJSON;

// TODO: Enumerate all possible payment statuses
// TODO: Maybe add more fields
public class PaymentResponse {
    String payment_status;

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }
}
