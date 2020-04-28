package BackendService.Controllers.ObjectsJSON.ClassesRequestJSON;

public class CredentialsJSON {
    String login;
    String password_hash;

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
