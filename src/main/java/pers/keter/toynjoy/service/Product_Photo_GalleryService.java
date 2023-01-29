package pers.keter.toynjoy.service;

import org.springframework.stereotype.Service;
import pers.keter.toynjoy.dao.IProduct_Photo_GalleryDao;
import pers.keter.toynjoy.entity.Product_Photo_Gallery;
import pers.keter.toynjoy.entity.ServiceResult;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Product_Photo_GalleryService {

    @Resource
    IProduct_Photo_GalleryDao Product_Photo_GalleryDao;

    public ServiceResult getListByProductID(String product_id) {
        List<Product_Photo_Gallery> data = Product_Photo_GalleryDao.getListByProductID(product_id);
        ServiceResult result = new ServiceResult(false);
        if (data != null){
            result.setState(true);
            result.setData(data, true, true);
        }
        else{
            result.setMessage("获取数据失败");
        }
        return result;
    }

}
