package pers.keter.toynjoy.dao;

import org.apache.catalina.User;
import org.springframework.stereotype.Repository;
import pers.keter.toynjoy.entity.Users;

@Repository
public interface IUsersDao {

    Users Login (String username, String password);

    Users getUserByUserName(String username);

    int CreateUser(String name, String password, String email, String time);

}
