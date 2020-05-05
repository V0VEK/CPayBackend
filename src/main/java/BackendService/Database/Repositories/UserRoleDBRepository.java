package BackendService.Database.Repositories;

import BackendService.Database.Tables.UserRoleDB;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRoleDBRepository extends CrudRepository<UserRoleDB, Integer> {
    public List<UserRoleDB> findByRoleId(Integer id);
}
