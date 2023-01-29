package pers.keter.toynjoy.service;

import org.apache.catalina.Server;
import org.springframework.stereotype.Service;
import pers.keter.toynjoy.dao.IProductDao;
import pers.keter.toynjoy.entity.Product;
import pers.keter.toynjoy.entity.ServiceResult;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    @Resource
    private IProductDao ProductDao;

    public ServiceResult getProductListPaging(int top, int num, String orderColumn, String name, String type_id) {
        ServiceResult result = new ServiceResult(false);
        List<Product> data = ProductDao.getProductListPaging(top, num, orderColumn, name, type_id);
        if (data != null){
            result.setState(true);
            result.setData(data, true, true);
        }
        else
            result.setMessage("获取商品失败！");

        return result;
    }

    public ServiceResult getCount(String name, String type_id) {
        ServiceResult result = new ServiceResult(true);
        Map<String, Object> data = new HashMap<>();
        data.put("count", ProductDao.getCount(name, type_id));
        result.setData(data, false, false);
        result.setState(true);
        return result;
    }

    public ServiceResult getNewProduct(){
        ServiceResult result = new ServiceResult(false);
        List<Product> data = ProductDao.getNewProduct();
        if (data != null){
            result.setState(true);
            result.setData(data, true, true);
        }
        else
            result.setMessage("获取商品失败！");

        return result;
    }

    public ServiceResult getBrowseProduct(){
        ServiceResult result = new ServiceResult(false);
        List<Product> data = ProductDao.getBrowseProduct();
        if (data != null){
            result.setState(true);
            result.setData(data, true, true);
        }
        else
            result.setMessage("获取商品失败！");

        return result;
    }

    public ServiceResult getPurchasesProduct(){
        ServiceResult result = new ServiceResult(false);
        List<Product> data = ProductDao.getPurchasesProduct();
        if (data != null){
            result.setState(true);
            result.setData(data, true, true);
        }
        else
            result.setMessage("获取商品失败！");

        return result;
    }

    public int addPurchasesById(String productId){
        return ProductDao.addPurchasesById(productId);
    }

    public ServiceResult getProductInWishListByUsername(String username, String productname){
        ServiceResult result = new ServiceResult(false);
        List<Product> data = ProductDao.getProductInWishListByUsername(username, productname);
        if (data != null){
            result.setState(true);
            result.setData(data, true, true);
        }
        else{
            result.setMessage("获取数据失败！");
        }
        return result;
    }

    public ServiceResult getProductInLibraryByUsername(String username, String productname){
        ServiceResult result = new ServiceResult(false);
        List<Product> data = ProductDao.getProductInLibraryByUsername(username, productname);
        if (data != null){
            result.setState(true);
            result.setData(data, true, true);
        }
        else{
            result.setMessage("获取数据失败！");
        }
        return result;
    }

}
