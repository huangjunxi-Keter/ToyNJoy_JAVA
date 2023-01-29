package pers.keter.toynjoy.service;

import org.springframework.stereotype.Service;
import pers.keter.toynjoy.dao.IShoppingCarDao;
import pers.keter.toynjoy.dao.IWishListDao;
import pers.keter.toynjoy.entity.ServiceResult;
import pers.keter.toynjoy.entity.WishList;

import javax.annotation.Resource;

@Service
public class ShoppingCarService {

    @Resource
    IShoppingCarDao ShoppingCarDao;

    public int DeleteByProductIdAndUsername(String username, String productId){
        return ShoppingCarDao.DeleteByProductIdAndUsername(username, productId);
    }

}
