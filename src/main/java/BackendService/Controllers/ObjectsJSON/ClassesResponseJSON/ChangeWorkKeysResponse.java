package BackendService.Controllers.ObjectsJSON.ClassesResponseJSON;

public class ChangeWorkKeysResponse {
    String keys_cryptograms_list;
    String kcv_list;
    String status;

    public String getKeys_cryptograms_list() {
        return keys_cryptograms_list;
    }

    public void setKeys_cryptograms_list(String keys_cryptograms_list) {
        this.keys_cryptograms_list = keys_cryptograms_list;
    }

    public String getKcv_list() {
        return kcv_list;
    }

    public void setKcv_list(String kcv_list) {
        this.kcv_list = kcv_list;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
