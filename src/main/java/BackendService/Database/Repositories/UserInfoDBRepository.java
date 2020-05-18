package BackendService.Database.Repositories;

import BackendService.Database.Tables.UserInfoDB;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserInfoDBRepository extends CrudRepository<UserInfoDB, Integer> {

    public List<UserInfoDB> findByUserLoginAndPasswordHash(String login, String passwordHash);

    public List<UserInfoDB> findByPasswordHashAndRoleId(String passwordHash, Integer roleId);
}
