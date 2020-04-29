package BackendService.Controllers.ObjectsJSON.ClassesRequestJSON;

public class KeysKCVListJSON {
    String session_token;
    String kcv_list;

    public String getSession_token() {
        return session_token;
    }

    public void setSession_token(String session_token) {
        this.session_token = session_token;
    }

    public String getKcv_list() {
        return kcv_list;
    }

    public void setKcv_list(String kcv_list) {
        this.kcv_list = kcv_list;
    }
}
