package pers.keter.toynjoy.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface IShoppingCarDao {

    int DeleteByProductIdAndUsername(String username, String productId);

}
