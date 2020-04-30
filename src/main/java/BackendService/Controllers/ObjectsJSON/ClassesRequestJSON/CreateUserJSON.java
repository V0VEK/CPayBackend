package BackendService.Controllers.ObjectsJSON.ClassesRequestJSON;

public class CreateUserJSON {
    String login;
    String password_hash;
    String confirmation_code_hash;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getConfirmation_code_hash() {
        return confirmation_code_hash;
    }

    public void setConfirmation_code_hash(String confirmation_code_hash) {
        this.confirmation_code_hash = confirmation_code_hash;
    }
}
