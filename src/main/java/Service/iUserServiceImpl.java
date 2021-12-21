package Service;

import Entity.UserEntity;

import java.util.List;

public interface iUserServiceImpl extends IUserService {
    UserEntity addNewUser(UserEntity user);

    List<UserEntity> fetchAllUsers();

    UserEntity findUserByCpr(Integer cpr);

    UserEntity updateUser(int cpr, UserEntity user);

    Boolean deleteUser(int cpr);
}
