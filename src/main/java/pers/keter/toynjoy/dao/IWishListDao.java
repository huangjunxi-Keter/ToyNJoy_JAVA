package pers.keter.toynjoy.dao;

import org.springframework.stereotype.Repository;
import pers.keter.toynjoy.entity.Library;
import pers.keter.toynjoy.entity.WishList;

@Repository
public interface IWishListDao {

    WishList getByProductIdAndUsername(String username, String productId);

    int DeleteByProductIdAndUsername(String username, String productId);

}
