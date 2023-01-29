package pers.keter.toynjoy.dao;

import org.springframework.stereotype.Repository;
import pers.keter.toynjoy.entity.Friend;

import java.util.List;

@Repository
public interface IFriendDao {

    List<Friend> getFriendByUserName(String username);

}
