package BackendService.Database.Tables;


import javax.persistence.*;

@Entity
@Table(name = "user_info")
public class UserInfoDB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId;

    @Column(name = "user_login")
    private String userLogin;

    @Column(name="password_hash")
    private String passwordHash;

    @Column(name="token_2fa")
    private String token2Fa;

    @Column(name="session_token")
    private String sessionToken;

    @Column(name = "email")
    private String email;

    @Column(name = "role_id")
    private Integer roleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getToken2Fa() {
        return token2Fa;
    }

    public void setToken2Fa(String token2Fa) {
        this.token2Fa = token2Fa;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
