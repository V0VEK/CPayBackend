package BackendService.Services;

import BackendService.CommonParameters.CommonParameters;
import BackendService.Database.Repositories.UserInfoDBRepository;
import BackendService.Database.Repositories.UserRoleDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginService {
    @Autowired
    private UserInfoDBRepository userInfoDBRepository;

    @Autowired
    UserRoleDBRepository userRoleDBRepository;

    public String GetUserRoleByLoginAndPassHash(String login, String passHash) {
        if (userInfoDBRepository.findByUserLoginAndPasswordHash(login, passHash).isEmpty()){
            System.out.println("NULL");
            return "NULL";
        }
        return userRoleDBRepository.findByRoleId(userInfoDBRepository.findByUserLoginAndPasswordHash(login, passHash).get(0).getRoleId()).get(0).getRoleName();
    }

    public Boolean IsValidKeyManagerCredentials(String passHash1, String passHash2) {
        if (userInfoDBRepository.findByPasswordHashAndRoleId(passHash1, CommonParameters.ROLE_KEY_MANAGER).isEmpty() || userInfoDBRepository.findByPasswordHashAndRoleId(passHash2, CommonParameters.ROLE_KEY_MANAGER).isEmpty()) {
            // TODO: Maybe check who's password is wrong
            System.out.println("Wrong password for key manager");
            return false;
        }
        System.out.println("Right password");
        return true;
    }




    // TODO: Delete this
    public String Check(String login, String passHash) {
        if (userInfoDBRepository.findByUserLoginAndPasswordHash(login, passHash).isEmpty()) {
            return "WTH!";
        }
        else {
            return "LOL!";
        }
    }
}
