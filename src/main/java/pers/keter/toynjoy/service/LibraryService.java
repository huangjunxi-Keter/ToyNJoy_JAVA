package pers.keter.toynjoy.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.keter.toynjoy.dao.ILibraryDao;
import pers.keter.toynjoy.entity.Library;
import pers.keter.toynjoy.entity.ServiceResult;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class LibraryService {

    @Resource
    private ILibraryDao LibraryDao;
    @Resource
    private WishListService wishListService;
    @Resource
    private ShoppingCarService shoppingCarService;
    @Resource
    ProductService productService;

    public ServiceResult getByProductIdAndUsername(String username, String productId) {
        Library data = LibraryDao.getByProductIdAndUsername(username, productId);
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

    @Transactional
    public ServiceResult CreateLibraryByUsernmae(String username, String productId){
        ServiceResult result = new ServiceResult(false);
        try{
            LibraryDao.CreateLibraryByUsername(username, productId, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            productService.addPurchasesById(productId);
            wishListService.DeleteByProductIdAndUsername(username, productId);
            shoppingCarService.DeleteByProductIdAndUsername(username, productId);
            result.setState(true);
        }catch (Exception e){
            result.setMessage(e.getMessage());
        }
        return result;
    }

}
