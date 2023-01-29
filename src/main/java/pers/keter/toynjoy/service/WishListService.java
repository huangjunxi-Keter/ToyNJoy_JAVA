package pers.keter.toynjoy.service;

import org.springframework.stereotype.Service;
import pers.keter.toynjoy.dao.ILibraryDao;
import pers.keter.toynjoy.dao.IWishListDao;
import pers.keter.toynjoy.entity.Library;
import pers.keter.toynjoy.entity.ServiceResult;
import pers.keter.toynjoy.entity.WishList;

import javax.annotation.Resource;

@Service
public class WishListService {

    @Resource
    IWishListDao WishListDao;

    public ServiceResult getByProductIdAndUsername(String username, String productId) {
        WishList data = WishListDao.getByProductIdAndUsername(username, productId);
        ServiceResult result = new ServiceResult(false);
        if (data != null){
            result.setState(true);
            result.setData(data, true, false);
        }
        else{
            result.setMessage("获取数据失败");
        }
        return result;
    }

    public int DeleteByProductIdAndUsername(String username, String productId){
        return WishListDao.DeleteByProductIdAndUsername(username, productId);
    }

}
