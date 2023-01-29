package pers.keter.toynjoy.dao;

import org.springframework.stereotype.Repository;
import pers.keter.toynjoy.entity.User_Info;

@Repository
public interface IUser_InfoDao {

    User_Info getInfoByUsername(String username);

    int CreateUserInfo(String name, String wrapper_image);

}
